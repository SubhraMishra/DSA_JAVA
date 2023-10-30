package DynamicProgramming_1;
import java.util.Scanner;
public class Memoisation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input the length of number
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=-1;
        }

        System.out.print(helper(n,arr));
    }

    public static int helper(int n,int arr[]){
        if(n==0)
            return 0;

        if( n==1)
            return 1;

        if(arr[n]!=-1)
            return arr[n];

        int a=helper(n-1,arr);
        int b=helper(n-2,arr);

        arr[n]=a+b;

        return arr[n];

    }
}
