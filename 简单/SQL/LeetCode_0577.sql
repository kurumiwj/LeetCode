# 577. 员工奖金
select name, bonus from Employee e left join Bonus b on e.empId = b.empId where isNull(bonus) or bonus < 1000;