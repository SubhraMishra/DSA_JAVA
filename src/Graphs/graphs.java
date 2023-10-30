package Graphs;
import java.util.Queue;
import java.util.LinkedList;

import java.util.Scanner;

public class graphs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt();
        int adjmatrix[][]=new int[n][n];
        for(int i=0;i<e;i++){
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            adjmatrix[v1][v2]=1;
            adjmatrix[v2][v1]=1;

        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(adjmatrix[i][j]+" ");
            }
            System.out.println();
        }
        dftraversal(adjmatrix);
        //bftraversal(adjmatrix);

    }


      public static void dftraversal(int adjmatrix[][],int currentvertex,boolean visited[]){
        visited[currentvertex]=true;
        System.out.print(currentvertex+" ");
        for(int i=0;i<adjmatrix.length;i++){
            if(adjmatrix[currentvertex][i]==1 && visited[i]==false){
                dftraversal(adjmatrix,i,visited);
            }
        }
    }
    public static void dftraversal(int adjmatrix[][]){
        boolean visited[]=new boolean[adjmatrix.length];
        dftraversal(adjmatrix,0,visited);
    }
    //private static void bftraversal(int[][] adjmatrix) {
      //  Queue<Integer> pendingvertices=new LinkedList<>();
        //boolean visited[]=new boolean[adjmatrix.length];
        //visited[0]=true;
        //pendingvertices.add(0);

        //while(!pendingvertices.isEmpty()){
          //  int currentVertex=pendingvertices.poll();
         //   System.out.print(currentVertex+" ");
           // for(int i=0;i<adjmatrix.length;i++){
             //   if(adjmatrix[currentVertex][i]==1 && !visited[i]){
               //     pendingvertices.add(i);
                 //   visited[i]=true;
                //}
            //}

        //}

    //}
}
