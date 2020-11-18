<?php 
	$populacao = [
	"Florianópolis" => "477000",
	"São Paulo" => "12100000",
	"João Pessoa"=>"720950",
	"Salvador" => "2670000",
	"Porto Alegre" => "1480000"];

 ?>
 <!DOCTYPE html>
 <html>
 <head>
 	<title>Resultado</title>
 	<link rel="stylesheet" type="text/css" href="formata-vetores-matrizes.css">
 </head>
 <body>
 <?php

   $elementos = $_POST["elementos"];
   if($elementos == "1")
    {
      $capital= $_POST["nome-capitais"];
      $quantidade=$populacao[$capital];
      $quantidadeF=number_format($quantidade,"0",",",".");
      echo "<h1>Quantidade de habitantes da capital de $capital</h1>
      <p>Na cidade de $capital tem $quantidadeF habitantes</p>";

    }
   if($elementos == "2")
   {
      echo"<table> 
            <caption>Relação das Capitais e sua população em ordem Crescente </caption> 
            <tr>
            <th>Capitais</th>
            <th>População</th>
            </tr>";
      ksort($populacao);
      foreach ($populacao as $capital => $quantidade)
      {
            $quantidadeF=number_format($quantidade,"0",",",".");
            echo "<tr>
                  <td> $capital </td>
                  <td>$quantidadeF </td>
                  </tr>";
      }
   }
    if($elementos == "3")
    {
      echo "<table>
           <caption>Relação das Capitais e sua população em ordem Decrescente </caption> 
            <tr>
             <td>Capitais</td>
             <td>População</td>
            </tr>";
      krsort($populacao);
      foreach ($populacao as $capital => $quantidade)
      {
        
       		 $quantidadeF=number_format($quantidade,"0",",",".");
       		 echo "</tr>
             	   <th>$capital</th>
              	   <th>$quantidadeF</th>
              	   </tr>";
      }
      echo "</table>";
    }
    if($elementos == "4")
    {
      $caixa = $_POST["escrito"];
      $existe= array_key_exists($caixa, $populacao);

      if($existe == true)

      {
        $habitantes = $populacao[$caixa];

        echo "$caixa EXISTE sua população é igual a $habitantes";
      }else
      {
        echo "$caixa não existe";
      }

    } 
    if($elementos=="5")
    {
      $conta=array_sum($populacao)/count($populacao);
      $media=number_format($conta,"0", ",",".");
      echo "A media da populacao é: $media";

    }
    if($elementos=="6")
    {
      $conta=array_sum($populacao)/count($populacao);
	  $contaF=number_format($conta,0,",",".");
      echo "<h1>As capitais com a população a baixo da média de $contaF </h1><p>";
	  $quantas=0;
      foreach ($populacao as $capital => $quantidade) {
		    $quantidadeF = number_format($quantidade,0,",",".");
        	if($quantidade < $conta)
       		 {
        	  echo "<br>$capital = $quantidadeF <br>";
										$quantas++;
										
       		 }
        
      }
      echo"<br> tem $quantas capitais a baixo da média</p>";

    }
    if($elementos =="7")
    {

        $maior=max($populacao);
        foreach ($populacao as $capital => $quantidade) {
            if($quantidade==$maior)
            { 
              $habitantes=number_format($quantidade);
              echo "<p>A $capital tem a maior quantidade de habitantes ($habitantes)</p>";
            }

        }
    }
	if($elementos == "8")
	{
		$vetor = implode("<br>", $populacao);
		echo "<p>População de cada capital: <br> $vetor</p>";
	}
	if($elementos == "9")
	{
					
		$populacao[" Manaus"]= 2182763;
		$populacao[" Rio Branco"]=407319;	
		echo"<table>
		<tr>
		<th> Capital </th>
		<th> População </th>
		</tr> ";			
		foreach ($populacao as $capital => $quantidade) 
		{
			$quantidadeF=number_format($quantidade,"0",",",".");
			echo"<tr>
			<td> $capital </td>
			<td>$quantidadeF </td>
			</tr>";
		}
		echo"</table>";
	}

    
    

  
  ?>
 </body>
 </html>
