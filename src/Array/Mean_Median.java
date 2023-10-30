package Array;
import java.util.Arrays;

public class Mean_Median {

    public static void main(String[] args) {
        int arr[]={2,3,6,7,9,2,4,7};
        result(arr);

    }

    public static void result(int arr[]){
        Arrays.sort(arr);
        double median=0.0,mean=0.0;int sum=0;
        int l=arr.length;
        if(l%2==0){
            int l1=l/2;
            median=(arr[l1]+arr[l1-1])/2;
        }
        else
            median=arr[l/2];

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }

        mean=sum/arr.length;

        System.out.println(mean+"  "+median);
    }
}
