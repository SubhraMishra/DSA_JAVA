package String;

public class Largest_String {

    public static int length(String sen){
        sen.trim();
        int maxi=Integer.MIN_VALUE;
        int input=0;
        for(int i=0;i<sen.length();i++){
            char c=sen.charAt(i);
            if(c==' '){
                maxi=Math.max(maxi,input);
                input=0;
            }
            else{
                input=input+1;
            }



        }

        return maxi;


    }

    public static void main(String args[]){
        System.out.println(length("i love you"));
    }
}
