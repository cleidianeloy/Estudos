use nfpse;
update nfpse 
set valor_issqn = (select sum((aliquota*valor_unitario*quantidade)/100)
from nfpse, nfpse_detalhe, cnae
where nfpse.numero=nfpse_detalhe.numero
and nfpse_detalhe.codigo = cnae.codigo
and nfpse.numero ='000004')
where nfpse.numero= '000004';

select * from nfpse;