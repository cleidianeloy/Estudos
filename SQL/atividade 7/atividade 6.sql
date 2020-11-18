select eu, contato, texto, data_hora 
from contato, mensagem
where contato.idcontato = mensagem.idcontato
and ((eu= '+55 48 9999-9991' and contato='+55 48 9999-9992') or (eu='+55 48 9999-9992' and contato='+55 48 9999-9991'))
order by data_hora DESC