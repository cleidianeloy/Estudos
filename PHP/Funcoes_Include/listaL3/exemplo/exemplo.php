<?php
	//declaração do cabeçalho e do corpo da função
	function converterDolar($quantDolar, $taxaCambio)
	{
		$valorConvertido = $quantDolar * $taxaCambio;
		//$valorConvertido é uma variável local, assim como os parâmetros 
		return $valorConvertido;
	}
?>
<!DOCTYPE html>
<html>
<head>
	<title>funcçoes de usuário em PHP</title>
	<link rel="stylesheet" type="text/css" href="funcoes-includes.css">
</head>
<body>
<h1>Exemplo prático do uso de funçoes de usuário em PHP</h1>

<form method="post" action="exemplo.php">
	<?php
	$i=1;
	while($i<=3)
	{
		echo"
			<fieldset>
			<legend>Conversão de câmbio $i</legend>
			<label class='alinha'>forneça a quantidade de dólares a ser convertida: </label>
			<input type='number' name='quant$i' min='0' step='0.01' autofocus> <br>
			<label class='alinha'>Forneça a taxa de câmbio</label>
			<input type='number' name='taxa$i' min='0' step='0.01'><br>
			</fieldset>";
		$i++;
	}
	?>
	<button type='submit' name='enviar'>Executar</button>
</form>

<?php
//declarando o corpo e o cabeçaçho da função que escreve os resultador das conversões na página web
function mostrarResultados($dolar, $cambio, $convertido)
{
	echo "<p>  Quantidade de dólares = $$dolar <br>
		  taxa de câmbio = R$$cambio <br>
		  Quantidade em reais = R$$convertido </p> ";

}
if(isset($_POST['enviar']))

{
	$quantDolar1 = $_POST["quant1"];
	$quantDolar2 = $_POST["quant2"];
	$quantDolar3 = $_POST["quant3"];

	$taxaCambio1 = $_POST["taxa1"];
	$taxaCambio2 = $_POST["taxa2"];
	$taxaCambio3 = $_POST["taxa3"];

	$quantconvertida1 = converterDolar($quantDolar1,$taxaCambio1); //invocar função
	$quantconvertida2 = converterDolar($quantDolar2,$taxaCambio2); 
	$quantconvertida3 = converterDolar($quantDolar3,$taxaCambio3); 


	echo "<p>Resultado das conversões de câmbio: </p>";
	/*echo "<p> Conversão 1:<br>
		  Quantidade de dólares = $quantDolar1 <br>
		  taxa de câmbio = R$$taxaCambio1 <br>
		  Quantidade em reais = R$$quantconvertida1 </p> ";

	echo "<p> Conversão 2:<br>
		  Quantidade de dólares = $quantDolar2 <br>
		  taxa de câmbio = R$$taxaCambio2 <br>
		  Quantidade em reais = R$$quantconvertida2 </p> ";

	echo "<p> Conversão 3:<br>
		  Quantidade de dólares = $quantDolar3 <br>
		  taxa de câmbio = R$$taxaCambio3 <br>
		  Quantidade em reais = R$$quantconvertida3 </p> "; // jeito normal de fazer sem função
 */
	//convertendo as chamadas do comando echo em função que não tem uma variavel 

	mostrarResultados($quantDolar1, $taxaCambio1, $quantconvertida1);
	mostrarResultados($quantDolar2, $taxaCambio2, $quantconvertida2);
	mostrarResultados($quantDolar3, $taxaCambio3, $quantconvertida3);

}
?>

	
</body>
</html>