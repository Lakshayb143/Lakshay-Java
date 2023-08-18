package Recursion.Backtracking;

//import static Recursion.Backtracking.NQueens.isSafe;

public class NKnights
{
    public static void main(String[] args)
    {
        int m=4;
        boolean[][] chess = new boolean[m][m];
        System.out.println(nKnights(chess,0,0,m));

    }

    static int nKnights(boolean[][] board , int row , int col , int targets)
    {
        if(targets == 0)
        {
            display(board);
            return 1;
        }

        int count = 0;

        if(row == board.length - 1 && col == board.length){
            return 0;
        }

        if(col == board.length){
            return nKnights(board,row+1,0,targets);
        }

        if(isSafe(board,row,col)){
            board[row][col]  = true;
            count += nKnights(board,row,col+1,targets-1);
            board[row][col] = false;
        }

        count += nKnights(board,row,col+1,targets);



        return count;
    }

    private static boolean isSafe(boolean[][] board,int row,int col){
        if(board[row][col]){
            return false;

        }
        if(row > 1 && col > 0 && board[row-2][col-1]){
            return false;
        }
        if(row > 1 && col != board.length - 1 && board[row-2][col+1]){
            return false;
        }

        if(row > 0 && col < board.length - 2 && board[row-1][col+2]){
            return false;
        }

        if(row > 0 && col > 1 && board[row-1][col-2]){
            return false;
        }

        return true;
    }


    private static void display(boolean[][] board) {
        for(boolean[] arr : board){
            for(boolean element : arr){
                if(element){
                    System.out.print(" K ");
                }else{
                    System.out.print(" _ ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }
}
