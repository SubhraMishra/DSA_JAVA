package Recursion1;

public class repalce_a_char_inString {
    public static void main(String[] args) {
        String s="abxyzbnmxxx";
        System.out.print(rep(s,'x','y'));
    }

    public static String rep(String s,char a,char b){

        if(s.length()==0)
            return s;

        String small=rep(s.substring(1),a,b);

        if(s.charAt(0)==a)
            return b+small;
        else
            return s.charAt(0)+small;

    }
}
