package TCS_NQT;
import java.util.Scanner;
public class ThreeDigNumtoWords {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dig=sc.nextInt();
        conv(dig);
    }

    public static void conv(int num){
        int t=0;
        String answer="";

        String power[]={"","Thousand","Hundred"};

        String first_twenty[] = {
                "",        "One",       "Two",      "Three",
                "Four",    "Five",      "Six",      "Seven",
                "Eight",   "Nine",      "Ten",      "Eleven",
                "Twelve",  "Thirteen",  "Fourteen", "Fifteen",
                "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };

        // Array to store multiples of ten
        String tens[] = { "", "Twenty", "Thirty",
                "Forty",   "Fifty",  "Sixty",
                "Seventy", "Eighty", "Ninety" };
        if(num==0)
            System.out.println("Zero");
        int lim=1000;

        while(num>0) {


            int d = num / lim;
            num = num % lim;
            if (d != 0 && t<2) {
                answer += first_twenty[d] + " " + power[++t] + " ";
            }

            if (num > 99) {
                answer += first_twenty[num / 100] + " " + "Hundred" + " ";
                num = num % 100;
            } else if (num% 10 == 0 && num != 0) {
                answer += tens[(num / 10) - 1] + " ";
            } else if (num > 20 && num <= 99) {
                answer += tens[(num / 10) - 1] + " " + first_twenty[num % 10] + " ";
            }

            lim=lim/10;
            t++;


        }

        System.out.println(answer);
    }
}
