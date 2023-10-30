package Array;

import java.util.Scanner;

public class CYCLICALLY_ROTATE {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int arr[]={10,20,30,40};
        for(int i=0;i<k;i++)
        solve(arr);

        print(arr);
    }

    public static void solve(int arr[]) {
        int temp = 0,i=0;

        temp=arr[0];
        for(i=0;i<arr.length-1;i++){

            arr[i]=arr[i+1];
        }
        arr[i]=temp;

    }

    public static void print(int arr[]){
        for(int p=0;p<arr.length;p++){
            System.out.println(arr[p]);

        }



    }
}
