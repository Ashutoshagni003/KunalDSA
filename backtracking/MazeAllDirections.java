package backtracking;

import java.util.Arrays;

public class MazeAllDirections {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        int[][] path = new int[maze.length][maze[0].length];
//        allPath("",maze,0,0);
        allPathPrint("",maze,0,0,path,1);
    }
    public static void allPath(String p,boolean[][] maze, int row, int col){
        if(row == 2 && col == 2){
            System.out.println(p);

            return;
        }
        if(!maze[row][col]){
            return;
        }
        maze[row][col] = false;

        if(row < maze.length-1){
            allPath(p+'D',maze,row+1,col);
        }
        if(col > 0){
            allPath(p+'L',maze,row,col - 1);
        }
        if(row > 0){
            allPath(p+'U',maze,row -1,col);
        }
        if(col < maze[0].length-1){
            allPath(p+'R',maze,row,col + 1);
        }
        maze[row][col] = true;
    }
    public static void allPathPrint(String p,boolean[][] maze, int row, int col,int[][] path,int step){
        if(row == 2 && col == 2){
            path[row][col] = step;
            for (int[] arr:path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();

            return;
        }
        if(!maze[row][col]){
            return;
        }
        maze[row][col] = false;
        path[row][col] = step;

        if(row < maze.length-1){
            allPathPrint(p+'D',maze,row+1,col,path,step+1);
        }
        if(col > 0){
            allPathPrint(p+'L',maze,row,col - 1,path,step+1);
        }
        if(row > 0){
            allPathPrint(p+'U',maze,row -1,col,path,step+1);
        }
        if(col < maze[0].length-1){
            allPathPrint(p+'R',maze,row,col + 1,path,step+1);
        }
        maze[row][col] = true;
        path[row][col] = 0;
    }
}
