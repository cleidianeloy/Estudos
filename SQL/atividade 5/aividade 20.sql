select cmc_tomador, round(sum(total_serviços),2) as NF
from nfpse
group by  cmc_tomador
order by sum(total_serviços) desc
limit 3;