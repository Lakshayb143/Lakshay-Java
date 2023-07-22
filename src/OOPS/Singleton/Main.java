package OOPS.Singleton;

public class Main
{
    public static void main(String[] args){
//        Singleton obj1 = new Singleton(); // As the modifier is private it can't be accessed outside the class.

        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

        // Here all the three references are pointing to the same object.


    }
}
