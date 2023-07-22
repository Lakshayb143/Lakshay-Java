package Strings_KK;

public class StringQuestions
{
    public static void main(String[] args)
    {
        // Question 1: to check whether a string is palindrome or not?
        System.out.println(isPalindrome("abcdcjba"));


    }


    static boolean isPalindrome(String str)
    {
        if(str==null || str.length()==0){
            return true;
        }
        int start = 0;
        int end = str.length()-1;

        while(start<end){
            if(str.charAt(start)!= str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;

        // Using for loop
/*        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if(start!=end){
                return false;
            }
        }
        return true;*/
    }


}
