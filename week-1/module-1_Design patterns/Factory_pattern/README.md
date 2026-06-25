# Factory Method Design Pattern

## Definition

The Factory Method Pattern defines an interface for creating objects while allowing subclasses to decide which object to instantiate.

---

## Why do we need it?

- Encapsulates object creation.
- Reduces coupling.
- Easy to extend.
- Follows the Open/Closed Principle.

---

## Components

- Product Interface
- Concrete Products
- Abstract Factory
- Concrete Factories
- Client

---

## Real-Life Example

A document management system creates Word, PDF, and Excel documents using different factory classes instead of creating them directly.

---

## Output

Opening Word Document...
Opening PDF Document...
Opening Excel Document...