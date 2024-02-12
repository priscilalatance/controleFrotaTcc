<?php

require "conexao.php";

$email = $_POST["login_email"];
$senha = $_POST["login_senha"];

$sqli_query = "SELECT re FROM usuario WHERE email LIKE '$email' AND senha LIKE '$senha';";

$result = mysqli_query($con, $sqli_query);

if(mysqli_num_rows($result) > 0){
    // Usuário encontrado, login bem-sucedido
    echo "Login_Success";
} else {
    // Usuário ou senha incorreto
    echo "Login_Failed";
}

?>

