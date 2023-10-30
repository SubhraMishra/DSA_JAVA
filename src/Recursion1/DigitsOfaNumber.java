package Recursion1;

public class DigitsOfaNumber {
    public static void main(String args[]){
        int result=digits(176);
        System.out.println(result);
    }
    public static int digits(int n){
        if(n==0)
            return 0;
        else {
            return 1+digits(n/10);

        }

    }
}
