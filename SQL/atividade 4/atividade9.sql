select nome, filiacao 
from dni
left join filiacao on filiacao.dni = dni.dni
where dni.dni = '111.111.111-11'

