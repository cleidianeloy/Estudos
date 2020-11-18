USE nfpse;
UPDATE nfpse
SET total_serviços = (SELECT SUM(valor_unitario*quantidade)
 FROM nfpse
 JOIN nfpse_detalhe ON nfpse.numero = nfpse_detalhe.numero
JOIN cnae ON nfpse_detalhe.codigo = cnae.codigo);

 use nfpse;
update nfpse 
set valor_issqn = (select sum((aliquota*valor_unitario*quantidade)/100)
from nfpse, nfpse_detalhe, cnae
where nfpse.numero=nfpse_detalhe.numero
and nfpse_detalhe.codigo = cnae.codigo);

select * from nfpse;
