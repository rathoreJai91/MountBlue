import java.util.HashSet;
import java.util.Set;

public class GameOfThrones1 {
    public static String gameOfThrones(String s) {
        // Write your code here
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }else{
                set.remove(s.charAt(i));
            }
        }
        if( (s.length()%2!=0 && set.size()==1)  || (s.length()%2==0 && set.size()==0)){
            return "YES";
        }
        return "NO";
    }
}
