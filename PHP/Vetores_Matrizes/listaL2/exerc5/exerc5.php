<!DOCTYPE html>
<html>
<head>
	<title></title>
	<link rel="stylesheet" type="text/css" href="formata-vetores-matrizes.css">
</head>
<body>
	<h1>Vetores e matrizes com PHP - exercicio 5</h1>
	<?php
		
		$alunos["1010-X1"] = ["Joana de Almeida", 6, 5.5];
		$alunos["1010-X2"] = ["Joâo de Ataíde", 7.5, 7.8];
		$alunos["1010-X3"] = ["Maria das Graças",8.3, 9.6];
		$alunos["1010-X4"] = ["Caroline Prado", 4.2, 6.1];
	?>
	
	<form method="post" action="exerc5.php">
		<fieldset>
		<label>Escolha uma matricula:</label>
		<select name="matricula" >
		<?php
		foreach ($alunos as $matricula => $interno) {
			echo"<option>$matricula</option>";
		}

			

		?>

		</select><br> <br>
		<label>Escolha uma opção</label><br>
		<input type="radio" name="operacao" value="1"> Mostrar as informações do aluno escolhido no select  e sua média final <br> 
		<input type="radio" name="operacao" value="2">Mostrar, no formato tabular, os dados dos alunos APROVADOS<br>
		<input type="radio" name="operacao" value="3">Mostrar os dados do aluno-destaque<br>
		
		</fieldset>
		<button type="submit" name="enviar">Pronto!</button>

	
	</form>
	<?php
		 
		if(isset($_POST["enviar"]))
		{
			$operacao = $_POST["operacao"];
			if($operacao =="1")
			{
				$matric = $_POST["matricula"];
				$mediaDasProvas= $alunos[$matric][1];
				$mediaDosExercicios = $alunos[$matric][2];
				$mediaFinal= ($mediaDasProvas*7+ $mediaDosExercicios *3)/10;
				$aluno = $alunos[$matric][0];

				echo "<p> Desempenho do aluno:<br>
					  Nome = <span> $aluno </span> <br>
					  Matricula = <span> $matric </span> <br>
					  Média das provas = <span> $mediaDasProvas </span><br>
					  Média dos exercicios = <span> $mediaDosExercicios </span> <br>
					  Media final = <span> $mediaFinal </span> </p>";

			}
			if($operacao =="2")
			{
				//criar uma matriz auxiliar que armazena, temporariamente, os dados pedidos pelo exercicio, mas somente dos alunos que tiveram nmédia final maior ou igual a 6

				$matrizAuxiliar = array();

				//percorrendo a matriz $alunos com o foreach
				foreach($alunos as $matric => $vetorInterno)
				{
					$mediaDasProvas = $vetorInterno[1];
					$mediaDosExercicios = $vetorInterno[2];
					$mediaFinal = ($mediaDasProvas * 7 + $mediaDosExercicios *3)/10;
					$aluno = $vetorInterno[0];

						if($mediaFinal >= 6)
						{
							//aluno está aprovado, Guardamos a matricula, o nome e o valor da media final 
							$matrizAuxiliar[$matric]= [$aluno, $mediaFinal];
						}

						
						}

						if(empty($matrizAuxiliar))
						{
							echo"<p> Nenhum dado a ser mostrado, pois todos os alunos foram reprovados. </p>";
						}else
						{
							echo "<table>
								  <caption>Relação de alunos aprovados</caption>
								  <tr>
								  <th>Matricula</th>
								  <th>Aluno</th>
								  <th>Média Final </th>";

								  //vamos percorrer a matriz auxliar
								  foreach ($matrizAuxiliar as $matricula => $vetorInterno) {

								  	$aluno = $vetorInterno[0];
								  	$mediaFinal = $vetorInterno [1];
								  	echo "<tr>
								  		  <td> $matricula </td>
								  		  <td>$aluno </td>
								  		  <td> $mediaFinal</td>
								  		  </tr>";
								  }
								  echo"</table>";

						}


				}
				//testar o botão de radio value 3
				if($operacao== "3")
				{
					// para facilitar a descoberta do aluno com a maior média final, criamos um vetor temporário que armazena a média final e a matricula (indice) de cada um dos alunos, a seguir, usamos a função max()sobre este vetor temporário auxiliar, obtendo assim, a melhor média da turma e o numero de matricula do aluno que atingiu a melhor média
					$vetorAuxiliar=array();
					foreach($alunos as $matricula => $vetorInterno)
					{
							$mediaFinal = ($vetorInterno[1] * 7 + $vetorInterno[2] * 3/10);
							
							//guardamos esta média no vetor auxiliar, usando a matricula como índice 
							
							$vetorAuxiliar[$matricula] = $mediaFinal;
						
					}
					
					///chamamos a função max() sobre o vetor auxiliar e descobrimos a maior média final 
					
					$maiorMediaFinal = max($vetorAuxiliar);
					
					//retornando a maior media 
					
					$matriculaAlunoDestaque = array_search($maiorMediaFinal,$vetorAuxiliar);
					
					
					//finalmente com a matricula do aluno-destaque, vamos até a matriz original e descobrimos o nome do referido aluno 
					
					$nomeAlunoDestaque = $alunos[$matriculaAlunoDestaque][0];
					
					echo "<p> Dados do melhor aluno da classe: <br> 
					Matricula= <span>
					$matriculaAlunoDestaque </span> <br>
					Nome = <span> $nomeAlunoDestaque</span> <br>
					Média final = <span>$maiorMediaFinal </span> </p>";
				}
			
			
		}
		?>

	
	
</body>
</html>