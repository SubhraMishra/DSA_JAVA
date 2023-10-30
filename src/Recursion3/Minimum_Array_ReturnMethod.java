package Recursion3;

public class Minimum_Array_ReturnMethod
{
    public static int findMin(int input[],int startingIndex){
        if(startingIndex==input.length){
           return Integer.MAX_VALUE;
        }
        int minSmallArray=findMin(input,startingIndex+1);
        if(input[startingIndex]<minSmallArray){
            return input[startingIndex];
        }
        else{
            return minSmallArray;
        }
    }

    public static void main(String[] args) {
        int a[]={1,9,10,67,45};
        int min=findMin(a,0);
        System.out.println(min);
    }
}
