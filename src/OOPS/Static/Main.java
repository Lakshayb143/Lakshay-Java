package OOPS.Static;

public class Main
{
    public static void main(String[] args)
    {
        Human lakshay = new Human(18,"Lakshay Bhatia",1000,false);
        Human Vishesh = new Human(20,"Vishesh Gumber",100000,true);


//        System.out.println(lakshay.population); // This will also work work. But the convention is to use the class name.
        System.out.println(Human.population);

//        greeting();// This is showing error(non-static method greeting() cannot be referenced from a static context)
//                      because  static method can only call static methods.
                    // it cannot call non-static methods.
        Main obj = new Main();
//        obj.greeting();


//        fun(); // We can class this because we can call static methods inside a static method.
    }


    static void fun(){
//        greeting();// We can't use greeting methods as it requires an instance
                    // But the function fun doesn't require any instance

        // you cannot access non-static stuff without referencing their instances in
        // a static context

        // Here , the we are referencing it.
        Main obj = new Main();
        obj . greeting() ;
    }


    void fun2(){
        greeting();
        // Here we can call this because :--
        /*
        Fact: Any method(non-static/static) at the end it will be called inside a static method that is main.
        So  for calling fun2 we require to create a object of Main class. So we can call non-static method inside a
        non-static method without creating a object because it will refer the object using the non-static was called.
        */
    }



    // As this is a non-static method, this belongs to a object.
    void greeting(){
        System.out.println("Hello");
        fun(); // But we can call a static method inside a non-static method because it doesn't limit this.
    }
}
