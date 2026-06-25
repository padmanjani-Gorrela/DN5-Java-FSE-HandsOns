--Loan reminder within next 30 days.
SET SERVEROUTPUT ON;

BEGIN

    FOR loan_record IN

    (SELECT c.Name,
            l.EndDate

    FROM Customers c

    JOIN Loans l

    ON c.CustomerID=l.CustomerID

    WHERE l.EndDate
    BETWEEN SYSDATE
    AND SYSDATE+30)

    LOOP

        DBMS_OUTPUT.PUT_LINE(
        'Reminder : '
        ||loan_record.Name
        ||', your loan is due on '
        ||loan_record.EndDate);

    END LOOP;

END;
/