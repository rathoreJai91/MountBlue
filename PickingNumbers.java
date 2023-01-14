import java.util.Collections;
import java.util.List;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        Collections.sort(a);
        int count=1;
        int currCount=1;
        int curr=a.get(0);
        for(int i=1;i<a.size();i++){
            if(curr==a.get(i) || curr+1==a.get(i)){
                currCount++;
            }else{
                count=Math.max(count,currCount);
                currCount=1;
                curr=a.get(i);
            }
        }
        return Math.max(count,currCount);
    }
}
