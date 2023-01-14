import java.util.*;

public class TheHurdleRace {
    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        int maxHeight=0;
        for(int i : height){
            maxHeight=Math.max(maxHeight, i);
        }
        if(maxHeight<=k){
            return 0;
        }
        return maxHeight-k;
    }
}
