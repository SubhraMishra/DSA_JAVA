/*String to Integer
        Send Feedback
        Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.
        Input format :
        Numeric string S (string, Eg. "1234")
        Output format :
        Corresponding integer N (int, Eg. 1234)
        Constraints :
        0 < |S| <= 9
        where |S| represents length of string S.
        Sample Input 1 :
        00001231
        Sample Output 1 :
        1231
        Sample Input 2 :
        12567
        Sample Output 2 :
        12567                            */

package Recursion1;
import java.util.Scanner;

public class String_To_Integer {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String m=sc.next();
        int result=convert(m);
        System.out.print(result);

    }
    static int sum=0,result=0,finalsum;
    public static int convert(String num)
    {
        if(num.length()==1)
        {
            return (num.charAt(0)-'0');
        }
        double y=convert(num.substring(1));
        double x=num.charAt(0)-'0';
        x=x*(Math.pow(10,num.length()-1))+y;
        return (int)x;


    }
}
