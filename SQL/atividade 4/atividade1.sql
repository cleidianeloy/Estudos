select nome,datanasc, sangue_rh, cidade,dni.uf, filiacao, ocorrencia.descricao, simbolo, assinatura, foto
from dni
left join naturalidade on dni.cep = naturalidade.cep 
left join filiacao on dni.dni = filiacao.dni 
left join ocorrencia on ocorrencia.dni = dni.dni
left join nec_especial on nec_especial.descricao = ocorrencia.descricao
