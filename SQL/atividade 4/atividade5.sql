select  nome, dni.dni,datanasc, sangue_rh, cidade,dni.uf, filiacao, ocorrencia.descricao, simbolo, assinatura, foto
from dni
left join naturalidade on dni.cep = naturalidade.cep 
left join filiacao on dni.dni = filiacao.filiacao 
left join ocorrencia on ocorrencia.dni = dni.dni
left join nec_especial on nec_especial.descricao = ocorrencia.descricao
where cpf is null;
