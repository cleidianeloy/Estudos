<?php
//usando base64_encode
$senha = 'senha';
echo base64_encode($senha);
//para retornar
$senha= 'c2VuaGE=';
echo "<br>",  base64_decode($senha);

//usando md5()
/*Sua sintaxe é string md5 ( valor [, booleano] );
E como resultado retorna uma string de 32 caracteres 
com valor hexadecimal ou 16 caso seja passado 
o argumento booleano como TRUE, mas por default é 
FALSE. E não há decodificação. */
$senha = 'senha';
echo "<br>", md5($senha);

//metodo crypt()

$password = crypt($senha, "rl"); //senha criptografada e o salt
?>
<form method="post">
	<input type="senha" name="senha"><br>
	<button type="submit" name="enviar">enviar</button>
</form>
<?php
 if(isset($_POST["enviar"])){
 	$user_input = $_POST["senha"];

 	if(crypt($user_input,$password)==$password){
 		//comparando crypt(senhaPassada, senhaCriptografada ) com a senha criptografada ela consegue reconhecer se está certo ou não
 		echo "sucesso, senha correta";
 	}else
 	{
 		echo "falha, senha incorreta";
 	}
 }
 ?>



