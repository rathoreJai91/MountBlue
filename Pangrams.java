import java.util.HashSet;
import java.util.Set;

public class Pangrams {
    public static String pangrams(String s) {
        // Write your code here
        if(s.length()<26){
            return "not pangram";
        }
        String str=s.toLowerCase();
        Set<Character> set = new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                set.add(str.charAt(i));
            }
        }
        if(set.size()==26){
            return "pangram";
        }
        return "not pangram";
    }
}
