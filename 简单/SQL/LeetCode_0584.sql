# 584. 寻找用户推荐人
select
    name
from Customer
where referee_id != 2 or isNull(referee_id);