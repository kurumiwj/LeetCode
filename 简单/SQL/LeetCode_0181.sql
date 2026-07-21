# 181. 超过经理收入的员工
select
    a.name Employee
from Employee a
join Employee b on a.managerId = b.id
where a.salary > b.salary;