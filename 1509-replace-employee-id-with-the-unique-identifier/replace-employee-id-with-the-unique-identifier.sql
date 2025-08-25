# Write your MySQL query statement below
# employee id has composite key that is id and unique id

select EN.unique_id, EMP.name from Employees as EMP left join
EmployeeUNI as EN on EN.id = EMP.id;