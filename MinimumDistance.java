import java.util.HashMap;
import java.util.List;

public class MinimumDistance {
    public static int minimumDistances(List<Integer> a) {
        // Write your code here
        HashMap<Integer,Integer> count = new HashMap<>();
        int minDiff=-1;
        for(int i=0;i<a.size();i++){
            int currDiff=-1;
            int currKey=a.get(i);
            if(count.containsKey(currKey)){
                currDiff=Math.abs(count.get(currKey)-i);
                count.put(currKey,i);
                if(minDiff!=-1){
                    minDiff=Math.min(currDiff, minDiff);
                }else{
                    minDiff=currDiff;
                }
            }else{
                count.put(currKey,i);
            }
        }
        return minDiff;
    }
}
