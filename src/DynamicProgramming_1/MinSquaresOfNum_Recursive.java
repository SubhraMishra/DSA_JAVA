package DynamicProgramming_1;

import java.util.Scanner;

public class MinSquaresOfNum_Recursive {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
        System.out.println(sqcount(n));
    }
    public static int sqcount(int n){

        if(n==0)
            return 0;
        int minAns=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int currAns=sqcount(n-(i*i));
            if(minAns>currAns)
                minAns=currAns;
        }
        int myAns=1+minAns;
        return myAns;
    }
}
