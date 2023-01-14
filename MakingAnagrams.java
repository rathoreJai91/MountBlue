import java.util.HashMap;
import java.util.Map;

public class MakingAnagrams {
    public static int makingAnagrams(String s1, String s2) {
        // Write your code here
        Map<Character, Integer> map = new HashMap<>(); 
        for(int i=0;i<s1.length();i++){
            char curr = s1.charAt(i);
            map.put(curr,map.getOrDefault(curr, 0)+1);
        }
        for(int i=0;i<s2.length();i++){
           char curr = s2.charAt(i);
           map.put(curr,map.getOrDefault(curr, 0)-1); 
        }
        int deletions=0;
        for(int i : map.values()){
            if(i!=0){
                deletions+=Math.abs(i);
            }
        }
        return deletions;
    }
}
