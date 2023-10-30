package Recursion1;
import java.util.*;
public class XtothepowerN {

    public static void main(String args[]){
        int result=power(4,2);
        System.out.println(result);
    }
    public static int power(int x,int n){

        if(n!=0){
            return x*power(x,n-1);
        }
        else{
            return 1;
        }
    }
}
