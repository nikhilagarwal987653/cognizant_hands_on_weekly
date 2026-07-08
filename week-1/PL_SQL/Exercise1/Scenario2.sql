Begin 
    for cust in(
        select * from Customers
    )
    loop
        if cust.balance>10000 THEN
        Update CUSTOMERS
        SET IsVIP='TRUE'
        where CUSTOMERID=cust.CUSTOMERID;
        dbms_output.put_line(cust.name|| ' promoted to VIP');
        end if;
    end loop;
end;
