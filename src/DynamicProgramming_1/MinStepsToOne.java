package DynamicProgramming_1;
import java.util.Scanner;

public class MinStepsToOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(steps(num));
    }
    static int steps=0;

    private static int steps(int num) {
        if(num==1)
            return 0;

        int sub1=Integer.MAX_VALUE;
        int divide2=Integer.MAX_VALUE;
        int divide3=Integer.MAX_VALUE;

        sub1=steps(num-1);

        if(num%2==0){
            divide2=steps(num/2);
        }
        if(num%3==0){
            divide2=steps(num/3);
        }

        return 1+Math.min(sub1,Math.min(divide2,divide3));

    }

}
