select eu, contato, texto, data_hora 
from contato, mensagem
where contato.idcontato=mensagem.idcontato
and contato='grupo1'
order by data_hora 