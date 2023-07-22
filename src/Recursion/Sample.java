package Recursion;

import java.util.Scanner;

public class Sample {
    public static int fibo(int a , int b, int w){
        if(w==0){
            return b;
        }
        int c = a + b;
        return fibo(b,c,w-1);
    }

    public static void main(String[] args) {
        int a = 0 , b =1;
        Scanner scanner = new Scanner(System.in);
        int n = 50;
        int w = n-2;
        int p = fibo(a,b,w);
        System.out.println(p);

    }
}
