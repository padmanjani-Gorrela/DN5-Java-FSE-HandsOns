# Dependency Injection (DI)

## Definition

Dependency Injection (DI) is a design pattern that provides the required dependencies to a class from the outside instead of creating them internally.

It promotes loose coupling, improves maintainability, and makes applications easier to test.

---

## Problem Statement

A customer management system requires a service to retrieve customer information from a repository.

Instead of creating the repository inside the service class, the repository is injected through the constructor.

This allows different repository implementations to be used without modifying the service class.

---

## Components

### Model

- Customer

### Repository Interface

- CustomerRepository

### Concrete Repository

- CustomerRepositoryImpl

### Service

- CustomerService

### Client

- DependencyInjectionTest

---

## Class Diagram

```text
                      +----------------------------+
                      |     CustomerRepository     |
                      +----------------------------+
                      | + findCustomerById(id)     |
                      +-------------▲--------------+
                                    |
                                    |
                    +-------------------------------+
                    |   CustomerRepositoryImpl      |
                    +-------------------------------+
                    | + findCustomerById(id)        |
                    +---------------▲---------------+
                                    |
                                    |
                      +----------------------------+
                      |     CustomerService        |
                      +----------------------------+
                      | - repository              |
                      +----------------------------+
                      | + displayCustomer()       |
                      +-------------▲-------------+
                                    |
                                    |
                    +----------------------------+
                    | DependencyInjectionTest    |
                    +----------------------------+

             CustomerService
                    │
                    ▼
        CustomerRepository (Injected)
                    │
                    ▼
        CustomerRepositoryImpl
                    │
                    ▼
             Customer Object
```

---

## Workflow

```text
DependencyInjectionTest
        │
        ▼
Create Repository Object
        │
        ▼
Inject Repository into Service
        │
        ▼
CustomerService
        │
        ▼
findCustomerById()
        │
        ▼
CustomerRepositoryImpl
        │
        ▼
Customer Object
        │
        ▼
Display Customer Details
```

---

## Real-Life Example

Think of a restaurant.

A chef needs ingredients to prepare food.

Instead of the chef going to buy ingredients every time, the kitchen staff supplies them.

Similarly:

- CustomerService = Chef
- CustomerRepository = Kitchen Staff
- CustomerRepositoryImpl = Ingredient Supplier

The service receives its dependency from outside instead of creating it itself.

---

## Advantages

- Promotes loose coupling.
- Easier to test using mock repositories.
- Improves maintainability.
- Supports multiple repository implementations.
- Follows the Dependency Inversion Principle (DIP).

---

## Sample Output

========== Customer Details ==========

Customer ID : 101

Name : Anjani

Email : anjani@gmail.com

City : Kakinada

======================================