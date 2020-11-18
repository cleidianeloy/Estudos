<!DOCTYPE html>
<html>
<head>
	<title>exercicio 1</title>
	<link rel="stylesheet" type="text/css" href="funcoes-includes.css">
</head>
<body>
<form method="post" action="exerc1.php">
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
		$nome1 = $_POST['nome1'];
		$nome2 = $_POST['nome2'];
		$nome3 = $_POST['nome3'];
		$cep1 = $_POST['cep1'];
		$cep2 = $_POST['cep2'];
		$cep3 = $_POST['cep3'];
		$cidade1 = $_POST['cidade1'];
		$cidade2 = $_POST['cidade2'];
		$cidade3 = $_POST['cidade3'];
		
		$clientes[$nome1]=[$cep1,$cidade1];
		$clientes[$nome2]=[$cep2,$cidade2];
		$clientes[$nome3]=[$cep3,$cidade3];
		
		$ceps=array($cep1,$cep2,$cep3); //array para guardar os dados dos ceps;
		$auxiliar=[]; //array auxiliar para contar 
		$auxiliar= array_count_values($ceps); //contando com a função 
		foreach ($auxiliar as $cep => $quantidade) {
			if($quantidade != 1)
			{
				echo "<p>Existem pessoas que moram no mesmo cep <br>
					 A quantidade de pessoas que moram no mesmo CEP é de $quantidade pessoas
					 <br>elas moram no cep: $cep</p>";	
			}
			//mostrando quantas pessoas moram no mesmo cep 
		}

		ksort($clientes);
		echo"<table>
            	<caption>Relação da agenda pessoal</caption>
            	<tr>
	            	<th>Nome</th>
	            	<th>Cep</th>
	            	<th>Cidade</th>
            	</tr> ";

         foreach ($clientes as $nome => $interno) {
         	echo"<tr>;
         	  		<td>$nome</td>
             		<td>$interno[0]</td>
             		<td>$interno[1]</td>";
          	echo"</tr>";
         }

         echo"</table>";
		

}
	
?>
</body>
</html>