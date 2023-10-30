/*Check Palindrome (recursive)
        Send Feedback
        Check whether a given String S is a palindrome using recursion. Return true or false.
        Input Format :
        String S
        Output Format :
        'true' or 'false'
        Constraints :
        0 <= |S| <= 1000
        where |S| represents length of string S.
        Sample Input 1 :
        racecar
        Sample Output 1:
        true
        Sample Input 2 :
        ninja
        Sample Output 2:
        false*/


package Recursion1;

public class Check_If_String {

    public static void main(String args[]){
        boolean output=Palindrome("racecar");
        System.out.print(output);
    }

    static int si=0,ei=0;

    public static boolean Palindrome(String input){
        int si=0;
        int ei=input.length()-1;
        if(input.length()<=1)
        {
            return true;
        }
        while(si<ei)
        {
            if(input.charAt(si)==input.charAt(ei))
                return Palindrome(input.substring(si+1,(ei-1)+1));
            else
            {
                return false;
            }
        }

        return false;




    }
}