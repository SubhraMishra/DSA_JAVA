/*Multiplication (Recursive)
        Send Feedback
        Given two integers M & N, calculate and return their multiplication using recursion. You can only use subtraction and addition for your calculation. No other operators are allowed.
        Input format :
        Line 1 : Integer M
        Line 2 : Integer N
        Output format :
        M x N
        Constraints :
        0 <= M <= 1000
        0 <= N <= 1000
        Sample Input 1 :
        3
        5
        Sample Output 1 :
        15
        Sample Input 2 :
        4
        0
        Sample Output 2 :
        0                    */

package Recursion1;

public class Multiplication {

    public static void main(String args[]){
        int result=multiply(15,7);
        System.out.println(result);

    }
    static int sum=0;
    public static int multiply(int m,int n){
        if(m==0 || n==0)
            return 0;

        return n+multiply(m-1,n);
    }
}
