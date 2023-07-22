package Operators;

import java.util.Scanner;

public class XOR
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // Range xor from a to b -> startXor(b) ^ startXor(a - 1);
        System.out.println(startXor(b) ^ startXor(a - 1));
//        System.out.println(2^3^4^5^6^7^8^9);

    }

    // This function gives XOR from 0 to a.
    static int startXor(int a)
    {
        if(a%4==0){
            return a;
        } else if (a % 4 == 1) {
            return 1;
        }else if(a % 4 == 2){
            return a + 1;
        }

        return 0;
    }

}
