# Builder Design Pattern

## Definition

The Builder Pattern is a creational design pattern that constructs complex objects step by step. It allows the same construction process to create different configurations of an object.

---

## Problem Statement

A computer can have many optional components such as:

- Processor
- RAM
- Storage
- Graphics Card
- Cooling System
- Cabinet

Using multiple constructors becomes difficult to maintain. The Builder Pattern provides a clean and flexible way to create different computer configurations.

---

## Components

### Product
- Computer

### Builder
- Computer.Builder

### Client
- BuilderTest

---

## Class Diagram

```text
                    +----------------------+
                    |      Computer        |
                    +----------------------+
                    | - processor          |
                    | - ram                |
                    | - storage            |
                    | - gpu                |
                    | - coolingSystem      |
                    | - cabinet            |
                    +----------------------+
                    | + display()          |
                    +----------------------+
                              ▲
                              │
                private Computer(Builder)
                              │
                              │
                    +----------------------+
                    |   Computer.Builder   |
                    +----------------------+
                    | - processor          |
                    | - ram                |
                    | - storage            |
                    | - gpu                |
                    | - coolingSystem      |
                    | - cabinet            |
                    +----------------------+
                    | + processor()        |
                    | + ram()              |
                    | + storage()          |
                    | + gpu()              |
                    | + coolingSystem()    |
                    | + cabinet()          |
                    | + build()            |
                    +----------------------+
                              ▲
                              │
                              │
                    +----------------------+
                    |     BuilderTest      |
                    +----------------------+
                    | + main()             |
                    +----------------------+
```

---

## Workflow

```text
BuilderTest
     │
     ▼
Computer.Builder
     │
     ├── processor()
     ├── ram()
     ├── storage()
     ├── gpu()
     ├── coolingSystem()
     ├── cabinet()
     │
     ▼
 build()
     │
     ▼
 Computer Object
```

---

## Why use the Builder Pattern?

- Eliminates constructor overloading.
- Makes object creation more readable.
- Supports optional parameters.
- Enables method chaining.
- Improves code maintainability.

---

## Real-Life Example

Imagine assembling a custom gaming PC.

A customer selects:
- Processor
- RAM
- Storage
- Graphics Card
- Cooling System
- Cabinet

After choosing the required components, the builder assembles the final computer. Different customers can create different configurations using the same building process.

---

## Sample Output

```
===== Computer Configuration =====
Processor      : AMD Ryzen 9
RAM            : 32 GB
Storage        : 2000 GB
Graphics Card  : RTX 4080
Cooling System : Liquid Cooling
Cabinet        : Corsair RGB

===== Computer Configuration =====
Processor      : Intel i5
RAM            : 16 GB
Storage        : 512 GB
Graphics Card  : null
Cooling System : null
Cabinet        : null
```

---

## Advantages

- Improves readability.
- Simplifies object creation.
- Supports immutable objects.
- Easy to extend with new attributes.
- Follows the Single Responsibility Principle.

---

## Applications

- Computer configuration systems.
- Car manufacturing software.
- House construction systems.
- Pizza ordering applications.
- Mobile phone configuration websites.