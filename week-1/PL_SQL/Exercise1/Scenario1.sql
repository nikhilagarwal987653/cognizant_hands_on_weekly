begin 
    for cust in (
        select * from customers
    )
    LOOP
    if floor(Months_between(sysdate,cust.DOB)/12)>60 then 

    update loans
    set INTERESTRATE=INTERESTRATE-1
    where CUSTOMERID=cust.CUSTOMERID;

    dbms_output.put_line(
        'Discount Applied to : ' || cust.Name
    );
    End if;
    END LOOP;
end;
