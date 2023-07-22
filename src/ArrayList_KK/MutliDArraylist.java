package ArrayList_KK;

import java.util.ArrayList;
import java.util.Scanner;

public class MutliDArraylist
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        // Multi Dimensional Arraylist
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        System.out.println(list);

        // Initialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        System.out.println(list);

        // Adding elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(input.nextInt());
            }
        }
        System.out.println(list);


    }


}
