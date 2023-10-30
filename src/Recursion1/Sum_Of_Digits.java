/*Sum of digits (recursive)
        Send Feedback
        Write a recursive function that returns the sum of the digits of a given integer.
        Input format :
        Integer N
        Output format :
        Sum of digits of N
        Constraints :
        0 <= N <= 10^9
        Sample Input 1 :
        12345
        Sample Output 1 :
        15
        Sample Input 2 :
        9
        Sample Output 2 :
        9                  */


package Recursion1;
import java.util.Scanner;

public class Sum_Of_Digits {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        int sum=Sum(input);
        System.out.print(sum);
    }
    static int sum=0;
    public static int Sum(int input){
        if(input==0)
            return 0;

        sum=sum+(input%10);
        Sum(input/10);

        return sum;
    }

}
