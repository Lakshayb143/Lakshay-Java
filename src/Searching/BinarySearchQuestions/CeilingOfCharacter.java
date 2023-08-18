package Searching.BinarySearchQuestions;

class CeilingOfCharacter {
    // Question - https://leetcode.com/problems/find-smallest-letter-greater-than-target/

    public static void main(String[] args) {
        char[] arr = {'e','e','g','g'};
        System.out.println(nextGreatestLetter(arr,'g'));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){

            int mid = start + (end - start)/2;


             if(letters[mid] > target){
                 end = mid - 1;
             }else{
                 start = mid + 1;
             }
        }

        return letters[start % letters.length];
        }


}