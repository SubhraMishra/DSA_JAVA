package hashmap;
import java.util.HashMap;
public class pairsum0 {
    static int sum=0,value=0;
    public static int PairSum(int[] input, int size) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        HashMap<Integer,Integer> map=new HashMap<>();
        int pairs=0;
        for(int i=0;i<input.length;i++)
        {
            if (map.containsKey(-input[i])){
                pairs+=map.get(-input[i]);
            }
            if(map.containsKey(input[i]))
            {
                int value=map.get(input[i]);
                map.put(input[i],value+1);
            }
            else{
                map.put(input[i],1);
            }
        }
        return pairs;
        //    for(int i=0;i<input.length;i++)
        //    {
        // 	   if(map.containsKey(-input[i])){
        // 		    value=map.get(input[i])*map.get(-input[i]);
        // 		   map.put(input[i],0);
        // 		   map.put(-input[i],0);
        // 	   }
        // 	   else{
        // 		   continue;
        // 	   }
        // 	   sum=sum+value;
        // 	   value=0;
        //    }
        //    return sum;
    }

    public static void main(String args[])
    {
        int arr[]={2,1,-2,2,0};
        int n=5;
        int output=PairSum(arr,n);
        System.out.print(output);
    }
}

