# Exercise 7 - Packages

## Objective

Learn how to organize related PL/SQL procedures using Packages.

---

## Scenarios

### Scenario 1

Create a package to manage customer operations.

### Scenario 2

Create a package to manage employee salary updates.

### Scenario 3

Create a package for account fund transfers.

---

## Files

- CustomerManagementPackage.sql
- EmployeeManagementPackage.sql
- AccountOperationsPackage.sql
- output.txt

---

## Concepts Used

- Package Specification
- Package Body
- Procedures
- Exception Handling
- COMMIT
- ROLLBACK

---

## Package Architecture

```
Client

↓

Package Specification

↓

Package Body

↓

Database Tables
```

---

## Advantages

- Encapsulates related procedures.
- Improves modularity.
- Better code organization.
- Faster execution after first call.
- Easier maintenance.
- Supports code reuse.

---

## Package Components

### Package Specification

Contains:

- Procedure declarations
- Function declarations
- Variables
- Constants

### Package Body

Contains:

- Procedure implementation
- Function implementation
- Business logic

---

## Sample Output

Customer Added Successfully

Customer Balance Updated

Employee Salary Updated

Fund Transfer Successful