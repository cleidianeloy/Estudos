<!DOCTYPE html>
<html>
<head>
	<title>Formulário</title>
	<link rel="stylesheet" type="text/css" href="formata-vetores-matrizes.css">
</head>
<body>
	<?php 
	$populacao = [
	"Florianópolis" => "477000",
	"São Paulo" => "12100000",
	"João Pessoa"=>"720950",
	"Salvador" => "2670000",
	"Porto Alegre" => "1480000"];
	?>
<h1>formulário - Lista 2 - Exercicio 2</h1>
<form method="post" action="exerc2.php">
	<fieldset>
		<label>Escolha uma Capital:</label> <br>
		<?php
			foreach ($populacao as $capitais => $numero) {

				echo "<br><input type='radio' name='nome-capitais' value='$capitais'> $capitais </input><br>";
			}
		?>
		<label><br>Escreva o nome da capital aqui:</label>
		<input type="text" name="escrito">
	</fieldset>
	<fieldset>
		<label>Escolha uma opção:</label>
		<select name="elementos">
			
			<option value="1">Mostrar a população da capital</option>
			<option value="2">Relação de capitais e suas populações (crescente)</option>
			<option  value="3">Relação de capitais e suas populações (decrescente)</option>
			<option value="4">Capital da caixa de texto existe no vetor</option>
			<option  value="5">Média populacional</option>
			<option  value="6">Capitais abaixo da média</option>
			<option  value="7">Maior população e sua capital</option>
			<option value="8">Converter o vetor em uma string</option>
			<option value="9">Adicionar, manualmente, mais algumas capitais ao vetor</option>
		</select>

	</fieldset>
	<button type="submit" name="enviar">Pronto!</button>
</form>
</body>
</html>

