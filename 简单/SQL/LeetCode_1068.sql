# 1068. 产品销售分析 I
select
    p.product_name,
    s.year,
    s.price
from Sales s
join Product p on s.product_id = p.product_id;

select
    p.product_name,
    s.year,
    s.price
from Sales s
join Product p using product_id;