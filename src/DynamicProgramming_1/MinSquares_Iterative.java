package DynamicProgramming_1;

import java.util.Scanner;

public class MinSquares_Iterative {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.print(minSquares(n));

    }

    private static int minSquares(int n) {
        int dp[]=new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            int minAns=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                int currAns=dp[i-(j*j)];
                if(minAns>currAns){
                    minAns=currAns;
                }
            }
            dp[i]=1+minAns;
        }
        return dp[n];
    }
}
