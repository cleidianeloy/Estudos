<!DOCTYPE html>
<html>
<head>
	<title>resposta </title>
</head>
<body>
<?php
 $aluno= $_POST["aluno"];
 $nota1= $_POST["nota1"];
 $peso1= $_POST["peso1"];
 $nota2= $_POST["nota2"];
 $peso2= $_POST["peso2"];

$somaPeso = $peso1 + $peso2;
$media = ($nota1 * $peso1 + $nota2 * $peso2)/ $somaPeso;
 echo "Olá $aluno, a sua média é : $media ";
?> 
</body>
</html>