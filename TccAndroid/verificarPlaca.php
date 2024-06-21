<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "controlefrota";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Conexão falhou: " . $conn->connect_error);
}

$placa_veiculo = isset($_GET['placa']) ? $_GET['placa'] : '';

if (empty($placa_veiculo)) {
    die("Parâmetros inválidos");
}

$sql = "SELECT vencimentoGarantia FROM veiculo WHERE placa = ?";
$stmt = $conn->prepare($sql);

if ($stmt) {
    $stmt->bind_param("s", $placa_veiculo);
    $stmt->execute();
    $result = $stmt->get_result();

    if ($result->num_rows > 0) {
        $row = $result->fetch_assoc();
        $vencimentoGarantia = $row['vencimentoGarantia'];
        $dataAtual = date("Y-m-d");

        if ($vencimentoGarantia > $dataAtual) {
            echo "Placa encontrada. O veículo deve ser enviado para concessionaria.";
        } else {
            echo "Placa encontrada.";
        }
    } else {
        echo "Placa não encontrada";
    }

    $stmt->close();
} else {
    echo "Erro na preparação da declaração: " . $conn->error;
}

// Fechar conexão
$conn->close();
?>
