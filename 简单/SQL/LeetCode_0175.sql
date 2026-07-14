# 175. 组合两个表
select firstName, lastName, city, state from Person p left join Address a on p.personId = a.personId;