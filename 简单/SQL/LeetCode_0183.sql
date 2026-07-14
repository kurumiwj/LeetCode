# 183. 从不订购的客户
select name Customers from Customers c where id not in (select customerId from Orders);