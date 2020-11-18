<?php
//agora, vamos criar a classe Alunos. Esta classe irá conter métodos e atributos necessários ao PHP para que, interagindo com o banco de dados, possa executar as operações identificadas como requisitos funcionais da nossa aplicação 

class Produtos
{
	public $id;
	public $preco;
	public $estoque;
	public $classif;
	public $descricao;

	function receberDadosFormulario($conexao)
	{
		

		$id            = trim($conexao->escape_string($_POST["id"]));

		$preco         = trim($conexao->escape_string($_POST["preco"]));

		$estoque       = trim($conexao->escape_string($_POST["estoque"]));
		$classif 	   = trim($conexao->escape_string($_POST["classif"]));
		$descricao 	   = trim($conexao->escape_string($_POST["descricao"]));

		//atribuir os dados do formulário às propriedades do objeto 
		$this->id        = $id;
		$this->preco 	 = $preco;
		$this->estoque   = $estoque;
		$this->classif   = $classif;
		$this->descricao = $descricao;
	}
	//implementar o metodo que efetua, de fato, o cadastro dos dados do aluno no MySQL

	function cadastrar($conexao, $nomeDaTabela){

			$sql = "INSERT $nomeDaTabela VALUES(
					'$this->id',
					'$this->preco',
					'$this->estoque',
					'$this->classif',
					'$this->descricao' )";
			$resultado = $conexao->query($sql) or exit($conexao->error);

	}

	 
	function tabularDados($conexao,$nomeDaTabela)
	{
		$sql = "SELECT * FROM $nomeDaTabela WHERE classificacao = 'Perecível' ORDER BY estoque DESC";//retorna apenas os produtos pereciveis na ordem desc de estoque
		$resultado = $conexao ->query($sql) or exit($conexao->error);
		echo "<table>
				<caption> Dados dos produtos perecíveis cadastrados</caption>
				<tr>
				<th> ID </th>
				<th> Preço </th>
				<th> Estoque </th>
				<th> Classificação </th>
				<th> Descrição </th>
				</tr>";
		//vamos criar uma estrutura que permita que o nosso código em PHP percorra todo o conjunto de resultados enviado pelo banco de dados decorrente da consulta efetuada. Esta estrutura irá permitir que o PHP receba os dados de cada aluno armazenados no banco de dados e mostre-os no formato tabular, criando o corpo da tabela na página web 

		while($registro = $resultado->fetch_array() )
		{
			//lembre-se: segurança da nossa aplicação é importante: sempre que você fizer o PHP receber dados do bancode dados, certifique-se de utilizar filtragem adequada, impedindo que sua aplicação funcione como uma ferramenta de invasão da máquina cliente (XSS)
			$id = htmlentities($registro[0], ENT_QUOTES, "UTF-8");
			$preco 	   = htmlentities($registro[1], ENT_QUOTES, "UTF-8"); //tegistro [nome]
			$estoque     = htmlentities($registro[2], ENT_QUOTES, "UTF-8");
			$classif     = htmlentities($registro[3], ENT_QUOTES, "UTF-8");
			$descricao     = htmlentities($registro[4], ENT_QUOTES, "UTF-8");

			echo "<tr>
				  <td> $id </td>
				  <td> $preco     </td>
				  <td> $estoque    </td>
				  <td> $classif   </td>
				  <td> $descricao    </td>
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