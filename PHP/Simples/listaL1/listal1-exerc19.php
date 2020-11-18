<!DOCTYPE html> 
<html lang="pt-BR"> 
<head> 
  <meta charset="utf-8"> 
  <title>  </title> 
</head> 

<body> 
    <h1>fundamentos do PHP - lista de exercicios L1 - exercicio 19</h1>

   <?php
   //receber os dados do formulário 
   $compra= $_GET["compra"];
	 $pagamento=$_GET["pagamento"];
   $sorteio=isset($_GET["sorteio"]);
   
   if($sorteio==true)
    {
      $mensagem="o cliente está participando do sorteio";
     
    }else
    {
      $mensagem="o cliente <strong>não</strong> está participando do sorteio";
    }
    if($pagamento=="a vista")
    {
       $aumento=0;
      $desconto=$compra*0.05;
      $porque="teve um desconto de 5% pela compra a vista<br>";

    }else
    {
      $desconto=0;
      $aumento=$compra*0.02;
      $porque="teve um acrescimo de 2% pela compra a prazo<br>";
    }
    $compra=$compra-$desconto+$aumento;
    echo"O valor a pagar é: $compra<br> $porque";
    echo"$mensagem";

  
   ?>
</body> 
</html> 