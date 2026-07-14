# 596. 超过 5 名学生的课
select class from Courses group by class having count(class) >= 5;