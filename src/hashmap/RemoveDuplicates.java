package hashmap;

import java.util.HashMap;
import java.util.ArrayList;

public class RemoveDuplicates {

    public static ArrayList Rd(int arr[]){
        HashMap<Integer,Boolean> map=new HashMap<>();
        ArrayList<Integer> output=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                continue;
            }

            map.put(arr[i],true);
            output.add(arr[i]);
        }

        return output;
    }

    public static void main(String[] args) {
        int arr[]={1,3,3,3,2,6,7,8,8};
        ArrayList<Integer> m=new ArrayList<>();
        m=Rd(arr);
        for(int i=0;i<m.size();i++){
            System.out.print(m.get(i)+" ");
        }
    }
}
