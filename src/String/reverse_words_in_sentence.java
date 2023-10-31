package String;

public class reverse_words_in_sentence {

        public static String reverseWords(String s) {

            int a=0;int l=s.length();
            StringBuilder sc=new StringBuilder();

            for(int i=0;i<l;i++){
                char ch=s.charAt(i);
                if(ch==' ' || i==l-1){
                    sc.append(new StringBuilder(s.substring(a,i+1)).reverse());
                    if(i!=s.length()-1)
                        sc.append(' ');
                    a=i+1;
                }

            }

            return new String(sc);

        }

        public static void main(String args[]){
            String s="Let's take LeetCode contest";
            System.out.println(reverseWords(s));
        }
    }

