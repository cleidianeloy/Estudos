select tomador.*, nfpse.numero
from tomador
left join nfpse on tomador.cmc_tomador=nfpse.cmc_tomador
where numero is null;