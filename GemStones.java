import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GemStones {
    
    private static String removeDuplicates(String s) {
        String result="";
        Set<Character> set = new HashSet<>();

        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                result+=s.charAt(i);
                set.add(s.charAt(i));
            }
        }
        return result;
    }

    public static int gemstones(List<String> arr) {
        // Write your code here
        int gemCount=0;
        HashMap<Character, Integer> m = new HashMap<>();
        for(String s : arr){
            String currStone=removeDuplicates(s);
            for(int i=0;i<currStone.length();i++){
                char currChar=currStone.charAt(i);
                m.put(currChar,m.getOrDefault(currChar,0)+1);
            }
        }
        int n=arr.size();
        for(int i : m.values()){
            if(i==n){
                gemCount++;
            }
        }
        return gemCount;
    }
    
}
