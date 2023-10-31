package String;
import java.util.HashSet;

public class Missing_letters_in_a_sentence {

    public static void main(String[] args) {
        String s="There is no such word called jhytredsbvnmxczq";
//        String s="abcd";
        solve(s);
    }

    public static void solve(String s){
        StringBuilder sb=new StringBuilder();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i)))
                set.add(s.charAt(i));
        }

        for(char i='a';i<='z';i++){
            if(!set.contains(i))
                sb.append(i);

        }

        System.out.println(new String(sb));
    }
}
