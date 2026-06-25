# Exercise 3 - Sorting Customer Orders

## Problem Statement

Develop a system to sort customer orders based on their total order value. High-value orders can be prioritized for faster processing.

---

## Sorting Algorithms

### Bubble Sort

- Compares adjacent elements.
- Swaps if they are in the wrong order.
- Repeats until the array is sorted.

### Insertion Sort

- Builds the sorted array one element at a time.
- Efficient for small datasets.

### Quick Sort

- Selects a pivot element.
- Partitions the array into smaller and larger elements.
- Recursively sorts both partitions.

### Merge Sort

- Divides the array into halves.
- Recursively sorts each half.
- Merges the sorted halves.

---

## Project Structure

```
Exercise_3_SortingCustomerOrders
│
├── Order.java
├── SortOperations.java
├── SortTest.java
├── output.txt
└── README.md
```

---

## Algorithms Implemented

- Bubble Sort
- Quick Sort

---

## Time Complexity

| Algorithm | Best | Average | Worst |
|-----------|------|----------|--------|
| Bubble Sort | O(n) | O(n²) | O(n²) |
| Quick Sort | O(n log n) | O(n log n) | O(n²) |

---

## Comparison

### Bubble Sort

Advantages

- Simple implementation
- Suitable for very small datasets

Disadvantages

- Slow for large datasets
- High number of comparisons

---

### Quick Sort

Advantages

- Faster for large datasets
- Divide-and-conquer approach
- Better average performance

Disadvantages

- Worst case O(n²) if pivot selection is poor

---

## Why Quick Sort?

Quick Sort is generally preferred because it provides much better average performance (O(n log n)) than Bubble Sort (O(n²)), making it more suitable for sorting large collections of customer orders in e-commerce applications.

---

## Class Diagram

```
                 +----------------------+
                 |        Order         |
                 +----------------------+
                 | orderId              |
                 | customerName         |
                 | totalPrice           |
                 +----------------------+
                 | getters()            |
                 +----------------------+

                           ▲
                           │

                 +----------------------+
                 |   SortOperations     |
                 +----------------------+
                 | bubbleSort()         |
                 | quickSort()          |
                 | partition()          |
                 | display()            |
                 +----------------------+

                           ▲
                           │

                 +----------------------+
                 |      SortTest        |
                 +----------------------+
                 | main()               |
                 +----------------------+
```

---

## Output

Refer to **output.txt**.