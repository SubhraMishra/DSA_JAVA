package Array;

import java.util.Arrays;

public class prefix_XOR {
    public static int[] findArray(int[] pref) {

        for (int i = pref.length - 1; i > 0; i--) {
            pref[i] ^= pref[i - 1];

        }
        return pref;

    }

    public static void main(String[] args) {
        int arr[]={5,2,0,3,1};
        int a[]=findArray(arr);
        System.out.println(Arrays.toString(a));}
    }


