select proprietario.nome,  placa, cor
from proprietario, carro, marca, modelo
where proprietario.cpf = carro.cpf
and carro.idModelo= modelo.idModelo
and modelo.idModelo = marca.idMarca
and (carro.cor = 'AZUL' or carro.cor = 'DOURADO');