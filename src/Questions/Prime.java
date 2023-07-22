package Questions;

import Searching.LinearSearch.FindMax;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Prime
{
//    You are given a number n. Find all the numbers less than or equal to n that are prime numbers.



    public static void main(String[] args)
    {
        int num = 40;
        // Using method 1.
//        for(int i = 2; i <= num ; i++){
//            if(isPrime(i)){
//                System.out.print(i+ " ");
//            }
//        }

        // Method 2
        int n = 37;
        boolean[] primes = new boolean[n+1];
        sieve(n,primes);

    }

    // Method 1 - brute force method
    static boolean isPrime(int n)
    {
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    // Method 2 - More optimized approach.
    // Sieve of Eratosthenes  is an ancient algorithm for finding all prime numbers up to any given limit.
    static void sieve(int n,boolean[] prime)
    {
        // initially all the values in the primes array are false.
        for(int i = 2 ; i * i <= n ; i++){
            if(!prime[i]){
                for(int j = i*2 ; j <= n ; j+=i){
                    prime[j] = true;
                }
            }
        }

        for(int i = 2; i <= n;i++){
            if(!prime[i]){
                System.out.print(i+" ");
            }
        }

    }
}
