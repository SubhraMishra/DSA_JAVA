package Recursion1;

public class Factorial {
    public static void main(String args[]){
        int output=Factorial(5);
        System.out.println(output);
    }
    public static int Factorial(int a){
        if(a==0)
            return 1;

        int result=a*Factorial(a-1);
        return result;
    }
}
