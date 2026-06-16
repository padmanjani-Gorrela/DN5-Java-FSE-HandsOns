# Factory Design Pattern

## Definition

Factory Pattern is a creational design pattern that provides an interface for creating objects without exposing the object creation logic to the client.

The client requests an object, and the factory decides which concrete implementation to create.

---

## Why do we need it?

- Decouples object creation from client code.
- Improves maintainability.
- Enhances scalability.
- Supports Open/Closed Principle.
- Simplifies object creation logic.

---

## Real Life Analogy

When you order a laptop from a company:

- You ask for a laptop.
- The company decides how it is manufactured.
- You don't care about the creation process.

Similarly, the client requests an object and the factory handles object creation.

---

## Components

### Product Interface

```java
interface Logistics {
    void send();
}
```

### Concrete Products

```java
class Road implements Logistics
class Air implements Logistics
```

### Factory

```java
class LogisticsFactory
```

### Client

```java
class LogisticsService
```

---

## Flow

Main
↓
LogisticsService
↓
LogisticsFactory.getLogistics("road")
↓
new Road()
↓
Road.send()

---

## Advantages

- Loose coupling
- Better scalability
- Easier maintenance
- Centralized object creation
- Cleaner client code

## Disadvantages

- More classes
- Additional abstraction
- Increased complexity for small projects
