<!DOCTYPE html> 
<html lang="pt-BR"> 
<head> 
  <meta charset="utf-8"> 
  <title>  </title> 
</head> 

<body> 
    <h1>fundamentos do PHP - lista de exercicios L1 - exercicio 18</h1>

   <?php
   //receber os dados do formulário 
   $compra= $_GET["compra"];
	 $pagamento=$_GET["pagamento"];
   $domiciliar=isset($_GET["domiciliar"]);
   
   if($domiciliar==true)
    {
      $aumento=$compra*0.02;
     
    }else
    {
      $aumento=0;
    }
    if($pagamento=="sim")
    {

      $desconto=$compra*0.05;

    }else
    {
      $desconto=0;
    }
    $compra=$compra-$desconto+$aumento;
    echo"O valor a pagar é: $compra";

  
   ?>
</body> 
</html> 