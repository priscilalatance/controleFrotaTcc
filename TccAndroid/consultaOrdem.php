<?php
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
} else {
    // Se nenhuma ordem de serviço for encontrada, define uma mensagem de erro
    $dadosOrdemServico['erro'] = "Nenhuma ordem de serviço encontrada para o veículo com a placa fornecida.";
}

// Fecha a conexão com o banco de dados
$conn->close();

// Retorna os dados da ordem de serviço em formato JSON
echo json_encode($dadosOrdemServico);
?>
