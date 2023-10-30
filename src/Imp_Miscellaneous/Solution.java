package Imp_Miscellaneous;

import java.util.*;
public class Solution {
    static int longestConsecutive(int[] nums) {


        if(nums.length==0)
            return 0;
        int result=1;
        Arrays.sort(nums);

        int length=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1]) {
                length = length + 1;
                result = Math.max(result, length);
            }
            else if(nums[i]==nums[i+1])
                continue;
            else if(nums[i]+1 != nums[i+1]){

                length=1;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        int nums[]={1,2,0,1};
        int l=longestConsecutive(nums);
        System.out.println(l);
    }
}
