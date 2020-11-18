select proprietario.nome, proprietario.email, categoria.taxaDesconto
from proprietario, carro, modelo, categoria
where proprietario.cpf = carro.cpf
and carro.idModelo= modelo.idModelo
and modelo.idCategoria = categoria.idCategoria
and categoria.taxaDesconto > 10