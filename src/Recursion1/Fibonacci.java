package Recursion1;

public class Fibonacci {
    public static int fibo(int n){
        if(n==1 || n==2){
            return 1;
        }
        int fib1=fibo(n-1);
        int fib2=fibo(n-2);
        return fib1+fib2;

    }

    public static void main(String[] args) {
        int output=fibo(7);
        System.out.print(output);
    }
}
