package String;
import java.util.Scanner;

public class RemoveBracketsFromAlgebricExpression {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String val=sc.next();
      System.out.print(remove(val));
    }

    public static String remove(String val){
        if(val.length()==0)
            return val;

        String smalloutput=remove(val.substring(1));
        if(val.charAt(0)=='(' || val.charAt(0)==')')
            return smalloutput;
            else
                return val.charAt(0)+smalloutput;


    }
}
