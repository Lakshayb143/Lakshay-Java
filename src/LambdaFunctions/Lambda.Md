
lso known as a lambda expression, is a feature that allows you to create short, anonymous functions on the fly.
These functions can be used wherever functional interfaces are expected.

(parameters) -> expression

Here's what each part means:

parameters: The input parameters of the lambda function. These are optional,
and if the lambda represents a function with multiple parameters, they need to be enclosed in parentheses.
For a function with no parameters, empty parentheses are used.


->: The arrow token, which separates the lambda's parameters from its body.


expression: The body of the lambda function, which contains the code that defines its behavior.
This can be a single expression or a block of code wrapped in curly braces.
Lambda functions are commonly used in functional programming to perform operations on collections, apply transformations,
and define behavior as arguments to higher-order functions. They allow for more concise and readable code compared to writing full-fledged named functions
or creating anonymous classes for simple functionality.
A functional interface is an interface that has only one abstract method and may have multiple default and static methods.



Q: What is difference between

The main difference between `IntBinaryOperator` and `IntConsumer` lies in their purpose and the number of arguments they take:

1. `IntBinaryOperator`:
    - Purpose: `IntBinaryOperator` is a functional interface that represents an operation on two integer operands,
      producing an integer result.
    - Method: It has a single method called `applyAsInt(int left, int right)`,
      which takes two integer arguments (`left` and `right`) and returns an integer result.
    - Use: This functional interface is suitable for cases where you need to perform a binary operation on two integers
      and produce a result, such as addition, subtraction, multiplication, or any other custom binary operation.

Example:
```java
IntBinaryOperator addition = (a, b) -> a + b;
int result = addition.applyAsInt(5, 10); // result will be 15 (5 + 10)
```

2. `IntConsumer`:
    - Purpose: `IntConsumer` is a functional interface that represents an operation that takes a single integer argument
      and performs some action but does not return any result.
    - Method: It has a single method called `accept(int value)`, which takes an integer argument (`value`)
      and performs the specified action with that value.
    - Use: This functional interface is useful when you need to perform an operation that consumes an integer value,
      but you don't need any output or result from that operation.

Example:
```java
IntConsumer printSquare = num -> System.out.println("Square of " + num + " is: " + (num * num));
printSquare.accept(5); // Output: Square of 5 is: 25
```

In summary, `IntBinaryOperator` is used for binary operations that take two integer inputs and produce an integer output,
whereas `IntConsumer` is used when you want to perform an action that consumes an integer input without returning any result.

