# Write your MySQL query statement below
--  two times max function
select max(salary) as SecondHighestSalary from employee where 
salary < ( select max(salary) from employee );