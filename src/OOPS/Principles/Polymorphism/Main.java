package OOPS.Principles.Polymorphism;

public class Main
{
    public static void main(String[] args)
    {
        Shapes shape = new Shapes();
        Circles circle = new Circles(); // Here it will call the area() of Circles.
        Squares square = new Squares();


//        shape.area();
//        circle.area();


        // But What if,
        Shapes circle2 = new Circles();

        // Above the reference variable is of superclass, and the object is of sub-class.
        // As we know it is the type of reference variable that decides what is accessible?

//        circle2.area();

        // But here it is still calling area() of circles.
        // Here which method will be called depends upon the object type
        // This is known as Upcasting.


        // How Java determines this?
        // Answer is Dynamic Method Dispatch.
        // this is known as Runtime/dynamic Polymorphism.



        // Using Static

        Human human = new Human();
        Lakshay lakshay = new Lakshay();
        Human obj = new Lakshay();

//        human.greeting();
//        lakshay.greeting();
        // Both calls above have called their greeting() method respectively.

//        obj.greeting();// Here it is calling greeting() from Human
        // Reason:
        // Overriding depends upon objects.
        // But static doesn't depend on objects.
        // Hence, static methods can't be overridden.

        lakshay.greeting(); // Here it is calling greeting() from Human

        // We can inherit static methods but can't override them.

        // Method overloading and overriding doesn't  apply to instance variables.



    }
}
