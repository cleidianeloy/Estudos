<?php
function recebendo($text){
	return $_POST[$text];
}
function contando($ceps){
	$auxiliar=[];
	$auxiliar=array_count_values($ceps);

	foreach ($auxiliar as $cep => $quantidade) {
		if($quantidade != 1)
		{
			echo "<p>Existem pessoas que moram no mesmo cep <br>
			A quantidade de pessoas que moram no mesmo CEP é de $quantidade pessoas
			<br>elas moram no cep: $cep</p>";		  
		}	
	}
}

function ordenando($matriz)
{
	ksort($matriz);

	echo"<table>
	         <caption>Relação da agenda pessoal</caption>
	         <tr>
			     <th>Nome</th>
			     <th>Cep</th>
			     <th>Cidade</th>
	         </tr> ";

    foreach ($matriz as $nome => $interno) {
        echo"<tr>
         	  	<td>$nome</td>
             	<td>$interno[0]</td>
             	<td>$interno[1]</td>";
       	echo"</tr>";
         }

    echo"</table>";
		
}


?>