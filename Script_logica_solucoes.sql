use empresa;
select p.id, p.nome, i.descricao, p.preco
from produto as p, identificacao as i
where p.id = i.id
order by preco asc;
select p.id, p.nome, i.descricao, p.preco
from produto as p, identificacao as i
where p.id = i.id
order by nome asc,preco asc;
