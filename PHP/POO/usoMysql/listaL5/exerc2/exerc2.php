<!DOCTYPE html> 
<html lang="pt-BR"> 
<head> 
  <meta charset="utf-8"> 
  <title> PHP com MySQL </title> 
  <link rel="stylesheet" href="formata-banco.css">
</head> 

<body> 
 <h1> Fundamentos de PHP com MySQL - exercício 2 </h1>

 <form action="exerc2.php" method="post">
  <fieldset>
    <legend> Controle de estoque - cadastro de produtos </legend>

    <label class="alinha"> ID: </label>
    <input type="text" name="id" autofocus> <br>

    <label class="alinha"> Preço </label>
    <input type="number" name="preco" min="0" step="0.1"> <br>    

    <label class="alinha "> Estoque </label>
    <input type="number" name="estoque" min="0"> <br>

    <label class="alinha"> Classificação: </label>
    <select name="classif">
      <option> Perecível  </option>
      <option> Não-Perecível  </option>
    </select><br><br>

    <label class="alinha topo">Descrição</label>
    <textarea name="descricao"></textarea><br>

    <button type="submit" name="cadastrar"> Cadastrar </button>
    <button type="submit" name="tabular-dados"> Mostrar dados </button>
    <button type="submit" name="mostrar-descricao"> Mostrar descrição </button>
     <button type="submit" name="mostrar-faturamento"> Mostrar faturamento</button>
   </fieldset>
 </form>
 <?php

  require_once "criar-classe-banco-de-dados.inc.php";
  require_once "criar-classe-produtos.inc.php";

 
  $banco = new BancoDeDados("127.0.0.1", "root", "", "CTDS", "produtos");

 
  $conexao = $banco->criarConexao();

  $banco->criarBanco($conexao);

  $banco->abrirBanco($conexao);

  $banco->definirCharset($conexao);

  $banco->criarTabela($conexao);

  $produto = new Produtos(); 

  if(isset($_POST["cadastrar"]))
  {
    
    $produto->receberDadosformulario($conexao);
    $produto->cadastrar($conexao,$banco->nomeDaTabela);
    echo"<p>Dados do produto cadastrados com sucesso no banco de dados. </p>";
  }

  if(isset($_POST["tabular-dados"]))
  {
   
    $produto->tabularDados($conexao,$banco->nomeDaTabela);
  }
   if(isset($_POST["aprovados"]))
   {
    $numeroAprovados = $produto->contarAprovados($conexao, $banco->nomeDaTabela);

    echo "<p> De acordo  com os dados dos alunos cadastrados, o número de alunos aprovados é igual a $numeroAprovados aluno(s). </p>";
   }

 ?>    
</body> 
</html> 