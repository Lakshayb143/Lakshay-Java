package ArrayList_KK;

import java.util.ArrayList;
import java.util.Scanner;

public class BasicOperations
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Input
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        // Get element at any index
        // list[index] syntax will not work here.
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)+ " ");
        }
    }
}
