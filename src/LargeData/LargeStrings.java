package LargeData;
import java.util.Arrays;
// Documentation - https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/StringBuffer.html
public class LargeStrings
{
    public static void main(String[] args)
    {
        // constructor 1
        //Constructs a string buffer with no characters in it and an initial capacity of 16 characters.
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        // constructor 2
        StringBuffer sb2 = new StringBuffer("Lakshay Bhatia");

        // constructor 3
        StringBuffer sb3 = new StringBuffer(40);
        sb.append("Lakshay");

        sb.insert(7," Bhatia");

        sb.replace(1,7,"Rahul");


//        String s = sb.toString();
//        System.out.println(s);

//        System.out.println((char)122);

        System.out.println(RandomString.randomString(100));

        // removing Whitespaces
        String name = "l a k s h a y";
        System.out.println(name);
        System.out.println(name.replaceAll("\s",""));

        // Split
        String names = "Lakshay Vishesh Aryan Harsh";
        String[] arr = names.split(" ");
        System.out.println(Arrays.toString(arr));
    }
}
