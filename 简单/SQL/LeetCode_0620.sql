# 620. 有趣的电影
select * from cinema where description != 'boring' and id % 2 = 1 order by rating desc;

select * from cinema where description != 'boring' and mod(id, 2) = 1 order by rating desc;
