
select proprietario.nome, placa,cor, descricao as modelo, marca.nome as marca
from marca, modelo, proprietario, carro
where modelo.idModelo = marca.idMarca
and proprietario.cpf = carro.cpf
and carro.idModelo= modelo.idModelo
and marca.nome != 'Chevrolet'
	