package Recursion;

public class Fibonacci {
    static void fibo(int n) {

        int n1 = 0;
        int n2 = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(n1);
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }

    public static void main(String[] args) {
        System.out.println(recurfiboseries(5));
        // Above statement will never return the answer becuase of its time complexity

    }


    // Finding Nth fibonacci number with a formula
    static int fibFormula(int n) {
        return (int) ((Math.pow(1 + Math.sqrt(5) / 2, n) - Math.pow(1 - Math.sqrt(5) / 2, n)) / Math.sqrt(5));
    }

    static int recurfibo(int n) {
        // Base Condition
        if (n < 2) {
            return n;
        }

        return recurfibo(n - 1) + recurfibo(n - 2);

    }

    static int recurfiboseries(int n) {
        if (n < 2) {
            return n;
        }
        int ans = (recurfiboseries(n - 1) + recurfiboseries(n - 2));
        System.out.println(ans);
        return ans;

    }
}
