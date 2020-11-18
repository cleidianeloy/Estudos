select nome, contato as 'no grupo', eu as numero 
from usuario, contato
where contato.eu = usuario.idusuario 
and contato='grupo3'