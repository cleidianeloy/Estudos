<!DOCTYPE html>
<html>
<head>
	<title>IMC</title>
	<link rel="stylesheet" type="text/css" href="funcoes-includes.css">
</head>
<body>
<h1>Calculo de IMC</h1>
<fieldset >
	<form method="post" action="exerc6.php">
	<label>Forneça seu peso</label>
	<input type="number" name="peso" min="0">
	<label>Forneça sua altura</label>
	<input type="number" name="altura" step="0.01" min="0">

<button type="submit" name="enviar">pronto!</button>
</form>
</fieldset>
	<?php
	include "exerc6.inc.php";
	if (isset($_POST["enviar"])) {
		$peso = $_POST["peso"];
		$altura = $_POST["altura"];

		$imc = calcularIMC($peso,$altura);

		$resultado = resultadoFinal($imc);

		 

		echo mensagem($imc, $resultado) ;

	}
	
	?>

</body>
</html>