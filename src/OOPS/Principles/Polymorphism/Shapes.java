package OOPS.Principles.Polymorphism;

public class Shapes
{
    void area(){
        System.out.println("The area of the shape.");
    }

//    final void area(){
//        System.out.println("The area of the shape.");
//    }

    // Any Method with final keyword cannot be overridden.
    // This process is known as early binding.(notes).
}
