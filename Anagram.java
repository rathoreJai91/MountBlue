import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static int anagram(String s) {
        // Write your code here
        if(s.length()%2!=0){
            return -1;
        }
        Map<Character,Integer> map = new HashMap<>();
        int mid=s.length()/2;
        int changes=0;
        for(int i=0;i<s.length();i++){
            if(i<mid){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
            }else{
                if(!map.containsKey(s.charAt(i))){
                    changes++;
                }else if(map.get(s.charAt(i))>0){
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                }else{
                    changes++;
                }
            }
        }
        return changes;
    }
}
