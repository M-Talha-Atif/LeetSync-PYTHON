CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  DECLARE m INT;
  SET m = N - 1;
  RETURN (
    -- limit -> how many no of rows i will return
    --  does there duplicates? is n greater than enteries
      # Write your MySQL query statement below.
    --   300 200 100, n log n
    --  offset skips the rows
    --  limit return the rows
    --  row number starts from 0
    select distinct salary from Employee order by salary desc
    limit m, 1
    --  limit n-1 -> skip the rows, next value to return
    --  limit 1 offset n-1, offset for skipping
    --  m -> no of rows to skip
    --  1 -> return the rows

  );
END