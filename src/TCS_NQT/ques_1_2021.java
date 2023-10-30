package TCS_NQT;
import java.util.*;
public class ques_1_2021 {
    public static void main(String[] args) {
        int E[]={7,0,5,1,3};
        int L[]={1,2,1,3,4};
        System.out.println(maxnum(E,L));
    }

    static int maxnum(int E[],int L[]){
        int maxi=0,sum=0;
        for(int i=0;i<E.length;i++){
           sum=sum+E[i]-L[i];
           maxi=Math.max(maxi,sum);
        }
        return maxi;
    }
}
