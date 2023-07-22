package Pattern_Questions;
import java.io.*;
import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int[] A = new int[a];
        int[] B = new int[b];

        for(int i = 0; i<A.length;i++){
            A[i] = in.nextInt();
        }

        for(int i = 0; i<B.length;i++){
            B[i] = in.nextInt();
        }

        int count = 0;

        for(int element : A){
            for( int i = 0; i<B.length;i++){
                if(element == B[i]){
                    count++;
                }

            }
        }

        if(count==0){
            System.out.println(-1);
        }
        else{
            System.out.println(count);
        }



    }
}