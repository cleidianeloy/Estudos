<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<form method="post" action="exerc3.php">
	<link rel="stylesheet" type="text/css" href="formata-vetores-matrizes.css">
	<h1>Formulario</h1>	
	<fieldset>
		<legend>Dados do funcionário 1</legend>
		<label class="alinha">Matricula1: </label>
		<input type="text" name="matric1" autofocus><br>
		<label class="alinha">Salário 1</label>
		<input type="number" name="sal1" min="0" step=0,01>
	</fieldset>
	<fieldset>
	<legend>Dados do funcionário 2</legend>
		<label class="alinha">Matricula2: </label>
		<input type="text" name="matric2" autofocus=""><br>
		<label class="alinha">Salário 2</label>
		<input type="number" name="sal2" min="0" step=0,01>
	</fieldset>
	<fieldset>
		<legend>Dados do funcionário 3</legend>
		<label class="alinha">Matricula3: </label>
		<input type="text" name="matric3" autofocus=""><br>
		<label class="alinha">Salário 3</label>
		<input type="number" name="sal3" min="0" step=0,01>

	</fieldset>		

		


		<button type="submit" name="enviar">enviar</button>


	
	</form>
	 
	<?php
	//sempre que misturamos, em um unico arquivo, o formulário HTML, com o processamento de dados deste formulário PHP, devemos fazer com que o código que dependa dos dados inseridos pelo usuário no form seja somente executado após o php o clique do botão submit 
	if(isset($_POST["enviar"]))
	{
	    //echo "<p> Este texto aqui so devera ser mostrado pelo navegador, isto é, enviada pelo php ao cliente, após o usúario clicar no botão submit.</p>";

		$matric1=$_POST["matric1"];
		$matric2=$_POST["matric2"];
		$matric3=$_POST["matric3"];

		$sal1= $_POST["sal1"];
		$sal2= $_POST["sal2"];
		$sal3= $_POST["sal3"];

		//criando o vetor a partir das seis variaveis simples

		$funcionarios=[$matric1 => $sal1,
					   $matric2 => $sal2,
					   $matric3 => $sal3];

		/*mostrar o vetor na pagina web 
		echo "<pre>;
		print_r($funcionarios);" 
		echo "<pre>;*/

		//mostrar, no formato tabular, a matricula e o salário dos funcionários que ganham menos de R$998,00

		//vamos criar um vetor auxiliar que ira guardar as informações somente dos funcionários que ganham menos de 998 

		$vetorTemp = [];

		foreach($funcionarios as $matric => $sal)
		{
			if($sal < 998)
			{
				$vetorTemp[$matric] = $sal;
			}
		}

		// agora, testamos o vetor temporário, se ele for nulo significa que não há nenhum funcionario no vetor que ganhe menos que R$998,00.

		if(empty($vetorTemp))
		{
			echo "<p> Nenhum Funcionario recebe abaixo de R$998,00 reais</p>";
		}else
		{
			//criar um cabeçalho da tabela na pagina web

			echo "<table>
			<caption>Relação de funcionarios com salário ABAIXO de R$998,00</caption>
			<tr>
			<th>Matricula</th>
			<th>Salário</th>
			</tr>";

			foreach ($vetorTemp as $matric => $sal){
				echo "<tr>
					  <td>$matric </td>]
					  <td> $sal </td>
					  </tr>";

			}

			echo "</table>";


		}


	}
	
	?>
</body>
</html>