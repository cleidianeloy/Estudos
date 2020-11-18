<?php
//Retirando os dados da tabela e fazendo o php criar o vetor
$alunos =["Maria das Graças" => 6.5 ,
"Paulo de Almeida" => 7.8 ,
 "Rogério da silva" => 4.2 ,
 'Jerusa Fontes' => 8.5 ,
 'Alícia Marques' => 9.0 ,
 "Zenon Mendes" => 4.1 ];
 /*retirando o vetor na pagina para uma conferencia
 echo "<pre>";
 print_r($alunos);
 echo"</pre>"*/

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
   <?php
//Receber o botão de radio que foi escolhido pelo usuario no formulario//
   $operacao = $_POST["operacao"];
   //Testar qual botão de radio foi selecionado do formulario//
   if ($operacao == "1") 
   {
     //recebeer o nome do aluno escolhido do select//
    $aluno= $_POST["alunos"];
    //acessar o vetor , localizando onome do aluno no indice e salvando o conteudo da celula em uma variavel//
    $nota=$alunos[$aluno];

    echo "<p>Caro usuario, voce selecionou , no formulario, o aluno <span> $aluno </span>, cujo a nota é igual a <span> $nota </span> </p>";
   }
   //o usuario selecionou o botão com value 2
   if($operacao == "2")
   {
      //recebendo nome do aluno da caixa de texto
      $aluno = $_POST["outro-aluno"];
      //antes de acessar o conteúdo do vetor, devemos testar se o nome do aluno digitado pelo usuário no formulário está correto e existe como indice do vetor. Para tanto, usamos o comando array_key_exists()
      $encontrou = array_key_exists($aluno, $alunos);
      //fazendo o PHP testar se a função acima encontrou, ou não, o nome do aluno fornecido no vetor

      if($encontrou == true)
      {
        $nota=$alunos[$aluno];

        echo "<p>Caro usuario, no formulario, você digitou o nome do aluno <span> $aluno </span>, cujo a nota é igual a <span> $nota </span> </p>";

      }else
      {
        echo "<p> O nosso sistema não localizou o aluno com o nome <span> $aluno </span>. Tente novamente! </p>";
      }

   }
    //testar se o PHP selecionou a operação 3 
   if($operacao == "3")
   {
      //vamos, antes de mais nada, ordanarmos o vetor, por meio do indice associativo (k). de Z para A (r), mantendo a associação entre indice e conteúdo (a)
      krsort($alunos);
      /*
      echo "<pre>";
      print_r($alunos);
      echo "</pre>"; */

      //vamos utilizar o PHP para enviar, ao navegador, o cabeçalho da tabela que irá mostrar os nomes e as notas de cada aluno

      echo"<table>
            <caption> Relação de alunos e notas, em ordem descrecente do nome do aluno </caption>
            <tr>
            <th> Aluno </th>
            <th> Nota </th>
            </tr> ";
            //vamos ao laço foreach, que irá percorrer todo o vetor e colocar os dados dentro de cada linha da tabela - corpo da tabela
      foreach ($alunos as $nomeDoAluno => $notaDoAluno) 
      {
        echo"<tr>
              <td> $nomeDoAluno </td>
              <td>$notaDoAluno </td>
            </tr>";
      }
      //fechar a tabela após o término do foreach

      echo "</table>";
    }
    //======================================================================
    if($operacao == "4")
   {
      //vamos, antes de mais nada, ordanarmos o vetor, por meio do indice associativo (k). de Z para A (r), mantendo a associação entre indice e conteúdo (a)
      asort($alunos);
      /*
      echo "<pre>";
      print_r($alunos);
      echo "</pre>"; */

      //vamos utilizar o PHP para enviar, ao navegador, o cabeçalho da tabela que irá mostrar os nomes e as notas de cada aluno

      echo"<table>
            <caption> Relação de alunos e notas, em ordem crescente da nota do aluno </caption>
            <tr>
            <th> Aluno </th>
            <th> Nota </th>
            </tr> ";
            //vamos ao laço foreach, que irá percorrer todo o vetor e colocar os dados dentro de cada linha da tabela - corpo da tabela
      foreach ($alunos as $nomeDoAluno => $notaDoAluno) 
      {
        echo"<tr>
              <td> $nomeDoAluno </td>
              <td>$notaDoAluno </td>
            </tr>";
      }
      //fechar a tabela após o término do foreach

      echo "</table>";
    }
		if($operacao == "5")
		{
			//cálculo da média de notas dos alunos
			$media = array_sum($alunos)/count($alunos);
			$mediaFormatada = number_format($media,1,",",".");
			echo "<p>media das notas dos alunos = $mediaFormatada</p>";
			
			
		}
		if($operacao=="6")
		{
			//calculando a media das notas novamente 
			$media = array_sum($alunos)/count($alunos);
			$maiornota=0;
			//criamos uma variável contadora inicando de zero, que é incrementada a medida que percorremos o vetor com laço foreach. dentro do laço, testamos a nota de cada aluno em relação a media
			foreach($alunos as $aluno => $nota)
			{ 
				if($nota>$media)
					{
						$maiornota++;
					}
			}
				echo  "<p>Resultado do processamento: <br>
				média geral da turma: $media<br>
				numero de alunos acima da média = $maiornota alunos </p>" ;
		}
		
		if($operacao=="7")
		{
			//fazendo o PHP descobrir a menor nota do vetor:
			$menorNota = min($alunos);
			echo "<p> a menor nota é: $menorNota<br>";
			//localizar o nome do aluno que tem a menor nota:
			$nomeMenor = array_search($menorNota,$alunos); 
			echo" que pertence a: $nomeMenor</p>";
			
			
			
		}
		//teste do botão de rádio número 8 - converter o vetor em uma string usamos a função implode() do PHP
		if($operacao=="8")
		{
			$umaString = implode("-",$alunos);
			echo "<p> Repare o contéudo do vetor \$alunos convertido para uma string: $umaString </p>";

		}
		if($operacao=="9")
		{
			$alunos["Tereza de Souza"]= 7.6;
			$alunos["Silvio de Castro"]=6.6;	
			echo"<table>
            <tr>
            <th> Aluno </th>
            <th> Nota </th>
            </tr> ";			
				foreach ($alunos as $nomeDoAluno => $notaDoAluno) 
      {
        echo"<tr>
              <td> $nomeDoAluno </td>
              <td>$notaDoAluno </td>
            </tr>";
      }
			echo"</table>";
			
		}
   ?>
  
  
</body> 
</html> 