<!DOCTYPE html>
<html>
<head>
	<title>exercicio 8</title>
	<link rel="stylesheet" type="text/css" href="formata-vetores-matrizes.css">
</head>
<body>
<h1>exercicio 8</h1>
<form method="POST" action="exerc8.php">
	<?php //fiz uma repetição porque queria treinar e testar no php 
	$i=1;
   while($i<=4)
   {

		echo"
   
	<fieldset>
		
		<legend> Dados do $i º cliente</legend>
		<label class='alinha'> escreva o CPF </label>
		<input type='text' name='cpf$i'><br>
		<label  class='alinha'>Informe o nome do cliente </label>
		<input type='text' name='nome$i'><br>
		<label  class='alinha'>Informe o valor da compra</label>
		<input type='number' name='compra$i' min='0' step='0.01'><br>
		<label  class='alinha'>Qual foi a mobilidade de pagamento?</label>
		<br>
		<input type='radio' name='pagamento$i'value='cartão' checked=''> Cartão <br>
		<input type='radio' name='pagamento$i' value='dinheiro'> Dinheiro <br>
		<input type='radio' name='pagamento$i' value='outro'> Outro <br>
	</fieldset>"; 
		$i++;
	}
	?>
	<fieldset>
		<label>escolha uma operação</label>
		<select name='operacao'>
		<option value='1'>Salvar as informações de cada cliente em uma matriz</option>
		<option value='2'> mostrar o nome e o valor da compra do cliente que efetuou a menor compra</option>
		<option value='3'>mostrar todos os dados do cliente que efetuaram pagamento com cartão de credito ou dinheiro </option>
		<option value='4'>produzir uma nova matriz com o valor da compra convertido em dotz</option>
	</select>
	</fieldset>
	
	<button type="submit" name='enviar'>Pronto!</button>
</form>

<?php 
if(isset($_POST['enviar']))
{
	$cpf1 =$_POST["cpf1"];
	$cpf2 =$_POST["cpf2"];
	$cpf3 =$_POST["cpf3"];
	$cpf4 =$_POST["cpf4"];

	$nome1 =$_POST["nome1"];
	$nome2 =$_POST["nome2"];
	$nome3 =$_POST["nome3"];
	$nome4 =$_POST["nome4"];

	$compra1 =$_POST["compra1"];
	$compra2 =$_POST["compra2"];
	$compra3 =$_POST["compra3"];
	$compra4 =$_POST["compra4"];

	$pagamento1=$_POST["pagamento1"];
	$pagamento2=$_POST["pagamento2"];
	$pagamento3=$_POST["pagamento3"];
	$pagamento4=$_POST["pagamento4"];

	$operacao=$_POST['operacao'];

	$clientes[$cpf1]=[$nome1,$compra1,$pagamento1];
			$clientes[$cpf2]=[$nome2,$compra2,$pagamento2];
			$clientes[$cpf3]=[$nome3,$compra3,$pagamento3];
			$clientes[$cpf4]=[$nome4,$compra4,$pagamento4];
	if($operacao=='1')
	{
		
			
		
		/*echo "<pre>";
		print_r($clientes);
		echo "</pre>";*/

		echo "<table>
				  <caption>Relação de clientes</caption>
					<tr>
					<th>CPF</th>
					<th>Nome</th>
					<th>Valor da Compra</th>
					<th>Tipo de pagamento</th>
					</tr>";
		foreach ($clientes as $cpf => $valorInterno) {
			echo "<tr>
					<td>$cpf</td>
					<td>$valorInterno[0]</td>
					<td>$valorInterno[1]</td>
					<td>$valorInterno[2]</td>
				  </th>";
		}
		echo "</table>";
	}

	if($operacao=='2')
	{ 
		
		/*$vetorAuxiliar=array();
		foreach ($clientes as $cpf => $valorInterno) {
		

				$vetorAuxiliar[$valorInterno[0]]=[$valorInterno[1]];

				
		}
		$menorValor=min($vetorAuxiliar);
		$menorNome=array_search($menorValor,$vetorAuxiliar);


		echo "<p> O valor da menor compra foi de $menorValor e o nome do cliente é: $menorNome</p>";
		*/ //professor, tentei fazer dessa forma e não deu certo, o $menorValor aparece como ARRAY 

		$menor=10000000000;
		
		foreach ($clientes as $cpf => $valorInterno) 
		{

			$valor=$valorInterno[1];
			if($valor<$menor)
			{
				$menor= $valor;
				$nomeMenor= $valorInterno[0];
			}

		}

		echo "<p> O valor da menor compra foi de $menor <br> O nome do cliente que fez a menor compra é: $nomeMenor</p>";
	}

	if($operacao=="3")
	{

		/*$vetorAuxiliar=array();
		if($pagamento1=="cartao" or $pagamento1=="dinheiro")
		{
			$vetorAuxiliar[$cpf1]=[$nome1,$compra1,$pagamento1];
		}

		if($pagamento2=="cartao" or $pagamento2=="dinheiro")
		{
			$vetorAuxiliar[$cpf2]=[$nome2,$compra2,$pagamento2];
		}
		if($pagamento3=="cartao" or $pagamento3=="dinheiro")
		{
			$vetorAuxiliar[$cpf3]=[$nome3,$compra3,$pagamento3];
		}
			if($pagamento4=="cartao" or $pagamento4=="dinheiro")
		{
			$vetorAuxiliar[$cpf4]=[$nome4,$compra4,$pagamento4];
		}
		
			 echo "<table>
				  <caption> Dados dos clientes que compraram com cartão de crédito ou em dinheiro</caption>
					<tr>
					<th>CPF</th>
					<th>Nome</th>
					<th>Valor da Compra</th>
					<th>Tipo de pagamento</th>
					</tr>";
		foreach ($vetorAuxiliar as $cpf => $valorInterno) {
			echo "<tr>
					<td>$cpf</td>
					<td>$valorInterno[0]</td>
					<td>$valorInterno[1]</td>
					<td>$valorInterno[2]</td>
				  </th>";
		}
		echo "</table>";
		*/
		$vetorAuxiliar= array();
		foreach ($clientes as $cpf=> $valorInterno) {
			
			if($valorInterno[2]=="dinheiro" or $valorInterno[2]=="cartão")
			{
				$vetorAuxiliar[$cpf]=[$valorInterno[0],$valorInterno[1],$valorInterno[2]];
				
			}
		}

			echo "<table>
				  <caption> Dados dos clientes que compraram com cartão de crédito ou em dinheiro</caption>
					<tr>
					<th>CPF</th>
					<th>Nome</th>
					<th>Valor da Compra</th>
					<th>Tipo de pagamento</th>
					</tr>";
		foreach ($vetorAuxiliar as $cpf => $valorInterno) {
			echo "<tr>
					<td>$cpf</td>
					<td>$valorInterno[0]</td>
					<td>$valorInterno[1]</td>
					<td>$valorInterno[2]</td>
				  </th>";
		}
		echo "</table>";
	} 
	if($operacao=='4')
	{
		foreach ($clientes as $cpf => $valorInterno) {
			if($valorInterno[2]=="outro")
			{
				if($valorInterno[1]>=4)
				{
					 
					$clientes[$cpf][1]= $valorInterno[1]/4; 
				}else
				{
					$clientes[$cpf][1]=0;
				}
				
			}else
			{
				if($valorInterno[1]>=2)
				{
					$clientes[$cpf][1]=$valorInterno[1]/2;
				}else
				{
					$clientes[$cpf][1]=0;
				}
			}

		}

	echo "<table>
				  <caption>Relação de clientes</caption>
					<tr>
					<th>CPF</th>
					<th>Nome</th>
					<th>Valor de Dotz</th>
					<th>Tipo de pagamento</th>
					</tr>";
		foreach ($clientes as $cpf => $valorInterno) {
			echo "<tr>
					<td>$cpf</td>
					<td>$valorInterno[0]</td>
					<td>$valorInterno[1]</td>
					<td>$valorInterno[2]</td>
				  </th>";
		}
		echo "</table>";
	}

	
}


?>
</body>
</html>