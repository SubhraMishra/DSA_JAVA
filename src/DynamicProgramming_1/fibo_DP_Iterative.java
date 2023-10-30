package DynamicProgramming_1;
import java.util.Scanner;

public class fibo_DP_Iterative {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();//fibonacci num that needs to be printed
        int ans=fibo(n);
        System.out.print(ans);

    }
    private static int fibo(int n){
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }

        return dp[n];
    }
}
