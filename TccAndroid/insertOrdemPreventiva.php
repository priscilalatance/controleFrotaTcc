<?php
date_default_timezone_set('America/Sao_Paulo');

// Conecta ao banco de dados
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "controlefrota";

$conn = new mysqli($servername, $username, $password, $dbname);

// Verifica a conexão
if ($conn->connect_error) {
    die("Conexão falhou: " . $conn->connect_error);
}

// Verifica se os dados do formulário estão presentes
if(isset($_REQUEST['placaVeiculo']) && isset($_REQUEST['email']) && isset($_REQUEST['senha'])) {
    // Obtém os dados do formulário usando POST ou GET
    $placaVeiculo = $_REQUEST['placaVeiculo'];
    $email = $_REQUEST['email'];
    $senha = $_REQUEST['senha'];

    // Consulta o RE do usuário com o email e senha fornecidos
    $consultaRE = "SELECT re FROM usuario WHERE email = '$email' AND senha = '$senha'";
    $resultadoConsulta = $conn->query($consultaRE);

    if ($resultadoConsulta->num_rows > 0) {
        // Se a consulta retornar algum resultado, obtemos o RE do usuário
        $row = $resultadoConsulta->fetch_assoc();
        $reUsuario = $row['re'];

        // Query para obter todos os KmManutencao da tabela planomanutencao com base na placa
        $sql = "SELECT p.KmManutencao, v.vencimentoGarantia
                FROM veiculo v
                INNER JOIN planomanutencao p ON v.marca = p.marca AND v.modelo = p.modelo AND v.anoModelo = p.anoModelo
                WHERE v.placa = '$placaVeiculo' 
                AND p.KmManutencao <= v.KmAtual 
                AND p.KmManutencao > v.KmManutRealizado";

        $result = $conn->query($sql);

        $dadosKmManutencao = [];
        $statusOrdem = '';
        $listaKmManutencao = '';

        if ($result->num_rows > 0) {
            while ($row = $result->fetch_assoc()) {
                $kmManutencao = $row['KmManutencao'];
                $listaKmManutencao .= $kmManutencao . ',';
                $dadosKmManutencao[] = "\r\n" ."Plano de Manutenção: " . $kmManutencao . "\r\n" . "                                      ";
            }
            $listaKmManutencao = rtrim($listaKmManutencao, ',');

            $vencimentoGarantia = strtotime($row['vencimentoGarantia']);
            $dataAtual = strtotime(date('Y-m-d'));

            if ($vencimentoGarantia > $dataAtual) {
                $statusOrdem = 'Na Garantia';
            } else {
                $statusOrdem = 'Aberto';
            }
        } else {
            $statusOrdem = 'Fechado';
            $dadosKmManutencaoString = "KmManutencao não encontrado para o veículo com a placa fornecida.";
        }

        $dataCheck = date('Y-m-d');

        // Insere a ordem de serviço
        $sqlInsert = "INSERT INTO ordemservico (placa, dataCheck, tipoManutencao, statusOrdem, kmPreventiva, re) 
                      VALUES ('$placaVeiculo', '$dataCheck', 'Preventiva', '$statusOrdem', '$listaKmManutencao', '$reUsuario')";

        if ($conn->query($sqlInsert) === TRUE) {
            echo "Ordem de serviço inserida com sucesso!";
        } else {
            echo "Erro ao inserir ordem de serviço: " . $conn->error;
        }
    } else {
        echo "Usuário não encontrado.";
    }
} else {
    echo "Faltam dados no formulário.";
}

$sqlUltimoRegistro = "SELECT Id, kmPreventiva FROM ordemservico WHERE tipoManutencao = 'Preventiva' ORDER BY Id DESC LIMIT 1";

$resultUltimoRegistro = $conn->query($sqlUltimoRegistro);

if ($resultUltimoRegistro->num_rows > 0) {
    while($row = $resultUltimoRegistro->fetch_assoc()) {
        $ultimoId = $row["Id"];
        $kmPreventiva = $row["kmPreventiva"];
        
        // Separar os números
        $numeros = explode(",", $kmPreventiva);
        
        // Consultar o ID do plano de manutenção para cada número de km preventiva
        foreach ($numeros as $numero) {
            // Consulta SQL para obter o ID do plano de manutenção
            $sqlConsultaIdPlano = "SELECT idPlano 
                                   FROM veiculo v
                                   INNER JOIN planomanutencao p ON v.marca = p.marca AND v.modelo = p.modelo AND v.anoModelo = p.anoModelo
                                   WHERE v.placa = '$placaVeiculo' 
                                   AND p.KmManutencao = $numero";

            // Executa a consulta SQL
            $resultConsultaIdPlano = $conn->query($sqlConsultaIdPlano);

            if ($resultConsultaIdPlano->num_rows > 0) {
                while ($rowConsulta = $resultConsultaIdPlano->fetch_assoc()) {
                    // Obtém o ID do plano de manutenção
                    $idPlano = $rowConsulta["idPlano"];

                    // Insere o ID do plano de manutenção na tabela ordem_plano
                    $sqlInsertOrdemPlano = "INSERT INTO ordem_plano (fk_idPlano, fk_idOrdem) VALUES ('$idPlano', '$ultimoId')";

                    // Executa a instrução SQL de inserção
                    if ($conn->query($sqlInsertOrdemPlano) === TRUE) {
                        echo "Registro inserido com sucesso na tabela ordem_plano <br>";
                    } else {
                        echo "Erro ao inserir registro na tabela ordem_plano: " . $conn->error . "<br>";
                    }
                }
            } else {
                echo "Nenhum resultado encontrado para a consulta do ID do plano de manutenção com KmManutencao $numero <br>";
            }
        }
    }
} else {
    echo "Nenhum resultado encontrado para tipo de manutenção 'Preventiva'";
}

$conn->close();
