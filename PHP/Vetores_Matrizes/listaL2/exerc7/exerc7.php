<!DOCTYPE>
<html>
<head>
	<title>Matrizes em PHP</title>
	<link rel="stylesheet" type="text/css" href="formata-vetores-matrizes.css">
</head>
<body>
<h1> vertores e matrizes com php - exercicio 7 </h1>
<form method="post" action="exerc7.php">

	<?php
	$i=1;
	while($i<=3)
	{
		echo"
		<fieldset>
		<legend>Dados do produto $i</legend>

		<label class='alinha'>Codigo:</label>
		<input type='text' name='codigo$i' autofocus> <br>

		<label class='alinha'>Quantidade em estoque:</label>
		<input type='number' name='quan$i' min='0'> <br>

		<label class='alinha'>Preço unitário:</label>
		<input type='number' name='preco$i' min='0' step='0.01'>
	</fieldset>
	";
	$i++;
	}

	?>

	<fieldset>
		<legend>Buscar dados do produto</legend>
		<label class="alinha">Código do produto pesquisado:</label>
		<input type="text" name="cod-pesquisa">
	</fieldset>
	
	<button type="submit" name="enviar">Cadastrar os produtos na matriz e executar todas as demais operações</button>

</form>
<?php

		if(isset($_POST["enviar"]))
		{
			///recebimento dos dados do formulário 
			
					$codigo1 =$_POST["codigo1"];
					$codigo2 =$_POST["codigo2"];
					$codigo3 =$_POST["codigo3"];

					$quant1 =$_POST["quan1"];
					$quant2 =$_POST["quan2"];
					$quant3 =$_POST["quan3"];

					$preco1 =$_POST["preco1"];
					$preco2 =$_POST["preco2"];
					$preco3 =$_POST["preco3"];

					//montando a matriz a partir das vartiáveis acima 


					$mercadorias[$codigo1]= [$quant1,$preco1];
					$mercadorias[$codigo2]= [$quant2,$preco2];
					$mercadorias[$codigo3]= [$quant3,$preco3];
					/*
					echo "<pre>";
					print_r($mercadorias);
					echo "</pre";
					*/

					//percorrendo a matriz e montando a tabela na pagina web 

					echo "<table>
					<caption>Relação de produtos em estoque </caption>
					<tr>
					<th>Código</th>
					<th>Quantidade em estoque</th>
					<th>Preço unitário</th>
					</tr>";
					foreach ($mercadorias as $codigo => $valorInterno) 
					{

						echo "<tr>
						<td>$codigo</td>
						<td>$valorInterno[0]</td>
						<td>$valorInterno[1]</td>
							</tr>";
						
					}

				echo "</table>";

				//percorrer a matriz e descobrir o produto com a maior quantidade em estoque. Para isso, criamos uma variavel de referência inicializando-a com zero 
				$maiorEstoque = 0;

				//percorrer a matriz e comparar para cada produto sua quantidade estoque com a variavel referencia. Se a quantidade em estoque do produto atual for maior que o valor da variável de referencia, fazemos a atualização


				foreach($mercadorias as $codigo => $vetorInterno)
				{
					if($vetorInterno[0]>$maiorEstoque)
					{
						$maiorEstoque =$vetorInterno[0];
						$precoMaiorEstoque = $vetorInterno[1];
						$codigoMaiorEstoque =$codigo;
					}
				}

				echo "<p> Dados da mercadoria com maior estoque: <br> Código = $codigoMaiorEstoque <br>
					Preço = $precoMaiorEstoque <br>
					Estoque = $maiorEstoque unidades<br>";

				//item c) percorrer a matriz e calcular o faturamento com a venda de todos os produtos em estoque 

				$soma = 0;
				foreach ($mercadorias as $codigo=> $vetorInterno) {
					
					$soma= $soma + $vetorInterno[0]* $vetorInterno[1];
				}
				$soma=number_format($soma,2,',','.');
				echo "<p>Faturamento da loja com a venda de todos os produtos em estoque = R$ $soma </p>";


				//item d) recceber, do formulário, o código de produto e fazer o PHP mostrar os dados do referido produto, utilizando a matriz

				$codigoFornecido = $_POST['cod-pesquisa'];

				//fazendo o PHP localizar, na matriz,o codigo fornecido
				$encontrou = array_key_exists($codigoFornecido,$mercadorias);

				if($encontrou== true)
				{
					$estoque = $mercadorias[$codigoFornecido][0];
					$preco = $mercadorias[$codigoFornecido][1];

					echo "<p> Dados do produto pesquisado pelo usuário: <br>
						Codigo = $codigoFornecido <br>
						Preço = $preco <br>
						Quantidade em estoque = $estoque unidades. </p>";
				}
				else
				{
					echo "<p> O código fornecido pelo usuário $codigoFornecido não foi encontrado na matriz. </p>";
				}

		}

		
	

?>
</body>
</html>