# Exercise 6 - Cursors

## Objective

Learn to use Explicit Cursors in PL/SQL to process multiple rows returned by SQL queries.

---

## Scenarios

### Scenario 1

Generate monthly transaction statements for all customers.

### Scenario 2

Deduct annual maintenance fees from every account.

### Scenario 3

Update loan interest rates according to the new bank policy.

---

## Files

- GenerateMonthlyStatements.sql
- ApplyAnnualFee.sql
- UpdateLoanInterestRates.sql
- output.txt

---

## Concepts Used

- Explicit Cursor
- FOR LOOP
- UPDATE Statement
- COMMIT
- DBMS_OUTPUT

---

## Cursor Workflow

SQL Query

↓

Cursor Created

↓

Fetch Rows

↓

Process Each Row

↓

Update Database

↓

Commit Changes

---

## Advantages

- Efficient row-by-row processing.
- Easy handling of multiple records.
- Better readability.
- Supports complex business logic.