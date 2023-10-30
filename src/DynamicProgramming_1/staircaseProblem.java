package DynamicProgramming_1;
import java.util.Scanner;

public class staircaseProblem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(stairs(n));

    }

    public static long stairs(int n){
        if(n==0){
            return 1;
        }
        if(n==1 || n==2){
            return n;
        }
        long ways[]=new long[n+1];
        ways[0]=1;
        ways[1]=1;
        ways[2]=2;
        for(int i=3;i<=n;i++){
            ways[i]=ways[i-1]+ways[i-2]+ways[i-3];
        }

        return ways[n];
    }

}
