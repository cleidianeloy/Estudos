<!DOCTYPE html>
<html>
<head>
	<title>exercicio 3</title>
	<link rel="stylesheet" type="text/css" href="funcoes-includes.css">
</head>
<body>
	<h1>Raiz quadrada dos numeros</h1>
<form method="POST" action="exerc3.php">
	<fieldset>
		<label>forneça o primeiro numero:</label>
		<input type="number" name="N1" >
		<label>forneça o segundo numero:</label>
		<input type="number" name="N2" >
		<button type="submit" name="enviar">ok!</button>
	</fieldset>
	
</form>
<?php
include "exerc3.inc.php";
		function Erro($numero1,$numero2)
		{
				$resultadoDoTeste1 = filter_var($numero1,FILTER_VALIDATE_INT);
				$resultadoDoTeste2 = filter_var($numero2,FILTER_VALIDATE_INT);
				if($resultadoDoTeste1 === false or $resultadoDoTeste1<0)
				{
					$resultado1 = false;
				}else
				{
					$resultado1 = true;
				}
				if($resultadoDoTeste2 === false or $resultadoDoTeste2<0)
				{
					$resultado2 = false;
				}else
				{
					$resultado2 = true;
				}

				if ($resultado1 === true && $resultado2 === true)
				{
					return true;
				}else
				{
					return false;
				}



		}

		if(isset($_POST['enviar']))

		{

			 $N1=$_POST['N1'];
			 $N2=$_POST['N2'];
		  		
			 $teste = Erro($N1,$N2);

			 if ($teste == false)
			 {
			 	echo "Desculpe, você colocou um valor inválido";
			 }else
			 {
			 	$raizQuadrada1 =  raizquadrada($N1);
			 	$raizQuadrada2 =  raizquadrada($N2);

			 	echo "<p>a raiz quadrada de $N1 é $raizQuadrada1 <br>A raiz quadrada de $N2 é $raizQuadrada2</p>";
			 }
				

		}
	
?>
</body>
</html>