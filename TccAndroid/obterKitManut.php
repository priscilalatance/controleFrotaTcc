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

// Query para obter todos os KmManutencao da tabela planomanutencao com base na placa
$sql = "SELECT p.KmManutencao
        FROM veiculo v
        INNER JOIN planomanutencao p ON v.marca = p.marca AND v.modelo = p.modelo AND v.anoModelo = p.anoModelo
        WHERE v.placa = '$placaVeiculo' 
        AND p.KmManutencao <= v.KmAtual 
        AND p.KmManutencao > v.KmManutRealizado";

$result = $conn->query($sql);

$dadosKmManutencao = [];

if ($result->num_rows > 0) {
    // Itera sobre os resultados e armazena cada KmManutencao em uma lista
    while ($row = $result->fetch_assoc()) {
        $dadosKmManutencao[] = "\r\n" ."Plano de Manutenção: " . $row['KmManutencao'] . "\r\n" . "                                      ";
    }
    // Adiciona uma quebra de linha entre cada valor diretamente no formato JSON
    $dadosKmManutencaoString = implode("\n", $dadosKmManutencao);
} else {
    // Define um valor de erro se nenhum resultado for encontrado
    $dadosKmManutencaoString = "KmManutencao não encontrado para o veículo com a placa fornecida.";
}

// Fecha a conexão com o banco de dados
$conn->close();

// Retorna os KmManutencao em formato JSON
echo $dadosKmManutencaoString;
?>
