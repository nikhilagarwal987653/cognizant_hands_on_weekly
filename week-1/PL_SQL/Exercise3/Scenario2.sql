create or replace PROCEDURE UpdateEmployeeBonus(
    p_department IN VARCHAR2,
    p_bonus  In Number
)
AS
BEGIN
    Update EMPLOYEES
    SET salary=salary*(1+p_bonus/100)
    where department=p_department;

    commit;
end;
/
begin
    UPDATEEMPLOYEEBONUS('IT',10);
end;
/
select * from Employees;