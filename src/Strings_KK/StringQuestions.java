package Strings_KK;

public class StringQuestions
{
    public static void main(String[] args)
    {
        // Question 1: to check whether a string is palindrome or not?
//        System.out.println(isPalindrome("abcdcjba"));

        // Question 2 : you are given a String. You have to return a new String after removing a particular character .
        // Let say the character is a

        String name = "Lakshay";

        System.out.println(question2(name));


    }


    static boolean isPalindrome(String str)
    {
        if(str==null || str.isEmpty()){
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

    static StringBuilder question2(String name)
    {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) != 'a' && name.charAt(i) != 'A'){
                ans.append(name.charAt(i));
            }
        }

        return ans;



    }


}
