select nome, dni
from dni, naturalidade
 where dni.cep = naturalidade.cep 
 and cidade = 'Florianópolis';