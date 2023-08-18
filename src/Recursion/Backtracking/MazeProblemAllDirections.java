package Recursion.Backtracking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MazeProblemAllDirections {

    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
//        System.out.println(waysToReach("", maze, 0, 0, new ArrayList<>()).size());
        allPathPrint("",maze,0,0,new int[maze.length][maze[0].length],1);

    }

    static List<String> waysToReach(String proccessed, boolean[][] maze, int row, int col, List<String> list) {

        if (row == maze.length - 1 && col == maze[0].length - 1) {
            list.add(proccessed);

            return list;
        }

        if (!maze[row][col]) {
            return list;
        }

        maze[row][col] = false;

        if ((row < maze.length - 1)) {
            waysToReach(proccessed + "Down ", maze, row + 1, col, list);
        }
        if ((col < maze[0].length - 1)) {
            waysToReach(proccessed + "Right  ", maze, row, col + 1, list);
        }
        if (row > 0) {
            waysToReach(proccessed + "Up ", maze, row - 1, col, list);
        }
        if (col > 0) {
            waysToReach(proccessed + "Left ", maze, row, col - 1, list);
        }

        // At this line function will be over
        // So before the function return to previous recursive calls, revert the changes made in this call
        maze[row][col] = true;

        return list;

    }
    static void allPathPrint(String proccessed , boolean[][] maze, int row, int col, int[][] path, int step)
    {

        if(row == maze.length - 1 && col == maze[0].length - 1){
            path[row][col] = step;
            for (int[] arr :
                    path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(proccessed);
            System.out.println("\n\n");
            return;

        }

        if(!maze[row][col]){
            return;
        }


        maze[row][col] = false;
        path[row][col] = step;

        if((row < maze.length - 1) ) {
            allPathPrint(proccessed+"Down ",maze,row + 1,col,path,step+1);
        }
        if((col < maze[0].length - 1)){
            allPathPrint(proccessed+"Right ",maze,row ,col  +1,path,step+1);
        }
        if(row > 0){
            allPathPrint(proccessed+"Up ",maze,row-1,col,path,step+1);
        }
        if(col > 0){
            allPathPrint(proccessed+"Left ",maze,row,col-1,path,step+1);
        }

        // At this line function will be over
        // So before the function return to previous recursive calls, revert the changes made in this call
        maze[row][col] = true;
        path[row][col] = 0;


    }
}


