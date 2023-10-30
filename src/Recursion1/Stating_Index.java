package Recursion1;

public class Stating_Index {
    //si has to be zero
    public static int FirstIndex(int arr[],int num,int si){
        if(si==arr.length)
            return -1;
        if(arr[si]==num)
            return si;
        int k=FirstIndex(arr,num,si+1);
        return k;
    }

    public static void main(String args[]){
        int a[]={1,9,8,4,6,8};
        int result=FirstIndex(a,8,0);
        System.out.print(result);
    }
}
