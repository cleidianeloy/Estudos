<?php
 //definir a classe BancoDeDados, que conterá as informações básicas de conexão do PHP com o MySQL
 class BancoDeDados
  {
   public $nomeDoBanco;
   public $nomeDaTabela;
   public $servidor;
   public $usuario;
   public $senha;
  

  //construtor da classe
  function __construct($servidorBanco, $usuarioBanco, $senhaAcesso, $nomeBanco, $nomeTabela)
   {
    $this->servidor     = $servidorBanco;
    $this->usuario      = $usuarioBanco;
    $this->senha        = $senhaAcesso;
    $this->nomeDoBanco  = $nomeBanco;
    $this->nomeDaTabela = $nomeTabela;
   }

  //método que estabelece a ligação entre o nosso código PHP e o MySQL
  function criarConexao()
   {
    $conexao = new mysqli($this->servidor, $this->usuario, $this->senha) or exit($conexao->error);
    return $conexao;
   }

  //método para a criação física do banco de dados no servidor
  function criarBanco($conexao)
   {
    $sql = "CREATE DATABASE IF NOT EXISTS $this->nomeDoBanco";
    $resultado = $conexao->query($sql) or exit($conexao->error);
   }
   //metodo para selecionar o banco de dados 

   function abrirBanco($conexao)
   {
   		$conexao->select_db($this->nomeDoBanco);
   }
   //método para definir, no banco de dados. o utg-8 como o conjunto de caracteres-padrão

   function definirCharset($conexao)
   {
		$conexao->set_charset("utf8");
   }

   //método para criar a tabela no banco de dados

   function criarTabela($conexao)
   {
   		$sql = "CREATE TABLE IF NOT EXISTS $this->nomeDaTabela(
   				matricula VARCHAR(20) PRIMARY KEY,
   				nome VARCHAR(300),
   				media DECIMAL(3,1))";

   		$resultado = $conexao->query($sql) or exit($conexao->error);
   }
  }

 ?>