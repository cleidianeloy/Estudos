select eu, contato, left(texto,15), data_hora 
from contato, mensagem
where contato.idcontato=mensagem.idcontato
and contato.idcontato in ( select idcontato 
							from usuario, contato 
                            where usuario.idusuario =contato.contato
                            and (eu='+55 48 9999-9991' or contato='+55 48 9999-9991')
                            )
group by contato.idcontato,data_hora DESC;