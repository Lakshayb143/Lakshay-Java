package Recursion.Backtracking;

import java.util.Arrays;

public class SudoKuSolver
{
//    Question : https://leetcode.com/problems/sudoku-solver/
    public static void main(String[] args)
    {
        char[][] suduko = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};

        if(solveSudoku(suduko)){
            display(suduko);
        }else{
            System.out.println("Cannot be solved");
        }


    }

    static boolean solveSudoku(char[][] sudoku)
    {

        // This is how we removed row, col from arguments;
        int n = sudoku.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(sudoku[i][j] == '.'){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if(!emptyLeft){
                break;
            }
        }

        if(emptyLeft){
            return true; // Sudoku is solved.
        }
        
        // Backtracking.
        for (int number = 1; number <= 9; number++) {
            if(isSafe(sudoku,row,col,number)){
                char c = (char)(number+'0');
                sudoku[row][col] = c;
                if(solveSudoku(sudoku)) {
                    return true;
                }
                else{
                    sudoku[row][col] = '.';
                }
            }
        }
        return false;
    }

    static void display(char[][] board){
        for(char[] arr : board){
            System.out.println(Arrays.toString(arr));
        }
    }

    private static boolean isSafe(char[][] board , int row , int col , int num)
    {
        // checking the row
        for (int i = 0; i < board.length; i++) {
            if(board[row][i] - '0' == num){
                return  false;
            }
        }
        // checking the col
        for (char[] arr : board) {
            if (arr[col] - '0' == num) {
                return false;
                }
            }

        int sqrt = (int)(Math.sqrt(board.length));
        int srow = row - (row % sqrt);
        int scol = col - (col % sqrt);

        for (int i = srow ; i < srow + sqrt ; i++) {
            for (int j = scol; j < scol + sqrt; j++) {
                if(board[i][j] - '0' == num){
                    return false;
                }
                
            }

        }

        return true;
    }
}
