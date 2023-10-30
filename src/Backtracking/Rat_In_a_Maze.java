package Backtracking;

public class Rat_In_a_Maze {
    public static void main(String args[]){
        int maze[][]={{1,1,0},{1,1,0},{1,1,1}};
        boolean IsPathPossible=RatInaMaze(maze);
        System.out.println(IsPathPossible);
    }

    public static boolean RatInaMaze(int[][] maze) {
        int l=maze.length;
        int path[][]=new int[l][l];
        return solveMaze(maze,0,0,path);
    }

    public static boolean solveMaze(int[][] maze, int i, int j, int[][] path) {

        int l=maze.length;
        //Check if i and j is valid or not
        if(i<0 || i>=l || j<0 || j>=l || maze[i][j]==0 || path[i][j]==1 ){
            return false;
        }

        path[i][j]=1; //include the cell in cureent path

       if(i==l-1 && j==l-1){
           for(int r=0;r<l;r++){
               for(int c=0;c<l;c++){
                   System.out.print(path[r][c]+" ");
               }
               System.out.println();
           }
           return true;
       }

       //explore further in different directions

        //top
        if(solveMaze(maze,i-1,j,path)){
            return true;
        }
        //right
        if(solveMaze(maze,i,j+1,path)){
            return true;
        }
        //bottom
        if(solveMaze(maze,i+1,j,path)){
            return true;
        }
        //left
        if(solveMaze(maze,i,j-1,path)){
            return true;
        }

        return false;
    }
}
