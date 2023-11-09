package Array;

import java.util.ArrayList;
import java.util.Arrays;
//Given an arrayof N integer numbers. The task is to rewrite the array by putting all multiplesof 10 at theendof the given array.
//        Note: The order of the numbers which are not multiples of should remain unaltered. and similarly. the order of all multiples of
//        should be unaltered.
//        12.5. 30.7. se.9.1e)
//        For e.g. Suppose N 9 and arrlJ
//        Youhaveto push all multipleof 10 at theend of the arrt I
//        Hence.theoutput 12 . S. 7. 9. . 40 . 30 . 50. le J

public class Move_multiplesOf10_toEnd {

    public static void main(String[] args) {

        int arr[]={10,80,76,54,70,88,98,100};
        ArrayList<Integer> al=new ArrayList<Integer>();
        ArrayList<Integer> al1=new ArrayList<Integer>();
        int array[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(arr[i]%10==0)
                al.add(arr[i]);
            else
                al1.add(arr[i]);
        }
        int ind=0;

       for(int i=0;i<al1.size();i++){
           System.out.print(al1.get(i)+" ");
       }

        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }

    }
}
