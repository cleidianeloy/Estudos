select cmc_tomador,cpf_cnpj,nome_razao,cfps,CONCAT(logradouro,",",complemento) as endereço,cep.ceps
from tomador, cep
where tomador.cep = cep.cep