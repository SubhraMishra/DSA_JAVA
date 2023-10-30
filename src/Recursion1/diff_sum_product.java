package Recursion1;

public class diff_sum_product {
    static int sum=0,product=1,n1=0;
    public static int subtractProductAndSum(int n) {

        if(n==0)
            return 0;
        n1=n%10;
        sum=sum+n1;
        product=product*n1;

        subtractProductAndSum(n/10);

        return product-sum;

    }

    public static void main(String[] args) {
        System.out.print(subtractProductAndSum(234));
    }
}
