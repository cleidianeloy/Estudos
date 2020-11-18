
select nome,dni.dni
from dni
left join naturalidade on dni.cep = naturalidade.cep 
where cidade = 'Florianópolis'
and year(now())-year(datanasc) > (select avg(year(now())-year(datanasc))  
from dni)