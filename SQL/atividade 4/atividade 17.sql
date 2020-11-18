select placa, cor, modelo.descricao as modelo, marca.nome as marca, categoria.nome as categoria
from carro, modelo, marca, categoria
where carro.idModelo = modelo.idModelo 
and marca.idMarca = modelo.idMarca
and modelo.idCategoria = categoria.idCategoria