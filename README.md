# BBM104 - Programming Assignment 1: Online Book Marketing System

## Assignment Overview

This repository contains the implementation of the "Online Book Marketing System," developed as part of the first programming assignment for the BBM104 course. The primary objective is to enhance proficiency in basic Java programming, focusing on variables, loops, string operations, and file read operations.

### Problem Description

The task is to develop a Java program that simulates an Online Book Marketing System. The system will read a shopping list (`purchaseOrder.txt`) and a price list (`priceCatalog.txt`) from input files, compute the total cost based on membership types (Premium, Standard, Basic), shopping date, and validity dates of the prices, and generate a detailed bill.

### Requirements

#### Input Files:
1. **purchaseOrder.txt**: Contains details of the customer’s name, surname, membership type, shopping date, and a list of book titles with quantities.
2. **priceCatalog.txt**: Contains a list of book titles, membership types, validity dates, and prices for each item.

#### Output:
- The program should generate a bill that includes the customer’s name, type of membership, shopping date, list of purchased items with quantities, detailed prices, and the total cost.

### Execution and Testing

To test the program:

1. Compile the code:
    ```bash
    javac *.java
    ```
2. Run the program:
    ```bash
    java Main purchaseOrder.txt priceCatalog.txt
    ```

