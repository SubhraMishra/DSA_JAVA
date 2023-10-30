package DynamicProgramming_1;
import java.util.Scanner;
import java.util.Arrays;
public class minCoins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Enter te number
        int num=sc.nextInt();
        //length of array
        int len=sc.nextInt();
        int x[]=new int[len];
        for(int i=0;i<len;i++){
            x[i]=sc.nextInt();
        }
        System.out.print(mincoin(num,x));
    }

    public static int mincoin(int num,int x[]){
        if(num==0)
            return 0;
        int dp[]=new int[num+1];
        Arrays.fill(dp,-1);
        int ans=Integer.MAX_VALUE;

        for(int i=0;i<x.length;i++){
            int subans=0;
            if(num-x[i]>=0){
                  subans=0;
                if(dp[num-x[i]]!=-1){
                    subans=dp[num-x[i]];
                }
                else
                    subans=mincoin(num-x[i],x);
            }

            if(subans!=Integer.MAX_VALUE && subans+1<ans)
                ans=subans+1;
        }

        dp[num]=ans;
        return dp[num];
    }
}
