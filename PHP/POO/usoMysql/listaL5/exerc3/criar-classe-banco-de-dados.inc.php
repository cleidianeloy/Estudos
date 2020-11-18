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

 

  function criarConexao()
   {
    $conexao = new mysqli($this->servidor, $this->usuario, $this->senha) or exit($conexao->error);
    return $conexao;
   }

  function criarBanco($conexao)
   {
    $sql = "CREATE DATABASE IF NOT EXISTS $this->nomeDoBanco";
    $resultado = $conexao->query($sql) or exit($conexao->error);
   }


   function abrirBanco($conexao)
   {
   		$conexao->select_db($this->nomeDoBanco);
   }
   

   function definirCharset($conexao)
   {
		$conexao->set_charset("utf8");
   }

 

   function criarTabela($conexao)
   {
   		$sql = "CREATE TABLE IF NOT EXISTS $this->nomeDaTabela(
   				id            VARCHAR(20) PRIMARY KEY,
   				preco         DECIMAL(7,2),
          estoque       INT)"; 

   		$resultado = $conexao->query($sql) or exit($conexao->error);
   }
  }

 ?>