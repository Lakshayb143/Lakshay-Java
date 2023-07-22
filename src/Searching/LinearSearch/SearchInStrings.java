package Searching.LinearSearch;

import java.util.Scanner;

public class SearchInStrings
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        char target = 'y';
        System.out.println(searchString(name,target));
        System.out.println(searchString3(name,target));

    }

    static boolean searchString(String str, char target)
    {
        if(str.length()==0){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }


    static boolean searchString2(String str , char target)
    {
        if(str.length()==0) {
            return false;
        }
        for(char element : str.toCharArray()){
            if(target==element){
                return true;
            }
        }
        return false;
    }

    // Search the String and return the index.
    static int searchString3(String str, char target)
    {
        if(str.length()==0){
            return -1;
        }

        for (int i = 0; i < str.length(); i++) {
            if(target==str.charAt(i)){
                return i ;
            }
        }
        return -1;
    }

    static boolean searchInRange(String str , char target , int start , int end)
    {
        if(start>end || str.length()==0){
            return false;
        }

        for (int i = start; i <end ; i++) {
            if (str.charAt(i) == target) {
                return true;
            }

        }

        return false;
    }
}
