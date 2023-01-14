import java.util.HashMap;
import java.util.Map;

public class HappyLadybugs {

    private static boolean alreadyArranged(String s){
        boolean check=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='_'){
                if((i>0 && i<s.length()-1)){
                    char curr = s.charAt(i);
                    if(curr!=s.charAt(i-1) && curr!=s.charAt(i+1)){
                        check=false;
                        break;
                    }
                }
            }
        }
        return check;
    }

    public static String happyLadybugs(String b) {
        // Write your code here
        int emptyCell=0;
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<b.length();i++){
            char curr = b.charAt(i);
            if(curr=='_'){
                emptyCell++;
            }else{
                map.put(curr,map.getOrDefault(curr, 0)+1);
            }
        }
        for(int i : map.values()){
            if(i==1){
                return "NO";
            }
        }
        if(emptyCell==0){
            if(!alreadyArranged(b)){
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        String s = "BBB_";
        System.out.println(happyLadybugs(s));
    }
}
