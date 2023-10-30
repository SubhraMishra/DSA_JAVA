package hashmap;
import java.util.ArrayList;

import java.util.HashMap;

public class maxFrequencyno {
   static int count=0;
    public static int frequencyofno(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                count = map.get(arr[i]);
                count = count + 1;
                map.put(arr[i], count);

            } else {
                map.put(arr[i], 1);
            }
        }


        int maxcount = 0, res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxcount < map.get(arr[i])) {
                maxcount = map.get(arr[i]);
                res = arr[i];

            }
        }
        return res;
    }

        public static void main(String args[])
        {
            int arr[]={1,1,1,1,3,2,5,5,5,6,3,8};
            int output=frequencyofno(arr);
            System.out.print(output);
        }


}
