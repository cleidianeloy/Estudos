<?php

class Medicos //tabela medicos 
{
	public $crm;
	public $nome;
	

	function receberDadosFormulario($conexao)
	{
		

		$crm   = trim($conexao->escape_string($_POST["crm"])); //escape_string evita injeção  

		$nome  = trim($conexao->escape_string($_POST["nome-medico"]));

		//atribuir os dados do formulário às propriedades do objeto 
		$this->crm  = $crm;
		$this->nome = $nome;
	}
	//implementar o metodo que efetua, de fato, o cadastro dos dados do aluno no MySQL

	function cadastrar($conexao, $nomeDaTabela1){

			$sql = "INSERT $nomeDaTabela1 VALUES(
					'$this->crm',
					'$this->nome')";
			$resultado = $conexao->query($sql) or exit($conexao->error);
		}
	function contarPacientesAtendidos($conexao,$nomeDaTabela1, $nomeDaTabela2)
		{
			$nomeMedico = trim($conexao->escape_string($_POST["pesquisa-medico"])); //FUNÇÃO TRIM SERVE PARA TIRAR ESPAÇO DO TEXTO

			//agora nós vamos criar uma consulta na tabela medicos para verificar se o nome do médico está caddastrado e recuperar seu crm

			$sql = "SELECT crm FROM $nomeDaTabela1  WHERE nome = '$nomeMedico'"; 
			$resultado = $conexao->query($sql) or die($conexao->error);

			//testar se o nome do médico foi encontrado no banco de dados 

			if($conexao->affected_rows == 0)
			{

				exit("<p>O nome do médico pesquisado <span>$nomeMedico</span não foi encontrado no banco de dados. Tente novamente</p>");
			}else 
			{
				//medico foi encontrado
				$registro = $resultado->fetch_array();
				$crm 	  = $registro[0];
				$crm 	  = htmlentities($crm, ENT_QUOTES,"UTF-8");
				//agora, criamos outra consulta na tabela pacientes que usa a chave estrangeira (CRM) para contar o numero de pacientes atendidos por este médico pesquisado
				$sql = "SELECT COUNT(*) FROM $nomeDaTabela2 WHERE crm_medico ='$crm'";
				$resultado = $conexao->query($sql) or die($conexao->error);

				$registro  = $resultado->fetch_array();
				$quantos   = $registro[0];
				$quantos  	  = htmlentities($quantos , ENT_QUOTES,"UTF-8");

				return $quantos;
			}

		}
	 
	
}
?>