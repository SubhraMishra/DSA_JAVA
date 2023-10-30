package Imp_Miscellaneous;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int target=s.nextInt();
        int nums[]={1,3,4,5};
        int ans=searchval(nums,target);
        System.out.println(ans);
    }

    private static int searchval(int[] nums, int target) {
        int mid=0;
        int start=0;
        int end=nums.length-1;
        while(start<=end) {
            mid = (start + end) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;


        }

            return start;
    }
}
