package Recursion.Easy;

public class Question
{
    /*
    Question : Given an integer num , return the number of steps to reduce it to zero.
               In one step, if a number is even , you have to divide it by 2 , otherwise you have to subtract 1 from it.


    */

    public static void main(String[] args)
    {

        System.out.println(stepsToReduce(8));
    }

    static int helper(int num , int counter){
        if(num == 0){
            return counter;
        }
        if (num % 2 == 0){
            return  helper(num/2 , ++counter);
        }else{
            return helper(--num,++counter);      }


    }

    static int stepsToReduce(int num)
    {
        return helper(num,0);

    }
}
