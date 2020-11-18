<!DOCTYPE html> 
<html lang="pt-BR"> 
<head> 
  <meta charset="utf-8"> 
  <title>  </title> 
</head> 

<body>
		<?php
		//criar a  matriz - matrícula do aluno, nome e curso que frequenta
		$exemplo["1010-1"] = array("Maria", "CTDS");
		$exemplo["1010-2"] = array("João", "CSTGTI");
		
		//agora, por exemplo, se eu quiser, dentro da matriz, para cada aluno, inserir a estring "Aprovado" ou "Reprovado", com a matriz já contruída, posso fazer isto aqui:
		$exemplo["1010-1"][] = "Aprovada";
		$exemplo["1010-2"][] = "Reprovado";
		
		/*este método funciona tanto se o vetor interno tiver índice numérico quanto se você estiver usando o vetor interno com índice associativo. O problema de inserir valores em uma matriz já pronta é que você precisa inserir os dados manualmente linha por linha, dentro de cada célula do arquivo interno. Claro, isso se os valores a serem inseridos forem diferentes entre si, que é o teu caso. Se os valores forem iguais, pode-se usar o foreach, assim:
			foreach($exemplo as $matric => $vetorInterno)
				$vetorInterno[] = "Aprovado";*/
		echo "<pre>";
				
		print_r($exemplo);
		
		echo "</pre>";
	?>
    
</body> 
</html> 