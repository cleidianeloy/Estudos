select nfpse.*, tomador.nome_razao as tomador
from nfpse, tomador
where nfpse.cmc_tomador = tomador.cmc_tomador
and nfpse.cmc_tomador='T111111';