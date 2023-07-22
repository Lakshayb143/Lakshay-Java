package Operators;

import java.util.Arrays;

class FlipImage
{
    public static void main(String[] args)
    {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] answer = flipAndInvertImages(image);
        for(int[] arr : answer){
            System.out.println(Arrays.toString(arr));
        }

    }

    public static int[][] flipAndInvertImages(int[][] matrix)
    {
        for(int[] row : matrix){
            // reverse this array.
            for(int i = 0 ; i < (matrix[0].length + 1)/2 ; i++){
                int temp = row[i] ^ 1;
                row[i] = row[matrix[0].length - i - 1] ^ 1;
                row[matrix[0].length - i - 1] = temp;
            }
        }

        return matrix;


    }
}