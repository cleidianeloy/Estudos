select cmc_emissor, date_format(emissao, "%Y") as Periodo, sum(total_serviços) as Total
from nfpse
group by date_format(emissao, "%Y")
having cmc_emissor='E000000';