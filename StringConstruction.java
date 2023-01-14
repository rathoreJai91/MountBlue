import java.util.HashSet;
import java.util.Set;

public class StringConstruction {

    public static int stringConstruction(String s) {
        // Write your code here
        int cost=0;
        Set<Character> map = new HashSet<>();

        for(int i=0;i<s.length();i++){
            if(!map.contains(s.charAt(i))){
                cost++;
                map.add(s.charAt(i));
            }
        }
        return cost;
    }
}
