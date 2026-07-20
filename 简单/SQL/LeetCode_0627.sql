# 627. 变更性别
update Salary set sex = if(sex = 'f', 'm', 'f');

update Salary set sex = case sex when 'm' then 'f' else 'm' end;