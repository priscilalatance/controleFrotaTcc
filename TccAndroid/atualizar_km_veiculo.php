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

// Obter parâmetros GET
$placa_veiculo = isset($_GET['placa']) ? $_GET['placa'] : '';
$nova_km_atual = isset($_GET['odometro']) ? intval($_GET['odometro']) : 0;

// Validação de entrada
if (empty($placa_veiculo) || $nova_km_atual <= 0) {
    die("Parâmetros inválidos");
}

// Prevenir SQL Injection usando prepared statements
$sql = "UPDATE veiculo SET KmAtual = ? WHERE placa = ?";
$stmt = $conn->prepare($sql);

if ($stmt) {
    $stmt->bind_param("is", $nova_km_atual, $placa_veiculo);
    if ($stmt->execute()) {
        echo "KmAtual atualizado com sucesso";
    } else {
        echo "Erro ao atualizar KmAtual: " . $conn->error;
    }
    $stmt->close();
} else {
    echo "Erro na preparação da declaração: " . $conn->error;
}

// Fechar conexão
$conn->close();
?>
