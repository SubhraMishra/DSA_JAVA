//Given a sentence Str. The task is to find whether the given sentence contains all letters of the English alphabet (a to z or A to Z). If it does not, then print all missing letters of the
//alphabet, otherwise print O.
//Note:
//• All characters in the given sentence should be treated as case insensitive, which means that 'A' and 'a' are to be treated as the same.
//The output should be in alphabetic order.
//• The output should contain only lowercase alphabets.
//• If none of the letters are missing, print O as output.

package CodeVita;
import java.util.Scanner;
import java.util.HashSet;

public class print_alpha {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        s.toLowerCase();

        HashSet<Character> set=new HashSet<>();

        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i)))
                set.add(s.charAt(i));
        }

        StringBuilder str=new StringBuilder();

        for(char i='a';i<='z';i++){
            if(!set.contains(i))
                str.append(i);
        }


        System.out.println(str);
    }
}
