# Exercise 5 - Triggers

## Objective

Learn how to automate database operations using PL/SQL Triggers.

---

## Scenarios

### Scenario 1

Automatically update the customer's LastModified date.

### Scenario 2

Maintain an audit log whenever a transaction is inserted.

### Scenario 3

Validate deposits and withdrawals before inserting transactions.

---

## Files

- AuditLog.sql
- UpdateCustomerLastModified.sql
- LogTransaction.sql
- CheckTransactionRules.sql
- output.txt

---

## Concepts Used

- BEFORE Trigger
- AFTER Trigger
- FOR EACH ROW
- :NEW
- RAISE_APPLICATION_ERROR
- Automatic Auditing

---

## Trigger Flow

Database Event

↓

Trigger Fires

↓

Validation / Audit

↓

Database Updated

---

## Advantages

- Automatic execution
- Improved data integrity
- Audit trail creation
- Business rule enforcement
- Reduced manual coding