select nome, dni 
from dni
where year(now())-year(datanasc) > 65;
 
