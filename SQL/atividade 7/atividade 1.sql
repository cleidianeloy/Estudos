select t1.nome as usuario, t2.nome as contato
from usuario as t1, contato, usuario as t2
where t1.idusuario=contato.eu
and t2.idusuario=contato.contato
and t2.egrupo is null
order by t1.nome, t2.nome
