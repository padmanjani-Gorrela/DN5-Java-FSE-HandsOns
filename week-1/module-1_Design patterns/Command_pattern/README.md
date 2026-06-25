# Command Design Pattern

## Definition

The Command Pattern is a behavioral design pattern that encapsulates a request as an object. It allows requests to be parameterized, queued, or logged while decoupling the sender from the receiver.

---

## Problem Statement

In a smart home automation system, a remote control should be able to turn a light ON or OFF without directly interacting with the light.

The Command Pattern encapsulates each action (ON/OFF) as a command object, allowing the remote to execute commands without knowing their implementation.

---

## Components

### Command

- Command

### Concrete Commands

- LightOnCommand
- LightOffCommand

### Receiver

- Light

### Invoker

- RemoteControl

### Client

- CommandTest

---

## Class Diagram

```text
                    +----------------------+
                    |      Command         |
                    +----------------------+
                    | + execute()          |
                    +----------▲-----------+
                               |
              ----------------------------------
              |                                |
              |                                |
+--------------------------+     +--------------------------+
|     LightOnCommand       |     |     LightOffCommand      |
+--------------------------+     +--------------------------+
| - light                  |     | - light                  |
+--------------------------+     +--------------------------+
| + execute()              |     | + execute()              |
+------------|-------------+     +------------|-------------+
             |                                |
             ▼                                ▼
                    +----------------------+
                    |        Light         |
                    +----------------------+
                    | + turnOn()           |
                    | + turnOff()          |
                    +----------------------+

                              ▲
                              |
                    +----------------------+
                    |    RemoteControl     |
                    +----------------------+
                    | - command            |
                    +----------------------+
                    | + setCommand()       |
                    | + pressButton()      |
                    +----------▲-----------+
                               |
                          CommandTest
```

---

## Workflow

```text
CommandTest
      │
      ▼
Create Light Receiver
      │
      ▼
Create ON/OFF Commands
      │
      ▼
Assign Command to Remote
      │
      ▼
Press Button
      │
      ▼
Execute Command
      │
      ▼
Light Turns ON/OFF
```

---

## Real-Life Example

A TV remote doesn't directly know how to switch on the television. It simply sends a command. The television receives that command and performs the requested action.

Similarly, in a smart home, the remote issues ON/OFF commands, while the light performs the actual operation.

---

## Advantages

- Decouples sender and receiver.
- Easy to add new commands.
- Supports command history, queuing, and undo operations.
- Follows the Open/Closed Principle.
- Improves code flexibility.

---

## Sample Output

Pressing ON Button...

💡 Living Room Light is ON

Pressing OFF Button...

💡 Living Room Light is OFF