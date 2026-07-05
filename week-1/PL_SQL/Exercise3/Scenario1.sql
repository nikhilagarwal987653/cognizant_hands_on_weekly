create or replace PROCEDURE ProcessMonthlyInterest
as
begin

    UPDATE Accounts
    set balance=balance*1.01
    where ACCOUNTTYPE='Savings';

    commit;
end;
/

