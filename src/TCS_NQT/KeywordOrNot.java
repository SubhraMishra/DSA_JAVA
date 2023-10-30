package TCS_NQT;
import java.util.Scanner;
import java.util.*;
public class KeywordOrNot {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        System.out.println(yesorno(word));



    }

    public static boolean yesorno(String word){
        int flag=0;

        String s[]={"break","case","continue","default","defer", "else","for","func","goto","if","map","range","return","struct","type","var"};
        for(int i=0;i<s.length;i++){
            if(word.equals(s[i])){
                flag=1;
            }
        }

        if(flag==1)
            return true;
        else
            return false;
    }
}