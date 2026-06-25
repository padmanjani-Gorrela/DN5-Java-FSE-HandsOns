# Proxy Design Pattern

## Definition

The Proxy Pattern provides a placeholder or surrogate for another object to control access to it. It can delay object creation, improve performance, and provide caching.

---

## Problem Statement

Loading large images from a cloud server is expensive and time-consuming.

Instead of loading the image immediately, a proxy object delays loading until the image is actually requested.

Once loaded, the same image is reused for future requests.

---

## Components

### Subject

- Image

### Real Subject

- RealImage

### Proxy

- ProxyImage

### Client

- ProxyTest

---

## Class Diagram

```text
                       +----------------------+
                       |        Image         |
                       +----------------------+
                       | + display()          |
                       +----------▲-----------+
                                  |
                  ---------------------------------
                  |                               |
                  |                               |
          +---------------+              +------------------+
          |  RealImage    |              |   ProxyImage     |
          +---------------+              +------------------+
          | - imageName   |              | - imageName      |
          |               |              | - realImage      |
          +---------------+              +------------------+
          | + display()   |              | + display()      |
          | - loadImage() |              +--------|---------+
          +---------------+                       |
                                                  |
                                                  ▼
                                            RealImage

                         ▲
                         |
                    ProxyTest
```

---

## Workflow

```text
ProxyTest
      │
      ▼
ProxyImage
      │
      ├── If image not loaded
      │        │
      │        ▼
      │   RealImage
      │        │
      │   Load from Server
      │
      ▼
Display Image

Second Request

ProxyImage
      │
      ▼
Cached RealImage
      │
      ▼
Display Image
```

---

## Real-Life Example

A photo gallery app stores images on a cloud server.

When a user opens the gallery:

- Image names are displayed immediately.
- The actual image is downloaded only when the user opens it.
- If the user opens the same image again, it is shown from memory instead of downloading again.

---

## Advantages

- Lazy initialization.
- Improves performance.
- Reduces unnecessary object creation.
- Supports caching.
- Controls access to expensive resources.

---

## Sample Output

Image selected.

First Display:
Loading Vacation_Photo.jpg from Cloud Server...
Displaying Vacation_Photo.jpg

Second Display:
Displaying Vacation_Photo.jpg