**throw and throws in Java:**

**1. throw:**
- `throw` is a keyword in Java used to manually throw an exception.
- When a specific condition is met, and you want to indicate an exceptional situation in your code, you can use `throw` to create and throw an exception object.
- `throw` is used inside a method or block to explicitly raise an exception and transfer control to the nearest matching `catch` block to handle the exception.

**Syntax:**
```java
throw exceptionInstance;
```

**Example:**
```java
public void divide(int a, int b) {
    if (b == 0) {
        throw new ArithmeticException("Cannot divide by zero");
    }
    int result = a / b;
    System.out.println("Result: " + result);
}
```

In this example, when the value of `b` is zero, we use `throw` to create and throw an `ArithmeticException`. This will immediately halt the normal flow of execution and transfer control to the nearest `catch` block or terminate the program if the exception is not caught.

**2. throws:**
- `throws` is a keyword used in a method declaration to indicate that the method may throw one or more checked exceptions.
- When a method is declared with `throws`, it is indicating that the method might not handle the exception itself but instead propagate the responsibility of handling the exception to the calling method.
- If a method declares that it throws an exception, the calling method must either catch the exception or declare it in its own `throws` clause.

**Syntax:**
```java
accessModifier returnType methodName(parameters) throws ExceptionType1, ExceptionType2, ... {
    // Method implementation
}
```

**Example:**
```java
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public void readFile(String filePath) throws FileNotFoundException, IOException {
    FileReader reader = new FileReader(filePath);
    // Read file content
    reader.close();
}
```

In this example, the `readFile` method is declared to throw `FileNotFoundException` and `IOException`. This means that the method may encounter these checked exceptions during its execution and will propagate the responsibility of handling these exceptions to its caller.

**Key Differences:**
- `throw` is used inside a method or block to manually throw an exception, while `throws` is used in a method declaration to indicate that the method may throw one or more checked exceptions.
- `throw` is used to create and throw a specific exception object, transferring control to the nearest matching `catch` block, while `throws` is used to delegate the responsibility of handling exceptions to the calling method.
- `throw` is used for both checked and unchecked exceptions, while `throws` is specifically used for checked exceptions.

In summary, `throw` is used to raise and handle exceptions within a method or block, while `throws` is used to indicate that a method may propagate exceptions to its caller and delegate the responsibility of handling them.