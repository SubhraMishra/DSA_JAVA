package practicequestions;

public class recnoispresent {
    public static boolean small(int arr[],int num)
    {
        if(arr.length==0)
            return false;

        if(arr[0]==num)
            return true;

        int smallarray[]=new int[arr.length-1];
        for(int i=1;i<smallarray.length;i++){
            smallarray[i-1]=arr[i];
        }
        boolean result=small(smallarray,num);

        return result;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        boolean m=small(arr,3);
        System.out.println(m);
    }
}
