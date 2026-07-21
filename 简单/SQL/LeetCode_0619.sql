# 619. 只出现一次的最大数字
select
    max(t.num) as num
from (
    select
        num
    from MyNumbers
    group by num
    having count(num) = 1
) t;