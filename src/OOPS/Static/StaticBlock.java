package OOPS.Static;



// This is a demo to show the initialisation of static variables.
public class StaticBlock
{
    static int a = 4;
    static int b;

    // ** ZB **
    // This static block will only run once , when the first object is created
    // i.e. when the class is loaded for the first time

    static{
        System.out.println("Inside the static block.");
        b = a * 5;
    }

    public static void main(String[] args){
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 5;
        System.out.println(StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);


    }



}

