package Recursion.IQ;

import java.util.ArrayList;
import java.util.List;

public class Question2
{
     // Question : You are given a die. What are all the possible combinations to get a given number?

     public List<String> possibleCombinations(int digit){
       List<String> list =helper(digit,"",new ArrayList<>());
       return list;
     }

     private List<String> helper(int digits,String num ,List<String> list)
     {
          if(digits==0){
               list.add(num);
               return list;

          }

          for(int i = 1 ; i <= 6 && i <= digits  ; i++){

               helper(digits-i, num+i,list);
          }
          return list;

     }
}
