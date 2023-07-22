package Recursion.Pattern;

public class Question
{
    public static void main(String[] args)
    {
        pattern2(4,0);


    }

    /*
    Pattern 1.
    for n = 4
    ****
    ***
    **
    *
    print above pattern using recursion.
    */


    private static void pattern1(int row, int col)
    {
        if(row == 0){
            return;
        }

        if(row > col){
            System.out.print("*");
            pattern1(row,++col);
        }else{
            System.out.println();
            pattern1(--row,0);
        }
    }

      /*
      pattern 2;
            *
            **
            ***
            ****
    */
    private static void pattern2(int row, int col)
    {
        if(row == 0){
            return;
        }

        if(row > col){
            pattern2(row,++col);
            System.out.print("*");
        }else{
            pattern2(--row,0);
            System.out.println();
        }
    }
}
