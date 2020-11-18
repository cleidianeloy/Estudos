<?php
 //definir a classe BancoDeDados, que conterá as informações básicas de conexão do PHP com o MySQL
 class BancoDeDados
  {
   public $nomeDoBanco;
   public $nomeDaTabela1; //medicos
   public $nomeDaTabela2; //pacientes 
   public $servidor;
   public $usuario;
   public $senha;
  

  //construtor da classe
  function __construct($servidorBanco, $usuarioBanco, $senhaAcesso, $nomeBanco, $nomeTabela1,$nomeTabela2)
   {//variaveis de fora | variaveis de dentro
    $this->servidor     = $servidorBanco;
    $this->usuario      = $usuarioBanco;
    $this->senha        = $senhaAcesso;
    $this->nomeDoBanco  = $nomeBanco;
    $this->nomeDaTabela1 = $nomeTabela1;
    $this->nomeDaTabela2 = $nomeTabela2;
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

 

   function criarTabelas($conexao)
   {
    //criando a primeira tabela 
   		$sql = "CREATE TABLE IF NOT EXISTS $this->nomeDaTabela1(
   				 crm   VARCHAR(20) PRIMARY KEY,
   				 nome  VARCHAR(300)) ENGINE=innoDB"; 

   		$resultado = $conexao->query($sql) or exit($conexao->error);

      $sql = "CREATE TABLE IF NOT EXISTS $this->nomeDaTabela2(
          id    INT PRIMARY KEY AUTO_INCREMENT,
          nome  VARCHAR(300), 
          data_internacao DATE,
          crm_medico VARCHAR(20),
          
          FOREIGN KEY (crm_medico) REFERENCES $this->nomeDaTabela1 (crm)) ENGINE=innoDB"; //foreign key(itemdatabelarefencial) serve para criar a relação entre as duas tabelas
          //ENGINE=innoDB serve como um motor para as relações

      $resultado = $conexao->query($sql) or exit($conexao->error);
   }

   //método para finalizar a conexão
   function desconectar($conexao)
   {
   		$conexao->close();
   }
  }

 ?>