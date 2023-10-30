package Recursion1;
import java.util.Scanner;

public class check_num_in_array {
    public static void main(String args[])
    {
        int n[]={1,5,7,8,9,10};
        Scanner q=new Scanner(System.in);
        int k=q.nextInt();
        boolean output=checknum(n,k);
        System.out.print(output);
    }

    public static boolean checknum(int a[],int num){
       if(a.length==0){
           return false;
       }
       if(a[0]==num)
           return true;

       int smallarray[]=new int[a.length-1];
       for(int i=1;i<=a.length-1;i++){
           smallarray[i-1]=a[i];
       }

       boolean output=checknum(smallarray,num);

       return output;

    }
}
