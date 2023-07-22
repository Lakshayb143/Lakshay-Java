package Questions.Math;

import java.util.ArrayList;

public class Factor
{
    public static void main(String[] args)
    {
        int n = 20;
        optimizedFactors2(n);


    }

    // O(n)
    static void factors(int n)
    {
        for(int i = 1 ; i<= n ; i++){
            if(n % i == 0){
                System.out.print(i+" ");
            }
        }
    }

    // Time : O(sqrt(n))
    // Here the factors are not printing in the sorted order.
    static void optimizedFactors(int n)
    {
        for(int i = 1; i * i <= n ; i++ ){
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i+ " ");
                }else{
                    System.out.print(i + " " + n/i + " ");
                }

            }


        }
    }

    // Time and space complexity : O(log(n))
    static void optimizedFactors2(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i * i <= n ; i++ ){
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " " );
                    list.add(n/i);
                }

            }
        }
        for(int i = list.size() - 1; i >=0 ; i--){
            System.out.print(list.get(i)+ " ");
        }
    }
}
