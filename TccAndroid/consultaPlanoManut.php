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

// Query para obter os dados do veículo com base na placa
$sql = "SELECT marca, modelo, motor, anoModelo, anoFabricacao, KmAtual, KmManutRealizado
        FROM veiculo
        WHERE placa = '$placaVeiculo'";

$result = $conn->query($sql);

if ($result->num_rows > 0) {
    // Retorna os dados do veículo em formato JSON
    $dadosVeiculo = $result->fetch_assoc();
} else {
    $dadosVeiculo = array("erro" => "Veículo não encontrado com a placa fornecida.");
}

// Fecha a conexão com o banco de dados
$conn->close();

// Retorna os dados do veículo em formato JSON
echo json_encode($dadosVeiculo);
?>
