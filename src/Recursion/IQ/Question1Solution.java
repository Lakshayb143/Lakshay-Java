package Recursion.IQ;
import java.util.List;
import java.util.ArrayList;

public class Question1Solution
{

    private List<String> ans = new ArrayList<>();

    private void solve2(String digits, String[] arr, int i, String com) {
        if (i == digits.length()) {
            ans.add(com);
            return;
        }
        char c = digits.charAt(i);
        String a = arr[c - '0'];
        for (char x1 : a.toCharArray()) {
            solve2(digits, arr, i + 1, com + x1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> a = new ArrayList<>();
        if (digits.isEmpty()){
            return a;
        }

        String[] arr = {"0", "0", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        solve2(digits, arr, 0, "");
        return ans;
    }
}
