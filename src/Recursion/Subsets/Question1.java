package Recursion.Subsets;

import java.util.ArrayList;

public class Question1
{
    static  ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args)
    {
        // Question : Find all the subset of given String/Array?
        // Subsets -> Arrays
        // Subsequence -> Strings
//        subSequence("","abc");
//
//        subSequence("","abc",list);
//        System.out.println(list);
//        ArrayList<String> list2 = new ArrayList<>();
//        System.out.println(subSeq("","abc",list2));
//        System.out.println(list2);

        System.out.println(subSeq("","abc"));


    }


    static void subSequence(String proccessed , String unProcessed)
    {
        if(unProcessed.isEmpty()){
            System.out.println(proccessed);
            return;
        }

        char c = unProcessed.charAt(0);

         subSequence(proccessed + c,unProcessed.substring(1));
         subSequence(proccessed,unProcessed.substring(1));

    }

    static void subSequence(String proccessed, String unProcessed , ArrayList<String> list){
        if(unProcessed.isEmpty()){
            list.add(proccessed);
            return;
        }
        char c = unProcessed.charAt(0);

        subSequence(proccessed + c,unProcessed.substring(1),list);
        subSequence(proccessed,unProcessed.substring(1),list);


    }

    static ArrayList<String> subSeq(String p , String up , ArrayList<String> list)
    {
        if(up.isEmpty()){
            list.add(p);

        }
        char c = up.charAt(0);

        subSequence(p + c,up.substring(1),list);
        subSequence(p,up.substring(1),list);

        return list;
    }

    static ArrayList<String> subSeq(String p , String up)
    {
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char c = up.charAt(0);
        ArrayList<String> ans = subSeq(p+c,up);
        ArrayList<String> ans2 = subSeq(p,up);
        list.addAll(ans);
        list.addAll(ans2);

        return list;
    }

}
