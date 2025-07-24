# Write your MySQL query statement below
select max(salary) as SecondHighestSalary from employee where 
  employee.salary < ( select max(salary)  from employee );

-- The difference lies in how SQL handles empty result sets. In the single SELECT, if no row is found, nothing is returned.
-- In the nested SELECT, when the subquery returns no result, it explicitly returns NULL, which the outer query then displays.


-- select
-- (select distinct Salary 
-- from Employee order by salary desc 
-- limit 1 offset 1) 
-- as SecondHighestSalary;