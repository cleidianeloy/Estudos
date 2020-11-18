select avg(year(now())-year(datanasc))  as 'media das idades'
from dni, naturalidade
 where dni.cep = naturalidade.cep 
 and cidade = 'Florianópolis';