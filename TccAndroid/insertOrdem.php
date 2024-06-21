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

// Recebe os dados do formulário usando GET
$placaVeiculo = $_GET['placa_veiculo'];
$dataCheck = date('Y-m-d'); // Obtém a data atual do sistema no formato 'Y-m-d'
$itensSelecionados = $_GET['itens_selecionados'];

$email = $_GET['email'];
$senha = $_GET['senha'];

// Consulta o ID do usuário com o email e senha fornecidos
$consultaUsuario = "SELECT re FROM usuario WHERE email = '$email' AND senha = '$senha'";
$resultadoConsulta = $conn->query($consultaUsuario);

if ($resultadoConsulta->num_rows > 0) {
    // Se a consulta retornar algum resultado, obtemos o RE do usuário
    $row = $resultadoConsulta->fetch_assoc();
    $reUsuario = $row['re'];

    // Verifica se $itensSelecionados está vazio
    if (empty($itensSelecionados)) {
        // Define o statusOrdem como 'Fechado'
        $statusOrdem = 'Fechado';
    } else {
        $statusOrdem = 'Aberto'; // Ou defina qualquer outro valor padrão
    }

    // Prepara a consulta SQL para inserir a ordem de serviço
    $sql = "INSERT INTO ordemservico (placa, dataCheck, tipoManutencao, statusOrdem, re) 
            VALUES ('$placaVeiculo', '$dataCheck', 'Corretiva', '$statusOrdem', '$reUsuario')";

    // Executa a consulta SQL
    if ($conn->query($sql) === TRUE) {
        echo "Registro inserido com sucesso!";
    } else {
        echo "Erro ao inserir registro: " . $conn->error;
    }
} else {
    echo "Usuário não encontrado.";
}

// Fecha conexão
$conn->close();
?>
