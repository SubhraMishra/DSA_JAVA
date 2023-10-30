package CodeVita;
import java.util.Scanner;

public class teachers_prime_no {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int x=sc.nextInt();

        int a=n1+x;
        int b=n2;
        int count=1;int l=0;

        while(b<=a){
            a=a+n1;
            b=b+n2;
            count++;
            if(count>1000000) {
                System.out.println(-1);
                l=-1;
                break;
            }
            }


        if(l!=-1)
        System.out.println(count);
        }





    }



