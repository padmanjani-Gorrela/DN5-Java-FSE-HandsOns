# Adapter Design Pattern

## Definition

The Adapter Pattern allows two incompatible interfaces to work together by acting as a bridge between them.

---

## Problem Statement

Different payment gateways expose different APIs:

- Google Pay → `makePayment()`
- PhonePe → `sendMoney()`
- Paytm → `pay()`

Our application expects every payment service to provide a common method:

```java
processPayment()
```

The Adapter Pattern converts the gateway-specific methods into this common interface.

---

## Components

### Target

- PaymentProcessor

### Adaptees

- GooglePayGateway
- PhonePeGateway
- PaytmGateway

### Adapters

- GooglePayAdapter
- PhonePeAdapter
- PaytmAdapter

### Client

- AdapterTest

---

## Class Diagram

```text
                    +----------------------+
                    | PaymentProcessor     |
                    +----------------------+
                    | +processPayment()    |
                    +----------▲-----------+
                               |
          ---------------------------------------------
          |                    |                      |
          |                    |                      |
+-------------------+ +-------------------+ +-------------------+
| GooglePayAdapter  | | PhonePeAdapter    | | PaytmAdapter      |
+-------------------+ +-------------------+ +-------------------+
| - gateway         | | - gateway         | | - gateway         |
+-------------------+ +-------------------+ +-------------------+
| processPayment()  | | processPayment()  | | processPayment()  |
+---------|---------+ +---------|---------+ +---------|---------+
          |                     |                     |
          ▼                     ▼                     ▼
+-------------------+ +-------------------+ +-------------------+
| GooglePayGateway  | | PhonePeGateway    | | PaytmGateway      |
+-------------------+ +-------------------+ +-------------------+
| makePayment()     | | sendMoney()       | | pay()             |
+-------------------+ +-------------------+ +-------------------+

                     ▲
                     |
               AdapterTest
```

---

## Workflow

```text
AdapterTest
      │
      ▼
PaymentProcessor
      │
      ▼
Adapter
      │
      ▼
Third-Party Payment Gateway
      │
      ▼
Payment Successful
```

---

## Advantages

- Integrates incompatible interfaces.
- Promotes code reusability.
- Makes third-party integration easier.
- Supports the Open/Closed Principle.
- Simplifies maintenance.

---

## Real-Life Example

A universal travel adapter lets different electrical plugs work with a single power socket.

Similarly, the Adapter Pattern allows different payment gateways with different APIs to work through one common interface.

---

## Sample Output

Google Pay processed ₹2500.0

PhonePe processed ₹1800.0

Paytm processed ₹3200.0