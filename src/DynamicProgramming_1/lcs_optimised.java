package DynamicProgramming_1;
import java.util.Scanner;
import java.util.Arrays;
public class lcs_optimised {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(lcs(s1, s2));
    }

    public static int lcs(String s1,String s2){
        int n=s1.length();
        int m=s2.length();

        int prev[]=new int[m+1];
        int curr[]=new int[m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    curr[j]=1+prev[j-1];
                }
                else{
                    curr[j]=Math.max(prev[j],curr[j-1]);
                }
                prev=Arrays.copyOf(curr,m+1);
            }


        }

        return curr[m];
    }


}


