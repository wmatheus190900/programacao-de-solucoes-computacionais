create schema sacolao;
use sacolao;
create table alimento (
id int auto_increment, nome varchar(128), preco double, validade date, unique(nome), constraint pk_produto primary key (id)

);
create table identificacao (
id int, nome varchar(128), descricao varchar(256), constraint pk_identificacao primary key (id), constraint fk_identificacao foreign key (id) references alimento (id)
);
insert into alimento (nome, preco, validade) values ('arroz', 25.00, '2023-12-17');
insert into alimento (nome, preco, validade) values ('banana', 07.00, '2023-09-10');
insert into alimento (nome, preco, validade) values ('iorgut', 12.00, '2023-12-17');
insert into alimento (nome, preco, validade) values ('maça', 04.00, '2023-07-25');
insert into identificacao (id, nome, descricao) values (1, 'prato fino', 'integral');
insert into identificacao (id, nome, descricao) values (2, 'fazenda', 'prata');
insert into identificacao (id, nome, descricao) values (3, 'itambe', 'morango');
insert into identificacao (id, nome, descricao) values (4, 'fazenda', 'argentina');
select a.id, a.nome, i.descricao, a.preco
from alimento as a, identificacao as i
where a.id = i.id
order by preco asc;
select*, sum(preco) as 'soma dos preços' from alimento
group by nome;