/*Pair Star
        Send Feedback
        Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
        Input format :
        String S
        Output format :
        Modified string
        Constraints :
        0 <= |S| <= 1000
        where |S| represents length of string S.
        Sample Input 1 :
        hello
        Sample Output 1:
        hel*lo
        Sample Input 2 :
        aaaa
        Sample Output 2 :
        a*a*a*a */

package Recursion1;

public class PairStar {

    public static void main(String args[])
    {
        String output=star("apple");
        System.out.println(output);
    }
    static String output="";
    public static String star(String input){

        if(input.length()<=1)
        {
            return input;
        }
        String smallstring=star(input.substring(1));
        if(input.charAt(0)==input.charAt(1)){
            return input.charAt(0)+"*"+smallstring;

        }
        else{
            return input.charAt(0)+smallstring;

        }

    }
}
