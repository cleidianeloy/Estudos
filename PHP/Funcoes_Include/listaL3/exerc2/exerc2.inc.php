<?php
// declaração e o corpo de cada função

function adicionarNumeros($valor1, $valor2)
{
	$adicao = $valor1 + $valor2;

	return $adicao;
}
//--------------------------------------------
function calcularCubo($soma)
{
	$cubo = pow($soma, 3);
	return $cubo;
}

//---------------------------------------------
function mostrarResultados($valor1,$valor2,$soma,$cubo)
{
	echo "<p> Resultado do processamento númerico: <br>
		 Valor inteiro 1 = $valor1 <br>
		 Valor inteiro 2 = $valor2 <br>
		 Soma= $soma <br>
		 Cubo da soma = $cubo </p>";
}
?>