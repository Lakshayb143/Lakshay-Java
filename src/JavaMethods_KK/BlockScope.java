package JavaMethods_KK;

public class BlockScope
{
    public static void main(String[] args)
    {
        int num = 100;
        {
            //int num = 100; // Already initialised outside the block in the same method
                            // Hence you cannot intialise again.
            System.out.println(num);
            num = 200; // Reassign the original reference variable to some other value.
            int number = 300;
        }
        {
            // This is Block scope.
            // Variable inside this block will only accessible in this block only.
            // but variable intialised outside the block in same method, are accessible here..
            System.out.println(num);
            String name = "Lakshay Bhatia";
        }
//        System.out.println(name); // This will give an error because name variable is initialised in the above block.

        System.out.println(num);
        //System.out.println(number); // This is giving error because
         // Values initialised in this block, will remain in this block only.

    }
}
