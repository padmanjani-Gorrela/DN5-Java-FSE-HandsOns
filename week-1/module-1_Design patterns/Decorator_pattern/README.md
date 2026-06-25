# Decorator Design Pattern

## Definition

The Decorator Pattern is a structural design pattern that dynamically adds new responsibilities or behaviors to an object without modifying its existing code.

---

## Problem Statement

A notification system initially supports Email notifications. Later, new notification channels such as SMS and WhatsApp need to be added without changing the existing Email notification class.

The Decorator Pattern allows additional notification channels to be attached dynamically.

---

## Components

### Component

- Notifier

### Concrete Component

- EmailNotifier

### Decorator

- NotifierDecorator

### Concrete Decorators

- SMSNotifierDecorator
- WhatsAppNotifierDecorator

### Client

- DecoratorTest

---

## Class Diagram

```text
                           +----------------------+
                           |      Notifier        |
                           +----------------------+
                           | + send(message)      |
                           +----------▲-----------+
                                      |
                          implements  |
                                      |
                    +------------------------------+
                    |        EmailNotifier         |
                    +------------------------------+
                    | + send(message)              |
                    +------------------------------+
                                      ▲
                                      |
                           +------------------------+
                           |  NotifierDecorator     |
                           +------------------------+
                           | - notifier             |
                           +------------------------+
                           | + send(message)        |
                           +-----------▲------------+
                                       |
                    -----------------------------------------
                    |                                       |
      +-----------------------------+       +-----------------------------+
      | SMSNotifierDecorator        |       | WhatsAppNotifierDecorator   |
      +-----------------------------+       +-----------------------------+
      | + send(message)             |       | + send(message)             |
      +-----------------------------+       +-----------------------------+

                     ▲
                     |
               DecoratorTest
```

---

## Workflow

```text
DecoratorTest
      │
      ▼
EmailNotifier
      │
      ▼
SMSNotifierDecorator
      │
      ▼
WhatsAppNotifierDecorator
      │
      ▼
Final Notification Sent
```

---

## Real-Life Example

A courier service may notify a customer through:

- Email
- SMS
- WhatsApp

Initially, only Email is available. As requirements grow, SMS and WhatsApp notifications are added dynamically without modifying the Email notification class.

---

## Advantages

- Adds functionality without changing existing classes.
- Supports the Open/Closed Principle.
- Flexible and reusable.
- Avoids large inheritance hierarchies.
- Responsibilities can be combined dynamically.

---

## Sample Output

Email Notification : Assignment Submitted

Email Notification : Assignment Submitted
SMS Notification : Assignment Submitted

Email Notification : Assignment Submitted
SMS Notification : Assignment Submitted
WhatsApp Notification : Assignment Submitted