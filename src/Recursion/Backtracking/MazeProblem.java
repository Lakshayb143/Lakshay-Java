package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class MazeProblem
{
    public static void main(String[] args)
    {
//        System.out.println(waysCount(3,3));
        System.out.println(waysCount(3,3));
        System.out.println(waysToReachDiagonally("",3,3,new ArrayList<>()).size());

    }

    static List<String> waysToReach(String processed , int row , int col , List<String> list)
    {
        if(row == 1 && col == 1){
            list.add(processed);
            return list;
        }
        if(col > 1){
            waysToReach(processed+"R",row,col-1,list);
        }
        if (row>1){
            waysToReach(processed+"D",row-1,col,list);

        }


        return list;
    }

    static List<String> waysToReach(String processed , int row , int col){
        if(row == 1 && col == 1){
            List<String> l = new ArrayList<>();
            l.add(processed);
            return l;
        }

        List<String> list = new ArrayList<>();
        if(col > 1){
            list.addAll(waysToReach(processed+"R",row,col-1));
        }
        if (row>1){
           list.addAll( waysToReach(processed+"D",row-1,col));

        }


        return list;

    }

    static List<String> waysToReachDiagonally(String processed , int row , int col , List<String> list)
    {
        if(row == 1 && col == 1){
            list.add(processed);
            return list;
        }
        if(col > 1){
            waysToReachDiagonally(processed+"Right ",row,col-1,list);
        }
        if (row>1){
            waysToReachDiagonally(processed+"Down ",row-1,col,list);
        }
        if(row>1 && col>1){
            waysToReachDiagonally(processed + "Diagonally ",row-1,col-1,list);
        }


        return list;
    }

    static int waysCount(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }

        return waysCount(row -1,col) + waysCount(row,col-1);
    }
}
