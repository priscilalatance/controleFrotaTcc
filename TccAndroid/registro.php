<?php

require "conexao.php";

$re = "5123";
$email = "vinicius.hque@gmail.com";
$senha = "123456";

$sql_querry = "insert into usuario values ('$re', '$email', '$senha')";

if(mysqli_query($con, $sql_querry)){
    echo "Dados inseridos com sucesso!";
}
else{
    echo "Erro ao registar dados ".mysqli_error($con);
}
?>
