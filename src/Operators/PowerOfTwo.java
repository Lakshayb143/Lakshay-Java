package Operators;

import java.util.Scanner;

public class PowerOfTwo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        System.out.println(check(n));
        System.out.println(check2(n)); // note: It will also return true for 0. Fix this!
    }

    // 1 Method - Not that mazzedar.
    private static boolean check(int n) {
        int counter = 0;

        while(n > 0){
            if((n&1) == 1){
                counter++;
            }
            n = n >> 1;
        }

        return counter == 1;
    }

    // 2 Method - simpler and mazzedar.
    static boolean check2(int n){
        if(n == 0){
            return false;
        }else{
            return (n&(n - 1)) == 0;
        }

    }
}
