# Write your MySQL query statement below
select F.unique_id, E.name from Employees as E LEFT JOIN EmployeeUNI as F on E.id = F.id;