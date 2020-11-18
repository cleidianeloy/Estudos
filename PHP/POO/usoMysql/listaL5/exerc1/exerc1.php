<!DOCTYPE html> 
<html lang="pt-BR"> 
<head> 
  <meta charset="utf-8"> 
  <title> PHP com MySQL </title> 
  <link rel="stylesheet" href="formata-banco.css">
</head> 

<body> 
 <h1> Fundamentos de PHP com MySQL - exercício 1 </h1>

 <form action="exerc1.php" method="post">
  <fieldset>
    <legend> Cadastro de alunos </legend>

    <label class="alinha"> Nome: </label>
    <input type="text" name="nome" autofocus> <br>

    <label class="alinha"> Matrícula: </label>
    <input type="text" name="matric"> <br>    

    <label class="alinha"> Média final de PRW: </label>
    <input type="number" name="media" min="0" max="10" step="0.1"> <br>

    <button type="submit" name="cadastrar"> Efetuar cadastro </button>
    <button type="submit" name="tabular-dados"> Mostrar dados dos alunos </button>
    <button type="submit" name="aprovados"> Mostrar número de aprovados </button>
   </fieldset>
 </form>
 <?php
  //devemos, antes de qualquer coisa, inserir as includes que irão conter as classes BancoDeDados e Alunos. As duas classes serão construídas em arquivos externos para que possam ser reutilizadas em qualquer outra aplicação envolvendo integração entre PHP e Banco de Dados
  require_once "criar-classe-banco-de-dados.inc.php";
  require_once "criar-classe-alunos.inc.php";

  //criando o objeto bancoDeDados, por meio do construtor, e passando os parâmetros necessários - 127.0.0.1 é o mesmo que localhost
  $banco = new BancoDeDados("127.0.0.1", "root", "", "CTDS", "alunos");

  /*visualizando o conteúdo de um objeto criado na página web
  var_dump($banco);
  echo "$banco->nomeDoBanco";*/

  //invocar o método do objeto $banco que cria a conexão física do PHP com o MySQL
  $conexao = $banco->criarConexao();

  echo "<p> Conexão com o banco de dados MySQL foi estabelecida com sucesso. </p>";

  //invocar o método ue cria o banco de dados físico no servidor
  $banco->criarBanco($conexao);

  echo "<p> Banco de dados criado com sucesso. </p>";

  //invocar o método que seleciona o banco de dados
  $banco->abrirBanco($conexao);

  //invocar o método que define a tabela de símbolos no banco de dados 

  $banco->definirCharset($conexao);

  //invocar o método que cria a tabela

  $banco->criarTabela($conexao);

  echo "<p>Tabela criada com sucesso. </p>";

  //de modo que o PHP execute as operações com os dados do aluno no banco de dados, vamos criar o objeto aluno
  $aluno = new Alunos(); 

  //fazemos o PHP detectar se o botão de cadastro foi acionado no formulário
  if(isset($_POST["cadastrar"]))
  {
    ///vamos invocar o método do objeto $aluno que recebe os dados do formulario 
    $aluno->receberDadosformulario($conexao);
    $aluno->cadastrar($conexao,$banco->nomeDaTabela);
    echo"<p>Dados do aluno cadastrados com sucesso no banco de dados. </p>";
  }
  //fazemos o PHP detectr se o usuário escolheu o botão de listagem de dados no formato tabular
  if(isset($_POST["tabular-dados"]))
  {
    //invocamos o método do objeto aluno que mostra a tabulação dos dados 
    $aluno->tabularDados($conexao,$banco->nomeDaTabela);
  }
   if(isset($_POST["aprovados"]))
   {
    $numeroAprovados = $aluno->contarAprovados($conexao ,$banco->nomeDaTabela);

    echo "<p> De acordo  com os dados dos alunos cadastrados, o número de alunos aprovados é igual a $numeroAprovados aluno(s). </p>";
   }

 ?>    
</body> 
</html> 