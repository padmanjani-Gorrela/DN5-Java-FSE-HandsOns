# Singleton Design Pattern

## Definition

The Singleton Pattern ensures that a class has only one instance and provides a global point of access to it.

---

## Why do we need it?

- Ensures only one object is created.
- Saves memory.
- Provides a single access point.
- Useful for shared resources like loggers and configuration managers.

---

## Components

### Singleton Class

- Private static instance
- Private constructor
- Public static `getInstance()` method

### Client Class

Calls `getInstance()` to access the singleton object.

---

## Real-Life Example

A printer in an office.

Everyone sends print requests to the same printer. The office doesn't create a new printer every time someone wants to print.

Similarly, a Singleton allows the entire application to use one shared object.

---

## Output

Logger Instance Created
Log: Application Started
Log: User Logged In

Logger1 HashCode : xxxx
Logger2 HashCode : xxxx

Only one Logger instance exists.