--Promote customers with balance > 10000 to VIP.
SET SERVEROUTPUT ON;

BEGIN

    FOR customer_record IN
    (SELECT CustomerID,
            Balance
     FROM Customers)

    LOOP

        IF customer_record.Balance > 10000 THEN

            UPDATE Customers
            SET IsVIP='TRUE'
            WHERE CustomerID =
            customer_record.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
            'Customer '
            ||customer_record.CustomerID
            ||' promoted to VIP');

        END IF;

    END LOOP;

    COMMIT;

END;
/