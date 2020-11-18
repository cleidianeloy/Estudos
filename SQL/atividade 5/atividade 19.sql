use nfpse;
select cmc_emissor, round(avg(total_serviços),2) as MediaNF
from nfpse
having cmc_emissor='E000000';