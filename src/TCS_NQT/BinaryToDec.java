package TCS_NQT;
import java.util.Scanner;
public class BinaryToDec {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(result(num));
    }

    public static int result(int num){

        int k=0,sum=0;
        while(num>0){
            int l=num%10;
            sum= (int) (sum+(l*Math.pow(2,k)));
            k++;
            num=num/10;
        }
        return sum;
    }
}
