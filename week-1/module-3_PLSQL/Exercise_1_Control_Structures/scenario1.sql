--Apply 1% discount to customers above 60 years.
SET SERVEROUTPUT ON;

DECLARE

    CURSOR customer_cursor IS
    SELECT CustomerID,
           DOB
    FROM Customers;

    customer_age NUMBER;

BEGIN

    FOR customer_record IN customer_cursor LOOP

        customer_age :=
        FLOOR(MONTHS_BETWEEN(SYSDATE,
        customer_record.DOB)/12);

        IF customer_age > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = customer_record.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
            'Discount Applied to Customer ID : '
            || customer_record.CustomerID);

        END IF;

    END LOOP;

    COMMIT;

END;
/