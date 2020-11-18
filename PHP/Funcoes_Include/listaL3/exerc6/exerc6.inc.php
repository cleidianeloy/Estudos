
<?php

	function calcularIMC($peso,$altura)
	{
		$imc = $peso/($altura*$altura);
		$imcFormatado = number_format($imc,1,",",".");
		return $imcFormatado;
	}
	function resultadoFinal($imc)
	{
		$resultado = "";
		if($imc < 18.5)
		{
			$resultado = "abaixo do peso";
		}else
		if($imc >= 18.5 && $imc < 25)
		{
			$resultado = "peso normal";
		}else
		if($imc >= 25 && $imc < 30)
		{
			$resultado = "sobrepeso";
		}else
		if($imc >=30 && $imc < 35)
		{
			$resultado = "obesidade grau 1";
		}else
		if($imc >=35 && $imc <40)
		{
			$resultado = "obesidade grau 2";
		}else
		if($imc>=40)
		{
			$resultado = "obesidade grau 3";
		}
		return $resultado;
	}
	function mensagem($imc, $resultado){

		$mensagem = "<p>O imc calculado é de $imc <br> com a situação de $resultado</p>";
		return $mensagem;
	}