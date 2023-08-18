package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class MazeProblemObstacles
{
    public static void main(String[] args)
    {
        boolean[][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        System.out.println(waysToReach("",maze,0,0,new ArrayList<>()));

    }

    static List<String> waysToReach(String proccessed ,boolean[][] maze, int row, int col,List<String> list)
    {

        if(row == maze.length - 1 && col == maze[0].length - 1){
            list.add(proccessed);
            return list;
        }

        if(!maze[row][col]){
            return list;
        }

        if((row < maze.length - 1) ) {
            waysToReach(proccessed+"Down ",maze,row + 1,col,list);
        }
        if((col < maze[0].length - 1)){
            waysToReach(proccessed+"Right  ",maze,row ,col  +1,list);
        }

        return list;

    }
}
