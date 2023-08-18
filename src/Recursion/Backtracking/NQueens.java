package Recursion.Backtracking;


import java.util.Arrays;

public class NQueens
{
    public static void main(String[] args)
    {
        int m = 4;
        boolean[][] chess = new boolean[m][m];
        System.out.println(nQueens(chess,0));
    }

    static int nQueens(boolean[][] board , int row)
    {
        if(row == board.length){
            display(board);
            return 1;
        }
        int count = 0;
        // Placing the queen after checking for every row and column.
        for (int col = 0; col < board.length; col++) {
                // place the queen if it is safe
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count += nQueens(board,row+1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // Check the vertical line
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }

        // Checking the left diagonal
        for (int i = 1; i <= Math.min(row,col); i++) {
            if(board[row-i][col-i]){
                return false;
            }

        }
        // Checking the right diagonal
        for (int i = 1; i <= Math.min(row, board.length - col - 1); i++) {
            if(board[row-i][col+i]){
                return false;
            }

        }
        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] arr : board){
            for(boolean element : arr){
                if(element){
                    System.out.print(" Q ");
                }else{
                    System.out.print(" __ ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }
}
