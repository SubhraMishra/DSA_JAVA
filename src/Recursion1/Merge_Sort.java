package Recursion1;

public class Merge_Sort {
    public static void main(String args[])
    {
        int arr[]={8,9,10,11,6};
        MergeSort(arr);
        print(arr);
    }
    public static void MergeSort(int arr[])
    {

        if(arr.length<=1){
            return;
        }
        int l=arr.length;
        int a[]=new int[l/2];
        int b[]=new int[l-a.length];
        for(int i=0;i<l/2;i++){
            a[i]=arr[i];
        }
        for(int i=l/2;i<l;i++){
            b[i-(l/2)]=arr[i];
        }
        MergeSort(a);
        MergeSort(b);
        merge(a,b,arr);

    }
    public static void merge(int a[],int b[],int c[]){
        int m=c.length;
        int i=0;
        int j=0;
        int k=0;
        
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else{
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if(i<a.length){
            while(i<a.length){
                c[k]=a[i];
                i++;
                k++;
            }
        }
        if(j<b.length) {
            while (j < b.length) {
                c[k] = b[j];
                j++;
                k++;
            }
        }
    }
    public static void print(int arr[])
    {
        for(int p=0;p<arr.length;p++){
            System.out.print(arr[p]+" ");
        }
    }
}
