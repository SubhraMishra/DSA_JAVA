package DynamicProgramming_1;

public class house_robber_space {


    public static void main(String args[]) {
     int arr[]={1,2,3,1};
        System.out.println(solve(arr));
    }

    public static int solve(int arr[]){
        int prev=arr[0];
        int prev2=0;
        int curr=0;

        for(int i=1;i<arr.length;i++){
            int pick=arr[i];
            if(i>1)
                pick+=prev2;
            int notpick=0+prev;

            curr=Math.max(pick,notpick);
            prev2=prev;
            prev=curr;
        }

        return prev;
    }

}
