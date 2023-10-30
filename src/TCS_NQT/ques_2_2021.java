package TCS_NQT;

public class ques_2_2021 {
    public static void main(String[] args) {
        int arr[]={0,1,0,1,1};
        System.out.println(count(arr));
    }

    static int count(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int j=i+1;
                while(j<arr.length){
                    if(arr[j]==1)
                        sum++;
                    j++;
                }
            }
        }

        return sum;
    }
}
