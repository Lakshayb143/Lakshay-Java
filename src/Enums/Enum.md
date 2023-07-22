The reason why enum constructors cannot be public or protected is to
ensure that the enum constants are properly controlled and managed by the enum type itself.
Allowing public or protected constructors would potentially enable external code to 
create new instances of enum constants, which would break the intended design of enums 
as a finite set of predefined constants.

```All Enums inherit Enum class```
So, **enum** cannot extend any class, But it can implement any number of interfaces.