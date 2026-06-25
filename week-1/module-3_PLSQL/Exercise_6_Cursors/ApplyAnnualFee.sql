SET SERVEROUTPUT ON;

DECLARE

    CURSOR account_cursor IS

    SELECT
        AccountID,
        Balance

    FROM Accounts;

BEGIN

    FOR account_record IN account_cursor LOOP

        UPDATE Accounts

        SET Balance = Balance - 500

        WHERE AccountID = account_record.AccountID;

        DBMS_OUTPUT.PUT_LINE(
        'Annual Fee Deducted From Account : '
        ||account_record.AccountID);

    END LOOP;

    COMMIT;

END;
/