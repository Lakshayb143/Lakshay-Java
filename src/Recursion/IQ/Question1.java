package Recursion.IQ;

import java.util.ArrayList;
import java.util.List;

public class Question1
{
    // Question : https://leetcode.com/problems/letter-combinations-of-a-phone-number/https://leetcode.com/problems/letter-combinations-of-a-phone-number/
/*
    Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
    Return the answer in any order.

    A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
    */

    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        return  Combination("" , digits,list);

    }

    private List<String> Combination(String proccessed , String digits, List<String> list){
        if(digits.isEmpty()){
            if(!proccessed.isEmpty()){
                list.add(proccessed);
                return list;
            }else{
                return list;
            }
        }

        int digit = digits.charAt(0) - '0';
        for(int i = (digit -2) * 3 ; i<(digit-1)*3;i++){
            char ch = (char)('a' + i);
            Combination(proccessed+ch,digits.substring(1),list);
        }
        return list;
    }

    private  List<String> getCombination(String proccessed , String digits, List<String> list){
        if(!proccessed.isEmpty()){
            list.add(proccessed);
            return list;
        }
        String[] array = {null,null,"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz",null};
        for (int i = 0; i < digits.length(); i++) {
            int  currentNum= (int)digits.charAt(0) - 48;

            for (int j = 0; j < array[currentNum].length(); j++) {
                String str = array[currentNum];
                char ch = str.charAt(j);
                proccessed = proccessed+ch;
                if(digits.length() > 1){
                    int index = (int)digits.charAt(1) - 48;
                    for (int k = 0; k < array[index].length(); k++) {
                        getCombination(proccessed+array[index].charAt(k),digits.substring(1),list);
                    }
                    proccessed = "";
                }
                else{
                    getCombination(proccessed,digits.substring(1),list);
                    proccessed = "";
                }
            }
            return list;
        }

        return list;


    }
}
