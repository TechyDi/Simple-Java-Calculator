# Simple Java Calculator

## Overview

This project is a basic calculator application written in Java. It allows users to perform simple arithmetic operations such as addition, subtraction, multiplication, and division. The calculator takes two numbers as input and performs the chosen operation to provide the result.

## Features

- **Addition (+)**: Adds two numbers.
- **Subtraction (-)**: Subtracts the second number from the first.
- **Multiplication (*)**: Multiplies two numbers.
- **Division (/)**: Divides the first number by the second. (Note: Division by zero is not handled in this version.)

## How It Works

1. **User Input**: The program prompts the user to input two floating-point numbers.
2. **Operator Selection**: The user selects an arithmetic operator from the available options (`+`, `-`, `*`, `/`).
3. **Calculation**: Based on the selected operator, the program performs the corresponding arithmetic operation.
4. **Output**: The result of the operation is displayed to the user.

## Code Explanation

### Imports
```java
import java.util.Scanner;
```
- **`Scanner`**: A utility class used to capture user input from the console.

### Class Definition
```java
public class calculator {
```
- **`calculator`**: The main class of the program containing the `main` method.

### Main Method
```java
public static void main(String[] args) {
```
- **`main`**: The entry point of the program where execution begins.

### Variables
```java
float num1, num2, Result;
char operator;
```
- **`num1`**: The first number entered by the user.
- **`num2`**: The second number entered by the user.
- **`Result`**: Stores the result of the arithmetic operation.
- **`operator`**: Stores the operator chosen by the user.

### Scanner Initialization
```java
Scanner sc = new Scanner(System.in);
```
- **`sc`**: An instance of `Scanner` used for reading user input.

### User Input
```java
System.out.println("First Number is:- ");
num1 = sc.nextFloat();

System.out.println("Second Number is:- ");
num2 = sc.nextFloat();

System.out.print("CHOOSE YOUR OPERATOR   +, - , * , / \n");
operator = sc.next().charAt(0);
```
- Prompts the user to enter two numbers and choose an operator.

### Switch Case for Operations
```java
switch (operator) {
    case '+':
        Result = num1 + num2;
        System.out.println(Result);
        break;
    case '-':
        Result = num1 - num2;
        System.out.println(Result);
        break;
    case '*':
        Result = num1 * num2;
        System.out.println(Result);
        break;
    case '/':
        Result = num1 / num2;
        System.out.println(Result);
        break;
    default:
        break;
}
```
- **Switch** statement: Based on the operator, performs the corresponding arithmetic operation and displays the result.

### Closing Scanner
```java
sc.close();
```
- Closes the `Scanner` object to prevent resource leaks.

## Notes

- This basic calculator does not handle edge cases like division by zero.
- Enhancements can include input validation and handling more complex operations.

## Usage

1. Compile the program using `javac calculator.java`.
2. Run the program with `java calculator`.
3. Follow the prompts to enter numbers and choose an operator.

---

Feel free to adjust any details as needed!
