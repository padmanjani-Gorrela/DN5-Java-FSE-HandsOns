# Exercise 2 - E-commerce Platform Search Function

## Problem Statement

Develop an efficient product search system for an e-commerce platform using Linear Search and Binary Search algorithms.

---

## Why Asymptotic Analysis?

Asymptotic analysis helps estimate an algorithm's efficiency as the input size grows.

The most common notation is **Big O Notation**, which measures the upper bound of an algorithm's running time.

---

## Search Scenarios

### Best Case

The required product is found immediately.

### Average Case

The product is found somewhere in the middle.

### Worst Case

The product is at the end or not present.

---

## Algorithms Implemented

- Linear Search
- Binary Search

---

## Project Structure

```
Exercise_2_EcommerceSearchFunction
│
├── Product.java
├── SearchOperations.java
├── SearchTest.java
├── output.txt
└── README.md
```

---

## Time Complexity

| Algorithm | Best | Average | Worst |
|-----------|------|----------|--------|
| Linear Search | O(1) | O(n) | O(n) |
| Binary Search | O(1) | O(log n) | O(log n) |

---

## Comparison

### Linear Search

Advantages

- Works on unsorted data
- Easy to implement

Disadvantages

- Slow for large datasets

---

### Binary Search

Advantages

- Very fast
- Efficient for large inventories

Disadvantages

- Requires sorted data

---

## Which is Better?

For an e-commerce platform with thousands of products, **Binary Search** is preferred because it significantly reduces the search time compared to Linear Search.

---

## Class Diagram

```
              +----------------------+
              |      Product         |
              +----------------------+
              | productId            |
              | productName          |
              | category             |
              +----------------------+
              | getters()            |
              +----------------------+

                        ▲
                        │

              +----------------------+
              | SearchOperations     |
              +----------------------+
              | linearSearch()       |
              | binarySearch()       |
              | sortProducts()       |
              +----------------------+

                        ▲
                        │

              +----------------------+
              |     SearchTest       |
              +----------------------+
              | main()               |
              +----------------------+
```

---

## Output

Refer to **output.txt**.