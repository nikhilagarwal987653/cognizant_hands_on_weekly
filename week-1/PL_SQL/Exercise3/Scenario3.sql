create or REPLACE procedure  TransferFunds(
    p_fromAccount In NUMBER,
    p_toAccount In NUMBER,
    p_amount In NUMBER
)
as 
    v_balance Number;
BEGIN

    select balance
    into v_balance
    from Accounts
    where AccountID=p_fromAccount;

    if p_amount<=v_balance THEN
    update Accounts
    set balance=balance-p_amount
    where AccountID=p_fromAccount;

    update Accounts
    set balance=balance+p_amount
    where AccountID=p_toAccount;

    Commit;

    dbms_output.put_line('Transfer Successful');

    else

    dbms_output.put_line('Insufficient Balance');
    end if;

Exception

    when Others then 
    RollBack;
    dbms_output.put_line('Transfer failed');
end;
/
BEGIN
    TRANSFERFUNDS(101,102,3000);
end;
/
select * from accounts;
