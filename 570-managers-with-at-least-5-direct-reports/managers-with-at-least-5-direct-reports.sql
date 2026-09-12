# Write your MySQL query statement below
select e1.name from employee e1 where 5<=(select count(*)from employee e2 where e2.managerId=e1.id) 