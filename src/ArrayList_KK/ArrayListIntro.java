package ArrayList_KK;

import java.util.ArrayList;

public class ArrayListIntro
{
    public static void main(String[] args)
    {
    /*
         It is similar to vectors in C++.
         first we need to import the ArrayList class
         By using java.util.Arraylist;
         Primitive Data type can't be stored directly.
         We use wrapper class
         we cannot store int . We will store Integer.


    */
        ArrayList<Integer> dynamicArray = new ArrayList<>();
        System.out.println(dynamicArray);
        for (int i = 1; i < 11; i++) {
            dynamicArray.add(i);

        }
        System.out.println(dynamicArray);// We can directly print arraylist.
        dynamicArray.set(9,100);
        System.out.println(dynamicArray);
        dynamicArray.remove(9);
        System.out.println(dynamicArray);

    }
}
