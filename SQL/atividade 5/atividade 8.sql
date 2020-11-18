use nfpse;
update nfpse 
set total_serviços = (select sum(valor_unitario*quantidade)
from nfpse, nfpse_detalhe, cnae
where nfpse.numero=nfpse_detalhe.numero
and nfpse_detalhe.codigo = cnae.codigo
and nfpse.numero ='000004')
where nfpse.numero= '000004';

select * from nfpse

