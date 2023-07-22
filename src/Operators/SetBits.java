package Operators;

import java.util.Scanner;

public class SetBits
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
         int num = scan.nextInt();
         System.out.println(setBits2(num));
    }

   static int setBits(int num) {
        int counter = 0;
        while(num > 0){
            counter++;
            num -= (num & (-num));
        }
        return counter;
    }

    static int setBits2(int num)
    {
        int counter = 0;
        while( num > 0){
            counter++;
            num = num & (num-1);
        }
        return counter;

    }
}
