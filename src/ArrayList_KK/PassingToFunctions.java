package ArrayList_KK;

import java.util.ArrayList;
import java.util.Scanner;

public class PassingToFunctions
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            list.add(input.next());
        }
        System.out.println(list);
        change(list);
        System.out.println(list);


    }

    static void change(ArrayList<String> arrayList)
    {
        arrayList.set(0,"Changed");
    }
}
