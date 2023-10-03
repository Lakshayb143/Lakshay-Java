package LargeData;

import java.math.BigInteger;
import java.sql.SQLOutput;

public class LargeNumbers
{
    public static void main(String[] args)
    {
        // using int as primitives
        int a = 10;
        int b = 23;

        // converting int/long to BI
        BigInteger A = BigInteger.valueOf(20232233232323232L);
        BigInteger B = BigInteger.valueOf(309309232);

        b = B.intValue(); // converting BI to int

        BigInteger D = new BigInteger("834809853490584305403583408508984464654654321313213489494447412587426931785223336989525553485093485409");
//        System.out.println(D);

        // Constants in BigInteger

//        System.out.println(BigInteger.ONE);
//        System.out.println(BigInteger.TWO);
//        System.out.println(BigInteger.TEN);

        // Operations
        BigInteger sum = A.add(B);
        BigInteger subtract = A.subtract(B);
        BigInteger multiply = A.multiply(B);
        BigInteger division = A.divide(B);
        BigInteger remainder = A.remainder(B);

//        System.out.println(sum + "\n" + subtract + "\n" + multiply + "\n" + division + "\n" + remainder);

        // compare
//        public int compareTo(BigInteger val)
//            A.compareTo(B)
//        -1, 0 or 1 as A  is numerically less than, equal to, or greater than val.
//        System.out.println(A.compareTo(B));
        if(A.compareTo(B)>0){
            System.out.println("A is greater than B");
        }else if(A.compareTo(B)==0){
            System.out.println("A==B");
        }else if(A.compareTo(B)<0){
            System.out.println("A is less than B");
        }

        // Exponent
//        System.out.println(A.pow(45));

        System.out.println(Factorial.factorial(45045));



    }
}
