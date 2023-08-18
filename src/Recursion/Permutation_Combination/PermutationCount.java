package Recursion.Permutation_Combination;

public class PermutationCount
{
    public static void main(String[] args)
    {
        System.out.println(permutationCount("","abcf"));

    }

     static int permutationCount(String p , String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
         for (int i = 0; i < p.length() + 1; i++) {
             String first = p.substring(0,i);
             String second = p.substring(i);

             count = count + permutationCount(first+ch+second,up.substring(1));

         }
         return count;
     }
}
