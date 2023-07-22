package OOPS.Static;



// ** ZB ** : Outside classes cannot be static .
//            Because they it is  not dependent on any other class
// Only nested classes can be static.
public class InnerClasses
{

    public static  class SubClass1{

        String name;

        SubClass1(String name){
            this.name = name;
        }

        @Override // These are known as annotations.
        public String toString(){
            return name+"143";
        }
    }

    // Nested class can be static because they are dependent on outer class.
    public static class SubClass2{
        String name;

        SubClass2(String name){
            this.name = name;
        }

    }

    public static void main(String[] args){

//        InnerClasses obj = new InnerClasses();
        SubClass1 a1 = new SubClass1("Lakshay");
        System.out.println(a1);
//        SubClass1 a2 = new SubClass1("Rahul");



        // Above statements are giving errors because SubClass1 is dependent on outer class(InnerClass).
        // so we have to make Subclass1 static.

        SubClass2 b1 = new SubClass2("Lakshay");
        SubClass2 b2 = new SubClass2("Vishesh");
//
//        System.out.println(b1.name);
//        System.out.println(b2.name);

        // Above statement is not giving an error because this class is static.

    }



}

