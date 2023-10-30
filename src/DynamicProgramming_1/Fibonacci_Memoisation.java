package DynamicProgramming_1;
import java.util.Scanner;

public class Fibonacci_Memoisation {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();//fibonacci num that needs to be printed
        int dp[]=new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        int ans=fibo(n,dp);
        dp[n]=ans;
        System.out.print(ans);


    }

    private static int fibo(int n, int[] dp) {

        if (n == 0 || n == 1) {
            return n;
        }

        int ans1,ans2;
        if (dp[n - 1] == -1) {
            ans1 = fibo(n - 1, dp);
            dp[n - 1] = ans1;
        }
        else{
            ans1 = dp[n - 1];}

        if (dp[n - 2] == -1) {
            ans2 = fibo(n - 2, dp);
            dp[n - 2] = ans2;
        }
        else{
            ans2 = dp[n - 2];}

        int myans=ans1+ans2;

        return myans;

    }
}
