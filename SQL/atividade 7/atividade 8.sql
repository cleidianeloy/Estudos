from contato, mensagem
where contato.idcontato=mensagem.idcontato
and contato='grupo1'
order by data_hora desc
limit 1