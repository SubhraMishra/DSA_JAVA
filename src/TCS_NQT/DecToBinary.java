package TCS_NQT;

import java.util.Scanner;
public class DecToBinary {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(conv(num));
    }

    public static String conv(int num){
        String s="";
        while(num>0){
            int i=num%2;
            s=i+s;
            num=num/2;
        }

        return s;
    }
}
