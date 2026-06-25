# Observer Design Pattern

## Definition

The Observer Pattern is a behavioral design pattern that defines a one-to-many dependency between objects. When the subject changes its state, all registered observers are automatically notified.

---

## Problem Statement

A stock market application continuously updates stock prices.

Multiple clients such as mobile applications and web applications need to receive the latest stock price whenever it changes.

The Observer Pattern enables automatic notifications to all registered clients.

---

## Components

### Subject

- Stock

### Concrete Subject

- StockMarket

### Observer

- Observer

### Concrete Observers

- MobileApp
- WebApp

### Client

- ObserverTest

---

## Class Diagram

```text
                      +----------------------+
                      |        Stock         |
                      +----------------------+
                      | + registerObserver() |
                      | + removeObserver()   |
                      | + notifyObservers()  |
                      +----------▲-----------+
                                 |
                                 |
                      +----------------------+
                      |     StockMarket      |
                      +----------------------+
                      | - observers          |
                      | - stockName          |
                      | - stockPrice         |
                      +----------------------+
                      | + setStock()         |
                      | + notifyObservers()  |
                      +----------▲-----------+
                                 |
         ---------------------------------------------
         |                                           |
         |                                           |
+-----------------------+              +-----------------------+
|      MobileApp        |              |        WebApp         |
+-----------------------+              +-----------------------+
| + update()            |              | + update()            |
+-----------▲-----------+              +-----------▲-----------+
            |                                      |
            +------------------+-------------------+
                               |
                         +-------------+
                         |  Observer   |
                         +-------------+
                         | + update()  |
                         +-------------+

                        ▲
                        |
                  ObserverTest
```

---

## Workflow

```text
ObserverTest
      │
      ▼
StockMarket
      │
      ▼
Stock Price Changes
      │
      ▼
notifyObservers()
      │
      ├──────────────┐
      ▼              ▼
MobileApp         WebApp
```

---

## Real-Life Example

Stock trading platforms such as Groww, Zerodha, or Upstox notify users instantly whenever the prices of selected stocks change.

Users can subscribe or unsubscribe from notifications without affecting the stock market system.

---

## Advantages

- Loose coupling between subject and observers.
- Supports dynamic subscription and unsubscription.
- Easy to add new observer types.
- Follows the Open/Closed Principle.
- Improves scalability.

---

## Sample Output

Stock Updated

Company : TCS

Price : ₹3680.5

Mobile App receives update.

Web App receives update.