CREATE OR REPLACE PROCEDURE TransferFunds(

    p_fromAccount NUMBER,
    p_toAccount NUMBER,
    p_amount NUMBER

)

IS

    v_balance NUMBER;

BEGIN

    SELECT Balance

    INTO v_balance

    FROM Accounts

    WHERE AccountID = p_fromAccount;

    IF v_balance < p_amount THEN

        RAISE_APPLICATION_ERROR(
        -20001,
        'Insufficient Balance');

    END IF;

    UPDATE Accounts

    SET Balance = Balance - p_amount

    WHERE AccountID = p_fromAccount;

    UPDATE Accounts

    SET Balance = Balance + p_amount

    WHERE AccountID = p_toAccount;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE(
    'Fund Transfer Completed Successfully');

EXCEPTION

    WHEN OTHERS THEN

        ROLLBACK;

        DBMS_OUTPUT.PUT_LINE(SQLERRM);

END;
/