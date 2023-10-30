package Recursion1;

public class LastIndex {

    public static void main(String args[]){
        int a[]={1,9,8,4,8,6};
        int result=LastIndex(a,8,0);
        System.out.print(result);
    }
    public static int LastIndex(int a[],int num,int si){
        if(si==a.length)
            return -1;

        int k=LastIndex(a,num,si+1);
        if(k!=-1)
            return k;
        else{
            if(a[si]==num)
                return si;
            else
                return -1;
        }
    }
}
