<!DOCTYPE html> 
<html lang="pt-BR"> 
<head> 
  <meta charset="utf-8"> 
  <title> PHP com MySQL </title> 
  <link rel="stylesheet" href="formata-banco.css">
</head> 

<body> 
 <h1> Fundamentos de PHP com MySQL - exercício 2 </h1>

 <form action="exerc3.php" method="post">
  <fieldset>
    <legend> Controle de estoque - cadastro de produtos </legend>

    <label class="alinha"> ID: </label>
    <input type="text" name="id" autofocus> <br>

    <label class="alinha"> Preço </label>
    <input type="number" name="preco" min="0" step="0.01"> <br>    

    <label class="alinha "> Estoque </label>
    <input type="number" name="estoque" min="0"> <br>


    <button type="submit" name="cadastrar"> Cadastrar </button>

  </fieldset>

  <fieldset>
        <legend> Controle de estoque - Alteração do preço unitario </legend>

 
    <label class="alinha"> ID do produto pesquisado: </label>
    <input type="text" name="pesquisa-id" autofocus> <br>

    <label class="alinha"> Novo Preço unitário </label>
    <input type="number" name="altera-preco" min="0" step="0.01"> <br>    

    <button type="submit" name="alterar">Alterar preço unitário </button>

   </fieldset>
   <fieldset>
        <legend> Controle de estoque - exclusão de produtos </legend>

        <label class="alinha"> Forneça a quantidade em estoque de referências  </label>
        <input type="number" name="quant-estoque" min="0"> <br>    

         <button type="submit" name="excluir">Excluir produtos com estoque abaixo da referência </button>

   </fieldset>
 </form>
 <?php

  require_once "criar-classe-banco-de-dados.inc.php";
  require_once "criar-classe-produtos.inc.php";

 
  $banco = new BancoDeDados("127.0.0.1", "root", "", "CTDS", "mercadorias");

 
  $conexao = $banco->criarConexao();

  $banco->criarBanco($conexao);

  $banco->abrirBanco($conexao);

  $banco->definirCharset($conexao);

  $banco->criarTabela($conexao);

 // echo "<p>Tabela criada com sucesso. </p>";

  $produto = new Produtos(); 

  if(isset($_POST["cadastrar"]))
  {
    
    $produto->receberDadosformulario($conexao);
    $produto->cadastrar($conexao,$banco->nomeDaTabela);
    echo"<p>Dados do produto cadastrados com sucesso no banco de dados. </p>";
  }

  if(isset($_POST["alterar"]))
  {
   
    $produto->alterarDados($conexao,$banco->nomeDaTabela);
  }
   if(isset($_POST["excluir"]))
   {
     $produto->excluirProdutos($conexao,$banco->nomeDaTabela);
   }

 ?>    
</body> 
</html> 