import java.util.HashSet;
import java.util.Set;

public class TwoStrings {
    public static String twoStrings(String s1, String s2) {
        // Write your code here
        Set<Character> s = new HashSet<>();
        for(int i=0;i<s1.length();i++){
            s.add(s1.charAt(i));
        }
        for(int i=0;i<s2.length();i++){
            if(s.contains(s2.charAt(i))){
                return "YES";
            }
        }
        return "NO";
    }
}
