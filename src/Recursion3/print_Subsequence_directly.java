package Recursion3;
import java.util.Scanner;

public class print_Subsequence_directly {

    public static void printsubs(String input,String stringSoFar){
        if(input.length()==0){
            System.out.println(stringSoFar);
            return;
        }
        String smallInput=input.substring(1);
        printsubs(smallInput,stringSoFar);
        printsubs(smallInput,stringSoFar+input.charAt(0));
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String");
        String input=s.next();
        printsubs(input,"");
    }
}
