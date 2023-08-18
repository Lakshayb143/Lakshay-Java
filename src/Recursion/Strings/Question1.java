package Recursion.Strings;

public class Question1
{

    public static void main(String[] args)
    {
        // Question is you are given a String. You have to return a new String after removing a particular character .
        // Let say the character is a
        // Using Loops solved : Strings_KK/StringQuestions.java

        char chr = 'a';
        removeChar("Lakshay","",chr);

        System.out.println(removeChar("Lakshay"));




    }

    static void removeChar(String str , String removed , char chr)
    {
        if(str.isEmpty()){
            System.out.println(removed);
            return;
        }

        char c = str.charAt(0);

        if (chr == c) {
            removeChar(str.substring(1), removed, chr);
        } else {
            removeChar(str.substring(1), removed + c, chr);
        }

    }


    // My approach
    static StringBuilder removeChar(String str, char chr)
    {
        StringBuilder processed = new StringBuilder();
        if(str.isEmpty()){
            return processed;
        }
        char c = str.charAt(0);
        StringBuilder ansfrombelowcalls;

        if (chr == c) {
            ansfrombelowcalls = removeChar(str.substring(1), chr);
        } else {
            processed.append(c);
            ansfrombelowcalls= removeChar(str.substring(1),  chr);

        }

        processed.append(ansfrombelowcalls);

        return processed;

    }

    //Optimized Solution
    static String removeChar(String str)
    {
        if(str.isEmpty()){
            return "";
        }

        char c = str.charAt(0);

        if('a' == c){
            return removeChar(str.substring(1));
    }
        else{
            return c + removeChar(str.substring(1));
        }
    }



    }





