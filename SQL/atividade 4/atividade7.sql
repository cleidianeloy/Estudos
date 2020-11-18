select nome, dni
from dni
left join naturalidade ON dni.cep = naturalidade.cep 
where cert_militar  is null;