package OOPS.Introduction;

public class Finalize
{
    public static void main(String[] args)
    {

        Random A;
//
//        for(int i = 0 ; i < 10000000 ; i++){
//            A = new Random("Lakshay Bhatia");
//        }

        // After this loop , due to the load on memory because of so many objects with no reference variable.
        // The finalize() method will run . And you will see the message on console.

    }
}


class Random
{
    String name;
    Random(String name){
        this.name = name;
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("The object is destroyed.");
    }
}
