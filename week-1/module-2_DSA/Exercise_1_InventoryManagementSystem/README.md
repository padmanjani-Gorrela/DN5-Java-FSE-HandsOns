# Exercise 1 - Inventory Management System

## Problem Statement

Develop an Inventory Management System to efficiently manage products in a warehouse using suitable data structures.

---

## Why Data Structures and Algorithms?

As inventory grows, searching and updating products becomes slower if data is not organized properly.

Using efficient data structures improves:

- Faster searching
- Efficient updates
- Better memory usage
- Easy scalability

---

## Data Structure Used

**HashMap<Integer, Product>**

Reason:

- Product ID is unique.
- Fast insertion.
- Fast searching.
- Fast deletion.

---

## Project Structure

```
Exercise_1_InventoryManagementSystem
│
├── Product.java
├── Inventory.java
├── InventoryTest.java
├── output.txt
└── README.md
```

---

## Operations

### Add Product

Adds a new product to inventory.

### Update Product

Updates quantity and price using Product ID.

### Delete Product

Removes a product from inventory.

### Display Products

Displays all products.

---

## Time Complexity

| Operation | HashMap |
|-----------|----------|
| Add | O(1) |
| Search | O(1) |
| Update | O(1) |
| Delete | O(1) |

Worst Case: O(n)

---

## Optimization

- HashMap provides constant-time average performance.
- Product ID acts as a unique key.
- Avoids sequential searching.
- Suitable for large inventory systems.

---

## Class Diagram

```
                +------------------+
                |     Product      |
                +------------------+
                | productId        |
                | productName      |
                | quantity         |
                | price            |
                +------------------+
                | getters()        |
                | setters()        |
                +------------------+

                        ▲
                        │
                        │ stored in

                +------------------+
                |    Inventory     |
                +------------------+
                | HashMap<Integer, |
                | Product>         |
                +------------------+
                | addProduct()     |
                | updateProduct()  |
                | deleteProduct()  |
                | displayProducts()|
                +------------------+

                        ▲
                        │

                +------------------+
                | InventoryTest    |
                +------------------+
                | main()           |
                +------------------+
```

---

## Output

See **output.txt**.