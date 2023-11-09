package String;

public class pixel_width_count {

        public static int[] numberOfLines(int[] widths, String s) {

            int sum=0,lines=1,last=0;


            for(char c:s.toCharArray()){

                if(sum+widths[c-'a']<=100)
                {
                    sum=sum+widths[c-'a'];
                    last=sum;

                }
                else{
                    lines++;
                    sum=0;
                }
            }

            int arr[]=new int[2];
            arr[0]=lines;
            arr[1]=last;


            return arr;

        }

    public static void main(String[] args) {
            int arr[]={10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
            int res[]=new int[2];
       res= numberOfLines(arr,"abcdefghijklmnopqrstuvwxyz");
        System.out.println(res[0]+" "+res[1]);

    }
    }

