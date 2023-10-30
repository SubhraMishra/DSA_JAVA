package Recursion3;
import java.util.Scanner;

public class Keypad_Print_Direct {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        Keyprint(input,"");
    }

    public static void Keyprint(int num,String values) {
        if (num == 0) {
            System.out.println(values);
            return;
        }
        int lastDigit = num % 10;
        int smallInput = num / 10;
        String optionsLastDigit = getOptions(lastDigit);
        for (int i = 0; i < optionsLastDigit.length(); i++) {
            Keyprint(smallInput, optionsLastDigit.charAt(i) + values);
        }


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
    }
