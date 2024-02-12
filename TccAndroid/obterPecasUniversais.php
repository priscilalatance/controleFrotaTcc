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

// Query para obter todas as peças universais
$sql = "SELECT descricaoItem FROM cadastro_item WHERE pecaUniversal = 1";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    // Adiciona cada descrição de peça à lista 'pecasUniversais'
    while ($row = $result->fetch_assoc()) {
        $pecasUniversais[] = $row['descricaoItem'];
    }
} else {
    $pecasUniversais[] = "Nenhuma peça universal encontrada.";
}

// Fecha a conexão com o banco de dados
$conn->close();

// Retorna as peças universais em formato JSON
echo json_encode($pecasUniversais);
?>
