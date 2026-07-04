declare
    customer_name VARCHAR2(100);
begin
    for loan in(
        Select * from loans
    )
    loop
    if loan.EndDate<=SYSDATE + 30 then
    Select Name
    into customer_name
    from customers
    where CustomerID=loan.CustomerID;

    dbms_output.put_line('Reminder Sent to: ' || customer_name);
    end if;
    end loop;
end;