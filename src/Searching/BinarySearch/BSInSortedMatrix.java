package Searching.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BSInSortedMatrix
{
    // This is searching in strictly sorted 2D Array(Matrix).
    public static void main(String[] args)
    {
        int[][] arr = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        };
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int[] ans = binarySearch(arr,target);
        System.out.println(Arrays.toString(ans));
//        for (int i = 0; i < 17; i++) {
//            int target = scanner.nextInt();
//            int[] ans = binarySearch(arr,target);
//            System.out.println(Arrays.toString(ans));
//        }

    }

    // Searches in the row provided between the columns provided.
    static int[] binaryS(int[][] matrix , int row , int cStart , int cEnd , int target)
    {
        if(matrix.length==0){
            return new int[] {-1,-1};
        }

        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            int element = matrix[row][mid];
            if(element==target){
                return new int[] {row,mid};
            }
            else if (element < target){
                cStart = mid + 1;
            }else{
                cEnd = mid - 1;
            }
        }
        return new int[] {-1,-1};

    }

    static int[] binarySearch(int[][] matrix, int target)
    {
        if(matrix.length==0){
            return new int[] {-1,-1};
        }
        int row = matrix.length;
        int col = matrix[0].length ;

        if (row==1){
            return binaryS(matrix,0,0, col -1, target);
        }

        //  Run the loop till 2 rows are remaining.
        int rStart = 0;
        int rEnd = row - 1 ;
        int cMid = col / 2;

        while (rStart  < (rEnd - 1)){ // while this is true there are more than 2 rows always.
            int mid  = rStart + (rEnd - rStart)  / 2;
            int element = matrix[mid][cMid];
            if(element == target){
                return new int[] {mid,cMid};
            }
            else if (element > target){
                rEnd = mid;
            }else{
                rStart = mid;

            }

        }
        // Now we have two rows left.
        // check whether the target is in the col of two rows.
        if(matrix[rStart][cMid] == target){
            return new int[] {rStart,cMid};
        }
        if(matrix[rEnd][cMid] == target){
            return new int[] {rEnd,cMid};
        }

        // Search in the 1st half
        if(target <= matrix[rStart][cMid-1]){
            return binaryS(matrix,rStart,0, cMid -1 ,target);
        }
        // Search in the 2nd half
        if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][col - 1]){
            return binaryS(matrix,rStart,cMid+1,col- 1,target);

        }
        // Search in the 3rd half
        if(target <= matrix[rEnd][cMid-1]){
            return binaryS(matrix,rEnd,0,cMid-1,target);
        }
        // Search in the 4th half
        if(target >= matrix[rEnd][cMid+1]){
            return binaryS(matrix,rEnd,cMid+1,col - 1,target);
        }


        return new int[] {-1,-1};
    }
}
