<!DOCTYPE html> 
<html lang="pt-BR"> 
<head> 
  <meta charset="utf-8"> 
  <title> PHP com MySQL </title> 
  <link rel="stylesheet" href="formata-banco.css">
</head> 

<body> 
 <h1> Fundamentos de PHP com MySQL - exercício 4 </h1>

 <form action="exerc4.php" method="post">
  <fieldset>
    <legend> Cadastro de médicos </legend>

    <label class="alinha"> Nome: </label>
    <input type="text" name="nome-medico"autofocus> <br>  
    <label class="alinha"> CRM: </label>
    <input type="text" name="crm" > <br>
    <button type="submit" name="cadastrar-medico"> Cadastrar médico</button>

  </fieldset>

  <fieldset>
        <legend>Cadastro de pacientes</legend>

 
    <label class="alinha"> Nome: </label>
    <input type="text" name="nome-paciente"> <br>
    <label class="alinha">Atendido pelo médico (CRM):</label>
    <input type="text" name="crm-medico"> <br>    
    <label class="alinha">Data de internação:</label>
    <input type="date" name="data-internacao"> <br>
    <button type="submit" name="cadastrar-paciente">Cadastrar paciente</button>

   </fieldset>
   <fieldset>
        <legend> Pesquisa pelo médico </legend>

        <label class="alinha"> Nome do médico:  </label>
        <input type="text" name="pesquisa-medico" > <br>    

         <button type="submit" name="pesquisar-medico">Pesquisar médico</button>

   </fieldset>
 </form>
 <?php

  require_once "criar-classe-banco-de-dados.inc.php";
  require_once "criar-classe-medicos.inc.php";
  require_once "criar-classe-pacientes.inc.php";

 //mudanças no construtor da conexão para contemplarmos as duas tabelas necessárias
  $banco = new BancoDeDados("127.0.0.1"/*ou localhost*/, "root", "", "CTDS", "medicos","pacientes");

 
  $conexao = $banco->criarConexao();

  $banco->criarBanco($conexao);

  $banco->abrirBanco($conexao);

  $banco->definirCharset($conexao);

  $banco->criarTabelas($conexao);

  echo "<p>Tabelas criadas com sucesso. </p>";
  //neste ponto, fazemos o PHP criar o objeto medico e o objeto paciente
  $medico = new Medicos(); 
  $paciente = new Pacientes();

  //cadastrar os médicos
  if(isset($_POST["cadastrar-medico"]))
  {
    
    $medico->receberDadosformulario($conexao);
    $medico->cadastrar($conexao,$banco->nomeDaTabela1);
    echo"<p> Dados do médico cadastrados com sucesso no banco de dados. </p>";
  }
  if(isset($_POST["cadastrar-paciente"]))
  {
    
    $paciente->receberDadosformulario($conexao);
    $paciente->cadastrar($conexao,$banco->nomeDaTabela2);
    echo"<p> Dados do paciente cadastrados com sucesso no banco de dados. </p>";
  }


  if(isset($_POST["pesquisa-medico"]))
  {
   //neste caso, vamos invocar o método da classe medicos que verifica quantos oacientes foram atendidos pelo referido médico
    $atendidos = $medico->contarPacientesAtendidos($conexao,$banco->nomeDaTabela1, $banco->nomeDaTabela2);

    echo "<p>Neste momento, há um total de <span> $atendidos</span> pacientes(s) atendidos(s) pelo médico pesquisado. </p>";
  }
  
  $banco->desconectar($conexao);

 ?>    
</body> 
</html> 