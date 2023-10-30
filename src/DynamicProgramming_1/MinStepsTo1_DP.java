package DynamicProgramming_1;

import java.util.Scanner;


public class MinStepsTo1_DP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(steps(num));
    }
    public static int steps(int n){
//        if(n==0 || n==1)
//            return 0;
//        else if(n==2||n==3)
//            return 1;

        int dp[]=new int[n+1];
        for(int i=0;i<n+1;i++){
            dp[i]=-1;
        }
        dp[1]=0;
        dp[2]=1;
        dp[3]=1;


        for(int i=4;i<=n;i++){

        int sub=dp[i-1];

        int divide2=Integer.MAX_VALUE;
        if(i%2==0)
        {
         divide2=dp[i/2];
        }

        int divide3=Integer.MAX_VALUE;
        if(i%3==0)
        {
            divide3=dp[i/3];
        }

        dp[i]=1+Math.min(sub,Math.min(divide2,divide3));
        }
        return dp[n];
    }
}
