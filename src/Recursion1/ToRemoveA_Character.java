package Recursion1;

public class ToRemoveA_Character {
    public static void main(String args[])
    {
       String m="Kittuuuuu";
       String output=remove(m,'u');
        System.out.println(output);
    }

    public static String remove(String input,char a)
    {
        if(input.length()==0)
            return input;

        String smalloutput=remove(input.substring(1),a);
        if(input.charAt(0)==a)
            return smalloutput;
        else
            return input.charAt(0)+smalloutput;
    }
}
