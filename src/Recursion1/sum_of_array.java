package Recursion1;

public class sum_of_array {
    static int result=0;
    public static void main(String args[]){
        int a[]={1,9,0,4,8};
        int output=sum(a);
        System.out.print(output);

    }
    public static int sum(int arr[]){
        if(arr.length==0)
            return 0;

        result=result+arr[0];
        int smallarray[]=new int[arr.length-1];
        for(int i=1;i<=arr.length-1;i++)
        {
            smallarray[i-1]=arr[i];
        }
        sum(smallarray);

        return result;
    }
}
