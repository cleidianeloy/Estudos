<!DOCTYPE html>
<html>
<head>
	<title>plantas</title>
	<link rel="stylesheet" type="text/css" href="funcoes-includes.css">
</head>
<body>
<h1>exercicio 4 - lista 4</h1>

<form method="post" action="exerc4.php">
	<fieldset>
		<?php
		$i=1;
		while ($i<=5) { 
			echo    " 
					<label class='alinha'>Informe o codigo da planta </label>
					<input type='text' name='codigo$i'><br>
					<label class='alinha'>Informe o nome da planta</label>
					<input type='text' name='nome$i'><br>
					<label class='alinha'>Informe o estoque ideal</label>
					<input type='number' name='estoqueIdeal$i' min='0'><br>
					<label class='alinha'>Informe o estoque existente</label>
					<input type='number' name='estoqueHoje$i' min='0'><br><br>
			";
				
			$i++;	
		}
		
		?>
		<button type="submit" name="enviar">Enviar</button>
	</fieldset>
</form>
<?php
if(isset($_POST['enviar']))
{
	$codigo1 = $_POST['codigo1'];
	$codigo2 = $_POST['codigo2'];
	$codigo3 = $_POST['codigo3'];
	$codigo4 = $_POST['codigo4'];
	$codigo5 = $_POST['codigo5'];

	$nome1 = $_POST['nome1'];
	$nome2 = $_POST['nome2'];
	$nome3 = $_POST['nome3'];
	$nome4 = $_POST['nome4'];
	$nome5 = $_POST['nome5'];

	$estoqueIdeal1 = $_POST['estoqueIdeal1'];
	$estoqueIdeal2 = $_POST['estoqueIdeal2'];
	$estoqueIdeal3 = $_POST['estoqueIdeal3'];
	$estoqueIdeal4 = $_POST['estoqueIdeal4'];
	$estoqueIdeal5 = $_POST['estoqueIdeal5'];

	$estoqueHoje1 = $_POST['estoqueHoje1'];
	$estoqueHoje2 = $_POST['estoqueHoje2'];
	$estoqueHoje3 = $_POST['estoqueHoje3'];
	$estoqueHoje4 = $_POST['estoqueHoje4'];
	$estoqueHoje5 = $_POST['estoqueHoje5'];

	$plantas[$codigo1] =[$nome1,$estoqueIdeal1,$estoqueHoje1];
	$plantas[$codigo2] =[$nome2,$estoqueIdeal2,$estoqueHoje2];
	$plantas[$codigo3] =[$nome3,$estoqueIdeal3,$estoqueHoje3];
	$plantas[$codigo4] =[$nome4,$estoqueIdeal4,$estoqueHoje4];
	$plantas[$codigo5] =[$nome5,$estoqueIdeal5,$estoqueHoje5];

	

	

	include'exerc4.inc.php';

	foreach ($plantas as $codigo => $valorInterno) {
		if(is_null($valorInterno[1]))
		{
			$valorInterno[1]=0;
		}
		if(is_null($valorInterno[2]))
		{
			$valorInterno[2]=0;
		}
	}

	$plantas[$codigo1][]= calcularEstoque($estoqueIdeal1,$estoqueHoje1); //forma de fazer mais um campo na matriz
	$plantas[$codigo2][]= calcularEstoque($estoqueIdeal2,$estoqueHoje2);
	$plantas[$codigo3][]= calcularEstoque($estoqueIdeal3,$estoqueHoje3);
	$plantas[$codigo4][]= calcularEstoque($estoqueIdeal4,$estoqueHoje4);
	$plantas[$codigo5][]= calcularEstoque($estoqueIdeal5,$estoqueHoje5);

	/*echo "<pre>";
	print_r($plantas);
	echo "</pre>";*/

//mostrar os dados em uma tabela que contem o codigo, o nome e a quantidade a ser adquirida da planta 

	echo "<table>
	<caption>Dados das plantas </caption>
	<tr>
	<th>Codigo</th>
	<th>Nome</th>
	<th>Quantidade a ser adquirida no estoque</th>
	</tr>
	";

foreach ($plantas as $codigo => $valorInterno) {
	echo"<tr>
              <td>$codigo</td>
              <td>$valorInterno[0]</td>
              <td>$valorInterno[3]</td>
            </tr>";
}
	echo "</table>";

	

}
?> 

</body>
</html>