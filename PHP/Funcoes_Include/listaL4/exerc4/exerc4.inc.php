	<?php 
	function calcularEstoque($estoqueideal,$estoqueHoje)
	{
		if($estoqueHoje>$estoqueideal)
		{
			$estoqueFaltando = 0;
		}else
		{
			$estoqueFaltando = $estoqueideal - $estoqueHoje;
		}
		
		return $estoqueFaltando;

	}