select nome ,  year(now())-year(datanasc) as 'idade'
from dni
order by  'idade' desc
limit 5


