select nome, dni, datanasc
from dni
where year(now())-year(datanasc) = (select max(year(now())-year(datanasc)) 
from dni)