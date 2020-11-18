<?php

//retirando os dados da tabela e fazendo o PHP criar o vetor
$alunos = ["Maria das Graças" => 6.5,
					 "Paulo de Almeida" => 7.8,
					 "Rogério da Silva" => 4.2,
					 "Jerusa Fonte" => 8.5,
					 "Alicia Marques" => 9.0,
					 "Zenon Mendes" => 4.1];
/*outra maneira: 
$alunos = array("Maria das Graças" => 6.5,
					 "Paulo de Almeida" => 7.8,
					 "Rogério da Silva" => 4.2,
					 "Jerusa Fonte" => 8.5,
					 "Alicia Marques" => 9.0,
					 "zenon Mendes" => 4.1); 
outra maneira:
$alunos["Maria das Graças"]= 6.5 
$alunos["Paulo de Almeida"] = 7.8,
$alunos["Rogério da Silva" ]= 4.2,
$alunos["Jerusa Fonte"] = 8.5,
$alunos["Alicia Marques"] = 9.0,
$alunos["zenon Mendes" ]= 4.1); */

?>

<!DOCTYPE html> 
<html lang="pt-BR"> 
<head> 
  <meta charset="utf-8"> 
  <title> Vetores em PHP </title> 
<link rel="stylesheet" href="formata-vetores-matrizes.css">
	</head> 

<body> 
    <h1> Vetores e matrizes com PHP -exercicio 1 </h1>
		<form method="post" action="exerc01.php">
		<fieldset>
		<legend>Processamento de notas dos alunos</legend>
		<label class="alinha">Selecione um aluno para visualizar sua nota: </label>
		<select name='aluno'>
		<?php
		//gerando , automaticamente, os elementos do select a partir do vetor criado pelo PHP
		foreach($alunos as $nome => $notas)
		{
			echo "<option> $nome </option>";
		}
	
		?>
		</select> <br><br>
		<label class="alinha"> Forneça o nome de um aluno a ser pesquisado: </label>
		<input type="text" name="outro-aluno"> <br>
		<br>
		<label> Selecione uma operação: </label><br>
		<input type="radio" name="operacao" value="1">Mostrar a nota do aluno escolhido no select <br>
		<input type="radio" name="operacao" value="2">Receber o nome do aluno na caixa e mostrar sua nota <br>
		
		</fieldset>
		<fieldset>
		<input type="radio" name="operacao" value="3"> Mostrar dados no formato tabular, ordenando os alunos por ordem decrescente do nome.<br>
		<input type="radio" name="operacao" value="4">Mostrar dados no formatos tabular, ordenando os alunos por odem crescente de nota.<br>
		<input type="radio" name="operacao" value="5">Mostrar média de nota.<br>
		<input type="radio" name="operacao" value="6">Mostrar o numero de alunos com nota acima da média. <br>
		</fieldset>
</body> 
</html> 