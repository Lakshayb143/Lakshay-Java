package LeetCodeProblems.Hard;

public class SplitArrayLargestSum
{
    // Question : https://leetcode.com/problems/split-array-largest-sum/
    public static void main(String[] args)
    {
        int[] arr = {7,2,5,10,8};
        System.out.println(splitArray(arr,2));

    }

    public static int splitArray(int[] arr, int k)
    {
        int start = maxElement(arr);
        int end  = sumOfArray(arr);
        while(start != end){
            // Try for middle as the potential answer.
            int mid = start + (end - start)/2;

            // Calculating in how many pieces you can divide this with max sum.
            int pieces = 1;
            int sum = 0;
            for(int element : arr){
                if(sum + element > mid){
                    // You cannot add this in the sub array.
                    sum = element;
                    pieces++;
                }else{
                    sum += element;
                }
            }



            if(pieces <= k){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    private static int maxElement(int[] arr) {
        int max = arr[0];
        for(int e : arr){
            if(max < e){
                max = e;
            }
        }
        return max;
    }

    private static int sumOfArray(int[] arr) {
        int sum = 0;
        for(int e : arr){
            sum += e;
        }

        return sum;
    }

}
