<!DOCTYPE html>
<html>
<head>
	<title>Formulário</title>
</head>
<body>
<h1> formulário - exercicio 4 </h1>
<link rel="stylesheet" type="text/css" href="formata-vetores-matrizes.css">

<form method="post" action="exerc4.php">
	<fieldset>
	<label class="alinha">Diga o primeiro nome </label>
	<input type="text" name="nome1">
	<label class="alinha">Diga a sua idade </label>
	<input type="number" name="idade1" min=0>
	<label class="alinha">Diga o segundo nome</label>
	<input type="text" name="nome2">
	<label class="alinha">Diga sua idade</label>
	<input type="number" name="idade2" min=0>
	<br><br>
	<button type="submit" name="enviar">Ok!</button>
	</fieldset>
	
</form>

<?php

	if(isset($_POST["enviar"]))
	{
		$nome1=$_POST["nome1"];
		$nome2=$_POST["nome2"];
		$idade1=$_POST["idade1"];
		$idade2=$_POST["idade2"];

		$alunos=[$nome1=>$idade1,
				 $nome2=> $idade2];

	  echo "<table>
	  <caption>Relação de alunos e suas idades</caption>
	  <tr>
	  <th>Nomes</th>
	  <th>Idades</th>
	  </tr>"	;			 	
	  foreach ($alunos as $nome => $idade) {
	  	echo"<tr>
			 <td>$nome </td>]
			 <td> $idade </td>
			 </tr>";
	    }
	  echo "</table>";
	  $existe=array();
	  foreach ($alunos as $nome => $idade) {

	    		if($idade<18)
	    		{
	    			$existe[$nome] = $idade;
	    		}

	    		
	   }
	   		 if(empty($existe))
	    		{
	    			echo "<p>Não há alunos menores de 18 anos </p>";
	    		}else
	    		{ 
	    			
	    			echo"<table>
					  <caption>alunos menores de 18 anos</caption>
					  <tr>
					  <th>Nome(s)</th>
					  <th>Idade(s)</th>
					  </tr>";	
	    			foreach ($existe as $nome => $idade) {
	    				echo"<tr>
						 <td>$nome </td>]
						 <td>$idade </td>
						 </tr>";
	    				
	    		}
	    		}
	    $maior=max($alunos);
	    $nomeMaior= array_search($maior, $alunos);

	    echo "<p>a pessoa mais velha é:<br> $nomeMaior com $maior anos";  	
	}
?>
</body>
</html>