# 1327. 列出指定时间段内所有的下单产品
select
    p.product_name,
    sum(o.unit) as unit
from Products p
join Orders o on p.product_id = o.product_id
where o.order_date between '2020-02-01' and '2020-02-29'
group by p.product_id
having unit >= 100;
