package DynamicProgramming_1;
import java.util.Arrays;
public class house_robber
{
    public static void rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        System.out.println( solve(nums,n-1,dp));
    }

    public static int solve(int nums[],int ind,int dp[]){
        if(ind<0)
            return 0;

        if(ind==0)
            return nums[ind];

        if (dp[ind] != -1) return dp[ind];

        int pick=nums[ind]+solve(nums,ind-2,dp);
        int notpick=0+solve(nums,ind-1,dp);

        return dp[ind]=Math.max(pick,notpick);



    }

    public static void main(String args[]){
        int arr[]={1,2,3,1};
        rob(arr);
    }
}


