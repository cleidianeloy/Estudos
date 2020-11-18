<?php
//agora, vamos criar a classe Alunos. Esta classe irá conter métodos e atributos necessários ao PHP para que, interagindo com o banco de dados, possa executar as operações identificadas como requisitos funcionais da nossa aplicação 

class Alunos
{
	public $matricula;
	public $nome;
	public $mediaFinal;

	//implementar o método que recebe os dados do formulário 

	function receberDadosFormulario($conexao)
	{
		//atenção para as funções do PHP que evitam ataques do tipo injeção de SQL 


		$matricula = trim($conexao->escape_string($_POST["matric"]));
		//outra maneira de escrever o mesmo comando acima, sem o encadeamento de funções

		$matricula = $_POST["matric"];
		$matricula = $conexao->escape_string($matricula);
		$matricula = trim($matricula);

		$nome      = trim($conexao->escape_string($_POST["nome"]));
		$media 	   = trim($conexao->escape_string($_POST["media"]));

		//atribuir os dados do formulário às propriedades do objeto 
		$this->matricula =$matricula;
		$this->nome 	 =$nome;
		$this->mediaFinal=$media;
	}
	//implementar o metodo que efetua, de fato, o cadastro dos dados do aluno no MySQL

	function cadastrar($conexao, $nomeDaTabela){

			$sql = "INSERT $nomeDaTabela VALUES(
					'$this->matricula',
					'$this->nome',
					$this->mediaFinal)";
			$resultado = $conexao->query($sql) or exit($conexao->error);

	}

	//método para recuperar os dados do banco de dados e exibi-los no formato tabular 
	function tabularDados($conexao,$nomeDaTabela)
	{
		$sql = "SELECT * FROM $nomeDaTabela";
		$resultado = $conexao ->query($sql) or exit($conexao->error);
		echo "<table>
				<caption> Dados dos alunos cadastrados </caption>
				<tr>
				<th> Matricula </th>
				<th> Aluno </th>
				<th> Média em PRW </th>
				</tr>";
		//vamos criar uma estrutura que permita que o nosso código em PHP percorra todo o conjunto de resultados enviado pelo banco de dados decorrente da consulta efetuada. Esta estrutura irá permitir que o PHP receba os dados de cada aluno armazenados no banco de dados e mostre-os no formato tabular, criando o corpo da tabela na página web 

		while($registro = $resultado->fetch_array() )
		{
			//lembre-se: segurança da nossa aplicação é importante: sempre que você fizer o PHP receber dados do bancode dados, certifique-se de utilizar filtragem adequada, impedindo que sua aplicação funcione como uma ferramenta de invasão da máquina cliente (XSS)
			$matricula = htmlentities($registro[0], ENT_QUOTES, "UTF-8");
			$aluno 	   = htmlentities($registro[1], ENT_QUOTES, "UTF-8"); //tegistro [nome]
			$media     = htmlentities($registro[2], ENT_QUOTES, "UTF-8");

			echo "<tr>
				  <td> $matricula </td>
				  <td> $aluno     </td>
				  <td> $media     </td>
				  </tr>";

		}

		echo "</table>";

	}
	//implementar o método que conta o número de alunos aprovados 

	function contarAprovados($conexao, $nomeDatabela)
	{
		$sql = "SELECT COUNT(*) FROM $nomeDatabela where media >= 6";
		$resultado = $conexao->query($sql) or exit($conexao->error);
		$registro = $resultado->fetch_array();
		$quantidade = htmlentities($registro[0],ENT_QUOTES,"UTF-8"); //não entendi

		return $quantidade;


	}
}
?>