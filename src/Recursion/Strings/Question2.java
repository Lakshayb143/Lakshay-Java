package Recursion.Strings;

import java.util.Locale;

public class Question2
{
    public static void main(String[] args)
    {

        System.out.println(removeString("Lakshay Bhatia","lakshay"));

    }


    static String removeString(String str , String target)
    {
        if(str.isEmpty()){
            return "";
        }
        String newstr = str.toUpperCase();
        target = target.toUpperCase();
        if(newstr.startsWith(target)){
            return removeString(str.substring(target.length()),target);
        }else{
            return str.charAt(0) + removeString(str.substring(1),target);
        }
    }

}
