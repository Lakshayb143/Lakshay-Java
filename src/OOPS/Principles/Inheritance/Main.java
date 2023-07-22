package OOPS.Principles.Inheritance;

public class Main
{
    public static void main(String[] arg)
    {
        Car mahindra = new Car();
        Car maruti = new Car(500000,4);
//        System.out.println(maruti);

//        System.out.println(mahindra.price);
//        System.out.println(maruti.price);

        Sedan bmw = new Sedan(1000000,5,true);

//        System.out.println(bmw.price);
//        System.out.println(bmw);
//        System.out.println(bmw.EV);


        /*
         ** Very Important **
        * Although a subclass/child-class inherits all the members and methods of the super class,
          But it cannot access  methods and members which are declared as private in super class.
        *
        */

        Car toyota = new Sedan(1000000,7,false);
//        System.out.println(toyota.EV); // This will give a error because
        // ** Note **
        // It is important to understand that it is the type of reference variable ( not the type of the object that
        // it refers to) that determines what members can be accessed.

        // When the reference of the subclass object is assigned to superclass variable , only those members
        // can be accessed which are defined by superclass.

        // SuperClass ref = new SubClass();
        // Here you can only access variables and methods defined in superclass.


//        Sedan mg = new Car(50000,4);

        // The above statement is giving an error because :-
        // As we know there are many variables in parent and child class
        // As we know it is the type of reference variable that determines the access to variables.
        // So , all the variables of subclass should be initialised
        // But , How will you call the constructor for initialising the variables of subclass using superclass constructor
        // Because Superclass has no idea about its subclasses but subclasses know about their superclasses.
        // Hence, you cannot assign a subclass reference to superclass object.



        Mercedes GWagon = new Mercedes(1000000,7,false,'G');
        System.out.println(GWagon);





    }
}
