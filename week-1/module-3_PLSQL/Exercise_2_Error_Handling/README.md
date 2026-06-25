# Exercise 2 - Error Handling

## Objective

Learn exception handling in PL/SQL using procedures and transaction management.

---

## Scenarios

### Scenario 1

Transfer funds safely between accounts.

### Scenario 2

Update employee salary with validation.

### Scenario 3

Insert a new customer while handling duplicate IDs.

---

## Files

- SafeTransferFunds.sql
- UpdateSalary.sql
- AddNewCustomer.sql
- output.txt

---

## Concepts Used

- Stored Procedures
- Exception Handling
- SQL%ROWCOUNT
- DUP_VAL_ON_INDEX
- COMMIT
- ROLLBACK
- RAISE_APPLICATION_ERROR

---

## Flow

Input

↓

Procedure Execution

↓

Validation

↓

Exception Handling

↓

Commit / Rollback

↓

Display Output

---

## Advantages

- Prevents data inconsistency
- Handles runtime errors gracefully
- Maintains database integrity
- Improves application reliability