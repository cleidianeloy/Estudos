<?php
//agora, vamos criar a classe Alunos. Esta classe irá conter métodos e atributos necessários ao PHP para que, interagindo com o banco de dados, possa executar as operações identificadas como requisitos funcionais da nossa aplicação 

class Produtos
{
	public $id;
	public $preco;
	public $estoque;
	

	function receberDadosFormulario($conexao)
	{
		

		$id            = trim($conexao->escape_string($_POST["id"]));

		$preco         = trim($conexao->escape_string($_POST["preco"]));

		$estoque       = trim($conexao->escape_string($_POST["estoque"]));

		//atribuir os dados do formulário às propriedades do objeto 
		$this->id        = $id;
		$this->preco 	 = $preco;
		$this->estoque   = $estoque;
	}
	//implementar o metodo que efetua, de fato, o cadastro dos dados do aluno no MySQL

	function cadastrar($conexao, $nomeDaTabela){

			$sql = "INSERT $nomeDaTabela VALUES(
					'$this->id',
					'$this->preco',
					'$this->estoque')";
			$resultado = $conexao->query($sql) or exit($conexao->error);

	}

	 
	function alterarDados($conexao,$nomeDaTabela)
	{
			 $id = trim($conexao->escape_string($_POST["pesquisa-id"]));

			 $novoPreco = trim($conexao->escape_string($_POST["altera-preco"]));
		$sql = "UPDATE $nomeDaTabela SET preco = $novoPreco WHERE id = '$id'";

		$resultado = $conexao ->query($sql) or exit($conexao->error);
		//a fim de  enviarmos ao usuário uma mensagem apopriada (se houve ou não atualização de dados), devemos saber quantas linhas foram afetadas, no banco de dados, pela consulta UPDATE
		$numeroRegistrosAfetados = $conexao->affected_rows;
		if($numeroRegistrosAfetados == 0){
			echo "<p>Atenção: o id de mercadoria fornecido <span> $id </span> não foi encontrado no banco de dados. Alteração falhou! tente novamente. </p>";
		}else
		{
			echo "<p>Alteração do novo preço unitario do produto com id <span> $id </span> efetivada com sucesso no banco de dados.</p>";
		}

	}


	function excluirProdutos($conexao,$nomeDaTabela)
	{
		$estoqueReferencia = trim($conexao->escape_string($_POST["quant-estoque"]));
		$sql = "DELETE FROM  $nomeDaTabela WHERE estoque < '$estoqueReferencia'";
		$resultado = $conexao->query($sql) or exit ($conexao->error);

		$numeroRegistrosAfetados = $conexao->affected_rows;
		if($numeroRegistrosAfetados == 0){
			echo "<p>Atenção: Nenhum produto no banco de dados possui estoque inferior do que o valor de referência, que é <span> $estoqueReferencia</span>. Exclusão não foi efetuada. Tente novamente </p>";
		}else
		{
			echo "<p>A exclusão de produtos foi efetivada com sucesso no banco de dados. Foram excluídos um total de <span> $numeroRegistrosAfetados</span> produtos.</p>";
		}

	}
}
?>