# 1211. 查询结果的质量和占比
select
    query_name,
    round(sum(rating / position) / count(1), 2) as quality,
    round(sum(case when rating < 3 then 1 else 0 end) / count(1) * 100, 2) as poor_query_percentage
from Queries
group by query_name;

select
    query_name,
    round(avg(rating / position), 2) as quality,
    round(sum(if(rating < 3, 1, 0)) / count(1) * 100, 2) as poor_query_percentage
from Queries
group by query_name;