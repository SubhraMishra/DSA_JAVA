package LinkedList;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList_RemoveConsecutiveDuplicates {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]={10,78,20,20,30,40};
        ArrayList<Integer> a=remove(arr);
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }

    }
    public static ArrayList<Integer> remove(int arr[])
    {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i])
                a.add(arr[i-1]);
        }

        return a;

    }


}
