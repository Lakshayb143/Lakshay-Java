package Recursion.Permutation_Combination;

import Enums.A;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Permutation
{
    public static void main(String[] args)
    {
        String str = "abc";
        ArrayList<String> ans = stringPermutation("",str);
        System.out.println(ans);

    }

    static void permutations(String unproccessed)
    {

        getPermutations("",unproccessed);
        return;
    }

    private static void getPermutations(String proccessed, String unproccessed)
    {
        if(unproccessed.isEmpty()){
        System.out.println(proccessed);
        return;
        }
        char ch = unproccessed.charAt(0);
        for (int i = 0; i < proccessed.length() + 1; i++) {

            String first = proccessed.substring(0,i);
            String second = proccessed.substring(i,proccessed.length());

            getPermutations(first+ch+second,unproccessed.substring(1));


        }


    }

    static ArrayList<String> permutation(String unproccessed){
        return getPermutations("",unproccessed,new ArrayList<>());
    }

    private static ArrayList<String> getPermutations(String proccessed, String unProccessed , ArrayList<String> list){
        if(unProccessed.isEmpty()){
            list.add(proccessed);
            return list;

        }
        char ch = unProccessed.charAt(0);
        for (int i = 0; i < proccessed.length() + 1; i++) {
            String first = proccessed.substring(0,i);
            String second = proccessed.substring(i,proccessed.length());
            getPermutations(first+ch+second,unProccessed.substring(1),list);
        }
        return list;
    }

    static ArrayList<String> stringPermutation(String p , String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        for (int i = 0; i < p.length() + 1; i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            ArrayList<String> ans = stringPermutation(first+ch+second,up.substring(1));
            list.addAll(ans);
        }

        return list;

    }

}
