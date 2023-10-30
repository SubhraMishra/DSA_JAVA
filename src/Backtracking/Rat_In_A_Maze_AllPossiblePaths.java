package Backtracking;

public class Rat_In_A_Maze_AllPossiblePaths {

    public static void main(String[] args) {

    int maze[][]={{1,1,0},{1,1,0},{1,1,1}};
    RatInaMaze(maze);

}

    public static void RatInaMaze(int[][] maze) {
        int l=maze.length;
        int path[][]=new int[l][l];
        PrintAllPaths(maze,0,0,path);
    }

    public static void PrintAllPaths(int[][] maze, int i, int j, int[][] path) {

        int l=maze.length;
        //Check if i and j is valid or not
        if(i<0 || i>=l || j<0 || j>=l || maze[i][j]==0 || path[i][j]==1 ){
            return;
        }

        path[i][j]=1; //include the cell in current path

        if(i==l-1 && j==l-1){
            for(int r=0;r<l;r++){
                for(int c=0;c<l;c++){
                    System.out.print(path[r][c]+" ");
                }
                System.out.println();
            }
            System.out.println();
            path[i][j]=0;
            return;
        }

        //explore further in different directions

        //top
        PrintAllPaths(maze,i-1,j,path);

        //right
        PrintAllPaths(maze,i,j+1,path);


        //bottom
        PrintAllPaths(maze,i+1,j,path);



        //left
        PrintAllPaths(maze,i,j-1,path);
        path[i][j]=0;

        }

    }



