package Recursion.Backtracking;

class ValidSudoku {
    public static void main(String[] args) {
        char[][] suduko = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isValidSudoku(suduko));
    }
    public static  boolean isValidSudoku(char[][] sudoku) {
        int n = sudoku.length;
  
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(sudoku[i][j] != '.'){
                    if(!(isSafe(sudoku,i,j,sudoku[i][j] - '0'))){
                        return false;
                    }
                    
                }
            }
        
        }

        return true;

    }

    private static boolean isSafe(char[][] board , int row , int col , int num)
    {
        // checking the row
        for (int i = col +1; i < board.length; i++) {
            if(board[row][i] - '0' == num){
                return  false;
            }
        }
        // checking the col
        for (int i = row +1; i < board.length; i++) {
            if(board[i][col] - '0' == num){
                return false;
            }

        }

        int sqrt = (int)(Math.sqrt(board.length));
        int srow = row - (row % sqrt);
        int scol = col - (col % sqrt);

        for (int i = srow ; i < srow + sqrt ; i++) {
            for (int j = scol; j < scol + sqrt; j++) {
                if(!(i==row && j == col)){
                    if( board[i][j] - '0' == num){
                        return false;
                    }
                }

                }


        }

        return true;
    }
}