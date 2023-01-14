import java.util.HashMap;
import java.util.List;

public class EqualizeTheArray {
    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxCount=0;
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i,1);
            }
            int currMax=map.get(i);
            maxCount=Math.max(maxCount,currMax);
        }
        return arr.size()-maxCount;
    }
}
