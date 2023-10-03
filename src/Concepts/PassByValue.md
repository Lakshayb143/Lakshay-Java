# Is java pass by value or pass by reference?

Java uses pass-by-value for both primitive types and object references.

For primitive types like `int`, `double`, `char` etc, values are passed directly. Any changes to the parameter does not affect the original variable.

```java
public void change(int x) {
    x = x + 10; 
}

int y = 10;
change(y);
System.out.println(y); // Prints 10
```

For object references, the reference is passed by value. This means that the method receives a copy of the reference. Any changes to the object's fields will be visible outside the method, but assigning a new object to the parameter will not affect the original reference.

```java
public void change(Circle circle) {
    circle.setRadius(20); // Changes original circle
    circle = new Circle(); // New reference - original circle is unchanged    
}

Circle c = new Circle(10);
change(c);
System.out.println(c.getRadius()); // Prints 20
```

However, the Oracle docs mention that you can specify `<pass-by-reference>true</pass-by-reference>` in the deployment descriptor to enable pass-by-reference semantics for EJB remote calls within the same process. This allows avoiding copying arguments and results, improving performance.

But the docs warn that problems can arise if the data is modified by another source during the invocation. Portable programs should consider parameters as read-only when pass-by-reference is enabled.

So in summary, Java uses pass-by-value semantics by default. But for optimizing colocated EJB calls, pass-by-reference can be enabled which avoids copying of arguments and results.

Hope this helps! Let me know if you have any other questions.