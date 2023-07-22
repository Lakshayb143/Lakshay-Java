package OOPS.Interfaces;

public interface Test
{
    int num = 0;

    void greeting();
    default void start(){
        System.out.println("Hello World");

    }
}
