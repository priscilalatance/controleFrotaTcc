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

// Verifica se o parâmetro 'universais' foi fornecido e define a condição da query
$universais = isset($_REQUEST['universais']) ? $_REQUEST['universais'] : false;

// Query para obter as peças com base na placa do veículo e na condição (universais ou específicas)
if ($universais) {
    $sql = "SELECT descricaoItem FROM cadastro_item 
            INNER JOIN veiculo ON cadastro_item.marca = veiculo.marca AND cadastro_item.modelo = veiculo.modelo
            WHERE veiculo.placa = '$placaVeiculo' AND cadastro_item.pecaUniversal = 1";
} else {
    $sql = "SELECT descricaoItem FROM cadastro_item 
            INNER JOIN veiculo ON cadastro_item.marca = veiculo.marca AND cadastro_item.modelo = veiculo.modelo
            WHERE veiculo.placa = '$placaVeiculo' AND (cadastro_item.pecaUniversal = 0 OR cadastro_item.anoFabricacao = veiculo.anoFabricacao)";
}

$result = $conn->query($sql);

if ($result->num_rows > 0) {
    // Adiciona cada descrição de peça à lista 'pecas'
    while ($row = $result->fetch_assoc()) {
        $pecas[] = $row['descricaoItem'];
    }
} else {
    $pecas[] = "Nenhuma peça encontrada para esta placa.";
}

// Fecha a conexão com o banco de dados
$conn->close();

// Retorna as peças em formato JSON
echo json_encode($pecas);
?>


