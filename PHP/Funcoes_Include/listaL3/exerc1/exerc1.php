<?php

	//declarando do cabeçalho e corpo da função 

	function testarValor($x)
	{
		$resultadoDoTeste = filter_var($x,FILTER_VALIDATE_INT);
		if($resultadoDoTeste === false or $resultadoDoTeste<0)
		{
			return false;
		}else
		{
			return true;
		}


	}
?>
<!DOCTYPE html>
<html>
<head>
	<title>exercicio 1</title>
	<link rel="stylesheet" type="text/css" href="funcoes-includes.css">
</head>
<body>
<h1>Funções e includes em PHP - exercicio 1</h1>
<form method="post" action="exerc1.php">
	<fieldset>	<legend>Validação de dados de formulário com fuñções de usuário em PHP</legend>
	<label>Forneça uma informação qualquer:</label>
	<input type="text" name="valor" autofocus> <br>
	<button type="submit" name="enviar">Validar numero e mostrar raiz quadrada</button>
</fieldset>
</form>
<?php

	if(isset($_POST['enviar']))
	{
		//recebendo o dado fornecido pelo usuário
		$dado = $_POST["valor"];

		//criar uma função de usuário que recebe este dado faz o teste. Vamos invocar a função que testa o dado. está função retorna, aqui, para o script principal, o valor true se o dado é válido ou o valor false, se o dado não é um número inteiro positivo ou zero

		$teste= testarValor($dado);

		
		if($teste == true)
		{
			//valor válido = vamos extrair a raiz quadrada 
			$raiz = sqrt($dado);
			$raizFormatada = number_format($raiz,2,",",".");
			echo "<p> A raiz quadrada de valor fornecido igual a <span>$dado</span> é igual a <span> $raizFormatada</span> </p>";
		}
		else
		{
			//valor inválido
			echo "<p> O valor fornecido <span> $dado </span> não é um número inteiro positivo </p>";
		}

	}
?>
</body>
</html>