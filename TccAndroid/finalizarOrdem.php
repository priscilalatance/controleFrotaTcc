<?php
// Conecta ao banco de dados (substitua os valores conforme necessário)
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "controlefrota";

// Cria a conexão
$conn = new mysqli($servername, $username, $password, $dbname);

// Verifica a conexão
if ($conn->connect_error) {
    die("Conexão falhou: " . $conn->connect_error);
}

// Obtém a placa do veículo da solicitação POST ou GET
$placaVeiculo = $_REQUEST['placaVeiculo'];

// Query para obter as duas últimas ordens de serviço com base na placa do veículo
$sql = "SELECT Id, dataCheck, tipoManutencao, kmPreventiva, produtoCorretiva, statusOrdem 
        FROM ordemservico 
        WHERE placa = '$placaVeiculo'
        ORDER BY Id DESC
        LIMIT 2";

$result = $conn->query($sql);

$dadosOrdemServico = [];

if ($result->num_rows > 0) {
    // Se ordens de serviço forem encontradas, armazena os dados em um array associativo
    while ($row = $result->fetch_assoc()) {
        $dadosOrdemServico[] = $row;
    }

    // Verifica se ambas as ordens têm o status "Fechado"
    $statusFinalizado = true;
    foreach ($dadosOrdemServico as $ordem) {
        if ($ordem['statusOrdem'] !== 'Fechado') {
            $statusFinalizado = false;
            break;
        }
    }

    // Se ambas as ordens tiverem o status "Fechado", atualize o status para "Finalizado"
    if ($statusFinalizado) {
        $updateSql = "UPDATE ordemservico SET statusOrdem = 'Finalizado' WHERE placa = '$placaVeiculo' AND statusOrdem = 'Fechado'";
        if ($conn->query($updateSql) === TRUE) {
            echo "Status das ordens de serviço atualizado para 'Finalizado' com sucesso.";
        } else {
            echo "Erro ao atualizar o status das ordens de serviço: " . $conn->error;
        }
    } else {
        echo "As ordens de serviço não estão ambas fechadas, portanto, o status não será atualizado para 'Finalizado'.";
    }
} else {
    // Se nenhuma ordem de serviço for encontrada, define uma mensagem de erro
    $dadosOrdemServico['erro'] = "Nenhuma ordem de serviço encontrada para o veículo com a placa fornecida.";
}

// Fecha a conexão com o banco de dados
$conn->close();

// Retorna os dados da ordem de serviço em formato JSON
echo json_encode($dadosOrdemServico);
?>
