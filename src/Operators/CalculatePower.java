package Operators;


import java.util.Scanner;

public class CalculatePower
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base = ");
        int base = scan.nextInt();
        System.out.print("Enter the power = ");
        int pow = scan.nextInt();
        System.out.println(power(base,pow));
    }

    static int power(int base, int pow) {

        int answer = 1;
        while(pow > 0){
            if((pow&1)== 1){
                answer = answer * base;
            }
            base = base * base;
            pow = pow>>1;
        }
        return answer;
    }
}
