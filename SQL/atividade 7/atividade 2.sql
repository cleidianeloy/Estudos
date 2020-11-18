select t2.nome as criador, t2.nome as grupo
from usuario as t1, usuario as t2
where t1.idusuario = t2.criado_por