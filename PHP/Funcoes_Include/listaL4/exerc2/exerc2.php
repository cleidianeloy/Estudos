<?php
function recebendo($text){
	return $_POST[$text];
}
function contando($ceps){
	$auxiliar=[];
	$auxiliar=array_count_values($ceps);

	foreach ($auxiliar as $cep => $quantidade) {
		if($quantidade != 1)
		{
			echo "<p>Existem pessoas que moram no mesmo cep <br>
			A quantidade de pessoas que moram no mesmo CEP é de $quantidade pessoas
			<br>elas moram no cep: $cep</p>";		  
		}	
	}
}

function ordenando($matriz)
{
	ksort($matriz);

	echo"<table>
	         <caption>Relação da agenda pessoal</caption>
	         <tr>
			     <th>Nome</th>
			     <th>Cep</th>
			     <th>Cidade</th>
	         </tr> ";

    foreach ($matriz as $nome => $interno) {
        echo"<tr>
         	  	<td>$nome</td>
             	<td>$interno[0]</td>
             	<td>$interno[1]</td>";
       	echo"</tr>";
         }

    echo"</table>";
		
}


?>
<!DOCTYPE html>
<html>
<head>
	<title>exercicio 1</title>
	<link rel="stylesheet" type="text/css" href="funcoes-includes.css">
</head>
<body>
<form method="post" action="exerc2.php">
	<fieldset>
		
		<?php
		$i=1;
		while ($i<=3) {
		echo "<label class='alinha'>informe o nome da $i º pessoa</label>
		<input type='text' name='nome$i'><br>
		<label class='alinha'>informe o CEP da $i º pessoa</label>
		<input type='number' name='cep$i' min=0><br>
		<label class='alinha'>informe o nome da cidade da $i º pessoa</label>
		<input type='text' name='cidade$i'><br><br>";	

		$i++;
		}
		?>
		<button type="submit" name="enviar">enviar</button>
	</fieldset>
</form>

<?php 
if (isset($_POST['enviar'])) {

		$nome1 = recebendo('nome1');
		$nome2 = recebendo('nome2');
		$nome3 = recebendo('nome3');
		$cep1  = recebendo('cep1');
		$cep2 = recebendo('cep2');
		$cep3 = recebendo('cep3');
		$cidade1 = recebendo('cidade1');
		$cidade2 = recebendo('cidade2');
		$cidade3 = recebendo('cidade3');
		
		$clientes[$nome1]=[$cep1,$cidade1];
		$clientes[$nome2]=[$cep2,$cidade2];
		$clientes[$nome3]=[$cep3,$cidade3];
		
		$ceps=array($cep1,$cep2,$cep3); 
		
		contando($ceps);
		ordenando($clientes);
		

		

}
	
?>
</body>
</html>