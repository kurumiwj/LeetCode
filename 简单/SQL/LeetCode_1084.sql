# 1084. 销售分析 III
select product_id, product_name from Product p join Sales s using(product_id) group by product_id having min(sale_date) >= '2019-01-01' and max(sale_date) <= '2019-03-31';

select product_id, product_name from Product p join Sales s using(product_id) group by product_id having count(sale_date between '2019-01-01' and '2019-03-31' or null) = count(1);