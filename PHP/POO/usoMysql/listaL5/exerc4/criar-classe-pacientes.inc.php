<?php

class Pacientes //tabela medicos 
{
	public $crmMedico;
	public $nome;
	public $dataInternacao;

	function receberDadosFormulario($conexao)
	{
		

		$crm   = trim($conexao->escape_string($_POST["crm-medico"])); //escape_string evita injeção  
		$nome  = trim($conexao->escape_string($_POST["nome-paciente"]));
		$data  = trim($conexao->escape_string($_POST["data-internacao"]));

		//atribuir os dados do formulário às propriedades do objeto 
		$this->crmMedico 	  = $crm;
		$this->nome 		  = $nome;
		$this->dataInternacao = $data;
	}
	//implementar o metodo que efetua, de fato, o cadastro dos dados do aluno no MySQL

	function cadastrar($conexao, $nomeDaTabela2){

			$sql = "INSERT $nomeDaTabela2 VALUES(
							null,
					'$this->nome',
					'$this->dataInternacao',
					'$this->crmMedico')";
			$resultado = $conexao->query($sql) or exit($conexao->error);


	}
	 
	
}
?>