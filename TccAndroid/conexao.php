<?php

$db_name="controlefrota";
$mysql_user = "root";
$mysql_pass= "";
$server_name="localhost"; 

$con = mysqli_connect($server_name, $mysql_user, $mysql_pass, $db_name);

if(!$con){
//echo "Erro na Conexão ".mysqli_connect_error();
} else
{
//echo "<h4>Conexão criada com sucesso!</h4>";
} 

?>