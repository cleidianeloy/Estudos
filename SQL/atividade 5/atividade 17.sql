select date_format(emissao, "%Y %m") as Periodo, sum(total_serviços) as Total
from nfpse
group by date_format(emissao, "%Y %m");