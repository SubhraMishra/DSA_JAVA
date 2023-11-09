package Recursion1;

public class Check_x_present {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int num=5;
        System.out.println(check(arr,num));

    }


    public static boolean check(int arr[],int num){

        if(arr.length==0)
            return false;

        if(arr[0]==num)
            return true;

        int small[]=new int[arr.length-1];
        for(int i=1;i<=small.length;i++){
            small[i-1]=arr[i];
        }

        return check(small,num);
    }
}
