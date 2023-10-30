package Recursion1;

public class BinarySearchUsingRecursion {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int x=4;
        int output=BinarySearch(arr,x);
        System.out.println(output);
    }
    public static int BinarySearch(int arr[],int x){
        //x is the number to be searched
       return BinarySearchHelper(arr,0,arr.length-1,x);

    }
    public static int BinarySearchHelper(int arr[],int si,int ei,int x){
        if(si>ei)
            return -1;
        int midIndex=(si+ei)/2;
        if(arr[midIndex]==x){
            return midIndex;
        }
        else if(arr[midIndex]<x){
            return BinarySearchHelper(arr,si,ei+1,x);
        }
        else if(arr[midIndex]>x){
            return BinarySearchHelper(arr,si,ei-1,x);
        }
return midIndex;
    }

}
