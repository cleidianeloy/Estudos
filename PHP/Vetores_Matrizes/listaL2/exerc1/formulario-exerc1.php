<?php
//Retirando os dados da tabela e fazendo o php criar o vetor!-->
$alunos =["Maria das Graças" => 6.5 ,
"Paulo de Almeida" => 7.8 ,
 "Rogério da silva" => 4.2 ,
 'Jerusa Fontes' => 8.5 ,
 'Alícia Marques' => 9.0 ,
 "Zenon Mendes" => 4.1 ];

 //Outra maneira!-->
 $alunos = array("Maria das Graças" => 6.5 ,
"Paulo de Almeida" => 7.8 ,
 "Rogério da silva" => 4.2 ,
 'Jerusa Fontes' => 8.5 ,
 'Alícia Marques' => 9.0 ,
 "Zenon Mendes" => 4.1);

 //  Outra maneira!-->
  $alunos ["Maria das Graças"] = 6.5;
  $alunos ["Paulo de Almeida"] = 7.8;
  $alunos ["Rogério da silva"] = 4.2;
  $alunos ['Jerusa Fontes' ] = 8.5 ;
  $alunos ['Alícia Marques'] = 9.0;
  $alunos ["Zenon Mendes"] = 4.1 ;


?>

<!DOCTYPE html> 
<html lang="pt-BR"> 
<head> 
  <meta charset="utf-8"> 

  <title>Vetores em PHP  </title> 
  <link rel="stylesheet"  href="formata-vetores-matrizes.css">
</head> 

<body> 
   <h1>Vetores e matrizes com PHP - exercício 1</h1> 
   <form method="post" action="exerc1.php">
   <fieldset>
   	<legend>Processamento de notas dos alunos
   	</legend>

   	<label class="alinha">Selecione um aluno para visualizar sua nota:</label>

   	<select name="alunos">
   		<?php
   		//Gerando, automaticamente, os elementos do select a partir do vetor criado pelo PHP //

   		foreach( $alunos as $nome => $nota)
   		{
   			echo"<option> $nome</option>";
   		}
   		?>	
   	</select><br><br>

   	<label class="alinha">Forneça o nome de um aluno  a ser pesquisado:</label>
    <input type="text" name="outro-aluno" ><br><br>

    <label>Selecione uma operação:</label><br>
    <input type="radio" name="operacao" value="1"> Mostrar a nota do aluno escolhido no select.<br>

    <input type="radio" name="operacao" value="2"> Receber o nome do aluno na caixa e mostrar sua nota.<br>
   </fieldset>

   <fieldset>
    <legend>Outras operações do PHP sobre o vetor</legend>

    <input type="radio" name="operacao" value="3"> Mostrar dados no formato tabular, ordenando os alunos por ordem decrescente do nome.<br>

    <input type="radio" name="operacao" value="4"> Mostrar dados no formato tabular, ordenando os alunos por ordem crescente de nota.<br>

    <input type="radio" name="operacao" value="5"> Mostrar média de nota.<br>    

    <input type="radio" name="operacao" value="6"> Mostrar numero de alunos com nota acima da média.<br>  

    <input type="radio" name="operacao" value="7"> Mostrar a menor nota e o nome do respectivo aluno.<br>

    <input type="radio" name="operacao" value="8"> Converter o vetor em string<br>  

    <input type="radio" name="operacao" value="9"> Inserir alguns alunos no vetor e mostrar no formato tabular <br>  
   </fieldset><br>

   <button type="submit" name="enviar">Executar operação selecionada</button>
   </form>

</body> 
</html> 