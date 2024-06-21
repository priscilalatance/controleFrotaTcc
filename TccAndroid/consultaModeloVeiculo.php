<?php
// Conecta ao banco de dados
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "controlefrota";

// Obtém a placa do veículo da solicitação POST ou GET
$placaVeiculo = $_REQUEST['placaVeiculo'];

// Cria a conexão
$conn = new mysqli($servername, $username, $password, $dbname);

// Verifica a conexão
if ($conn->connect_error) {
    die("Conexão falhou: " . $conn->connect_error);
}

// Query para buscar o modelo do carro com base na placa
$sql = "SELECT modelo FROM veiculo WHERE placa = '$placaVeiculo'";

$result = $conn->query($sql);

$modeloCarro = "";

if ($result->num_rows > 0) {
    // Se houver resultados, obtém o modelo do primeiro resultado
    $row = $result->fetch_assoc();
    $modeloCarro = $row['modelo'];
} else {
    // Se nenhum resultado for encontrado, define um valor padrão
    $modeloCarro = "Modelo não encontrado para a placa fornecida.";
}

// Fecha a conexão com o banco de dados
$conn->close();

// Retorna o modelo do carro
echo $modeloCarro;
?>
