# MVC (Model-View-Controller) Design Pattern

## Definition

The Model-View-Controller (MVC) Pattern separates an application into three components:

- **Model** – Stores and manages data.
- **View** – Displays data to the user.
- **Controller** – Acts as a bridge between the Model and the View.

This separation improves code organization, maintainability, and scalability.

---

## Problem Statement

A student management system needs to display and update student information without tightly coupling the user interface to the business logic.

The MVC Pattern separates these responsibilities into three independent components.

---

## Components

### Model

- Student

### View

- StudentView

### Controller

- StudentController

### Client

- MVCTest

---

## Class Diagram

```text
                        +----------------------+
                        |       Student        |
                        +----------------------+
                        | - name               |
                        | - id                 |
                        | - grade              |
                        +----------------------+
                        | + getters/setters    |
                        +----------▲-----------+
                                   |
                                   |
                        +----------------------+
                        |  StudentController   |
                        +----------------------+
                        | - model              |
                        | - view               |
                        +----------------------+
                        | + setStudentName()   |
                        | + setStudentGrade()  |
                        | + updateView()       |
                        +----------▲-----------+
                                   |
                                   |
                        +----------------------+
                        |     StudentView      |
                        +----------------------+
                        | + displayStudentDetails() |
                        +----------------------+

                               ▲
                               |
                           MVCTest
```

---

## Workflow

```text
MVCTest
    │
    ▼
Create Student Model
    │
    ▼
Create Student View
    │
    ▼
Create Student Controller
    │
    ▼
Controller Updates Model
    │
    ▼
Controller Requests View
    │
    ▼
Student Details Displayed
```

---

## Real-Life Example

Consider a college student portal:

- **Model** stores student information in the database.
- **View** displays the student details on the screen.
- **Controller** receives user actions, updates the student information, and refreshes the display.

---

## Advantages

- Separates business logic from presentation.
- Easier to maintain and test.
- Improves code reusability.
- Supports multiple views for the same model.
- Follows the Separation of Concerns principle.

---

## Sample Output

Original Student Record

Student ID : 101

Student Name : Anjani

Grade : A

Updated Student Record

Student ID : 101

Student Name : Padmanjani

Grade : A+