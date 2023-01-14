import java.util.Collections;
import java.util.List;

public class PriyankaAndToys {
    public static int toys(List<Integer> w) {
        // Write your code here
        Collections.sort(w);
        int containerCount=1;
        int minWeight=w.get(0);
        int maxWeight=minWeight+4;
        for(int i : w){
            if(i>maxWeight){
                containerCount++;
                minWeight=i;
                maxWeight=i+4;
            }
        }
        return containerCount;
    }
}
