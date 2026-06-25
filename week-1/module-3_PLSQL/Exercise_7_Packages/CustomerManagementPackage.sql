-- Package Specification
CREATE OR REPLACE PACKAGE CustomerManagement AS

    PROCEDURE AddCustomer(
        p_customerId NUMBER,
        p_name VARCHAR2,
        p_dob DATE,
        p_balance NUMBER
    );

    PROCEDURE UpdateCustomerBalance(
        p_customerId NUMBER,
        p_balance NUMBER
    );

END CustomerManagement;
/

-- Package Body
CREATE OR REPLACE PACKAGE BODY CustomerManagement AS

    PROCEDURE AddCustomer(
        p_customerId NUMBER,
        p_name VARCHAR2,
        p_dob DATE,
        p_balance NUMBER
    )
    IS
    BEGIN
        INSERT INTO Customers(
            CustomerID,
            Name,
            DOB,
            Balance,
            LastModified
        )
        VALUES(
            p_customerId,
            p_name,
            p_dob,
            p_balance,
            SYSDATE
        );

        COMMIT;
        DBMS_OUTPUT.PUT_LINE('Customer Added Successfully');
    END AddCustomer;

    PROCEDURE UpdateCustomerBalance(
        p_customerId NUMBER,
        p_balance NUMBER
    )
    IS
    BEGIN
        UPDATE Customers
        SET Balance = p_balance
        WHERE CustomerID = p_customerId;

        COMMIT;
        DBMS_OUTPUT.PUT_LINE('Customer Balance Updated');
    END UpdateCustomerBalance;

END CustomerManagement;
/