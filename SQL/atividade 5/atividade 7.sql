select nfpse.*, tomador.nome_razao as tomador,emissor.nome_razao as emissor, valor_unitario, quantidade,
	   valor_unitario*quantidade AS subtotal,aliquota,round(((aliquota*valor_unitario*quantidade)/100),2) as ISSQN
from nfpse,tomador, emissor, nfpse_detalhe, cnae
where nfpse.numero= nfpse_detalhe.numero
and nfpse.cmc_tomador =tomador.cmc_tomador
and nfpse.cmc_emissor =emissor.cmc_emissor
and nfpse_detalhe.codigo = cnae.codigo
and nfpse.numero='000004';
