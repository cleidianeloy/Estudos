select usuario.nome, contato
from usuario, contato 
where usuario.idusuario = contato.contato
and eu = '+55 48 9999-9994'
and egrupo is null