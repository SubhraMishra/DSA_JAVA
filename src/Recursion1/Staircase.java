/*Staircase
        Send Feedback
        A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many possible ways the child can run up to the stairs. You need to return number of possible ways W.
        Input format :
        Integer N
        Output Format :
        Integer W
        Constraints :
        1 <= N <= 30
        Sample Input 1 :
        4
        Sample Output 1 :
        7
        Sample Input 2 :
        5
        Sample Output 2 :
        13  */

package Recursion1;
import java.util.Scanner;

public class Staircase {
    public static int count(int steps){
        if(steps==0)
            return 1;

        if(steps<0)
            return 0;

        return count(steps-1)+count(steps-2)+count(steps-3);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(count(n));
    }
}
