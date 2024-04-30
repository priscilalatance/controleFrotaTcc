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

// Verifica se o parâmetro 'numero' foi fornecido na URL
if (!isset($_GET['numero']) || empty($_GET['numero'])) {
    die("Parâmetro 'numero' não encontrado ou vazio.");
}

// Obtém o valor do parâmetro 'numero' da URL
$numero = $_GET['numero'];

// Consulta para obter o último ID inserido na tabela 'ordemservico' com tipoManutencao = 'Corretiva'
$query = "SELECT Id FROM ordemservico WHERE tipoManutencao = 'Corretiva' ORDER BY Id DESC LIMIT 1";
$result = $conn->query($query);

if ($result && $result->num_rows > 0) {
    $row = $result->fetch_assoc();
    $ultimoId = $row["Id"];
    
    // Insere o valor de 'numero' e o último ID obtido na coluna 'cadastro_Item_IdCodigo' da tabela 'ordem_cadastro'
    $sql = "INSERT INTO ordem_produto (fk_IdOrdem, fk_IdCodigo) VALUES ('$ultimoId', '$numero')";
    
    if ($conn->query($sql) === TRUE) {
        echo "Registro inserido com sucesso";
    } else {
        echo "Erro ao inserir registro: " . $conn->error;
    }
} else {
    echo "Nenhum resultado encontrado para tipo de manutenção 'Corretiva'";
}

// Fecha conexão
$conn->close();
?>
