SET SERVEROUTPUT ON;

DECLARE

    CURSOR transaction_cursor IS

    SELECT
        c.Name,
        t.TransactionID,
        t.TransactionDate,
        t.Amount,
        t.TransactionType

    FROM Customers c

    JOIN Accounts a
    ON c.CustomerID = a.CustomerID

    JOIN Transactions t
    ON a.AccountID = t.AccountID

    WHERE TO_CHAR(t.TransactionDate,'MMYYYY')
          = TO_CHAR(SYSDATE,'MMYYYY');

BEGIN

    DBMS_OUTPUT.PUT_LINE('===== Monthly Statements =====');

    FOR transaction_record IN transaction_cursor LOOP

        DBMS_OUTPUT.PUT_LINE(
        'Customer : '||transaction_record.Name||
        ' | Transaction ID : '||transaction_record.TransactionID||
        ' | Amount : ₹'||transaction_record.Amount||
        ' | Type : '||transaction_record.TransactionType);

    END LOOP;

END;
/