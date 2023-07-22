package OOPS.Interfaces.Nested;

public class A
{
    // nested interface
    // The key difference between a nested Interface and main one is
    // Nested interface can be public ,private or protected. But main one can only be public
    protected interface NestedInterface{
        boolean isEven(int num);
    }
}


class B implements A.NestedInterface{
    @Override
    public boolean isEven(int num){
        return (num & 1) != 1;
    }
}
