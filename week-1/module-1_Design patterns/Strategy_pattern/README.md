# Strategy Design Pattern

## Definition

The Strategy Pattern is a behavioral design pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable at runtime without changing the client code.

---

## Problem Statement

An online shopping application supports multiple payment methods such as:

- Credit Card
- UPI
- Net Banking

Instead of writing separate logic for each payment method inside one class, the Strategy Pattern allows the payment method to be selected dynamically at runtime.

---

## Components

### Strategy

- PaymentStrategy

### Concrete Strategies

- CreditCardPayment
- UpiPayment
- NetBankingPayment

### Context

- PaymentContext

### Client

- StrategyTest

---

## Class Diagram

```text
                    +--------------------------+
                    |     PaymentStrategy      |
                    +--------------------------+
                    | + pay(amount)            |
                    +------------▲-------------+
                                 |
          -------------------------------------------------
          |                     |                         |
          |                     |                         |
+--------------------+ +--------------------+ +----------------------+
| CreditCardPayment  | | UpiPayment         | | NetBankingPayment    |
+--------------------+ +--------------------+ +----------------------+
| + pay(amount)      | | + pay(amount)      | | + pay(amount)        |
+--------------------+ +--------------------+ +----------------------+

                          ▲
                          |
                   +----------------------+
                   |   PaymentContext     |
                   +----------------------+
                   | - paymentStrategy    |
                   +----------------------+
                   | + makePayment()      |
                   | + setPaymentStrategy()|
                   +----------▲-----------+
                              |
                              |
                       +--------------+
                       | StrategyTest |
                       +--------------+
```

---

## Workflow

```text
StrategyTest
      │
      ▼
PaymentContext
      │
      ▼
Select Payment Strategy
      │
      ├──────────────┬───────────────┐
      ▼              ▼               ▼
Credit Card        UPI         Net Banking
      │              │               │
      └──────────────┴───────────────┘
                     │
                     ▼
             Payment Successful
```

---

## Real-Life Example

An e-commerce application allows users to choose different payment methods during checkout.

Depending on the user's selection, the payment is processed using:

- Credit Card
- UPI
- Net Banking

The checkout process remains unchanged; only the payment strategy changes.

---

## Advantages

- Easy to switch algorithms at runtime.
- Eliminates long if-else or switch statements.
- Follows the Open/Closed Principle.
- Promotes loose coupling.
- Easy to add new payment methods.

---

## Sample Output

Order Amount : ₹2500

Payment of ₹2500.0 made using Credit Card.

Order Amount : ₹1800

Payment of ₹1800.0 made using UPI.

Order Amount : ₹4200

Payment of ₹4200.0 made using Net Banking.