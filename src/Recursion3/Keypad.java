package Recursion3;
import java.util.Scanner;

public class Keypad {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int input=s.nextInt();
        String[] output=keypadCombinations(input);
        for(String outputString:output){
        System.out.println(outputString);}
    }
    public static String getOptions(int digit){
        if(digit==2)
            return "abc";
        if(digit==3)
            return "def";
        if(digit==4)
            return "ghi";
        if(digit==7)
            return "pqrs";

        return "";

    }
    public static String[] keypadCombinations(int input){
        if(input==0){
            String[] output=new String[1];
            output[0]=" ";
            return output;
        }
        String[] smalloutput=keypadCombinations(input/10);
        int lastDigit=input%10;
        String lastDigitOptions=getOptions(lastDigit);
        String[] output=new String[smalloutput.length*lastDigitOptions.length()];
        int k=0;
        for(int i=0;i<smalloutput.length;i++){
            for(int j=0;j<lastDigitOptions.length();j++){
                output[k]=smalloutput[i]+lastDigitOptions.charAt(j);
                k++;
            }
        }
        return output;

    }
}
