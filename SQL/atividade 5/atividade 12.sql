select nfpse.*, nfpse_detalhe.*
from nfpse, nfpse_detalhe
where nfpse.numero = nfpse_detalhe.numero
and nfpse_detalhe.codigo='6201005';