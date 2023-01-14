import java.util.Collections;
import java.util.List;

public class MinAbsoluteDifference {
    public static int minimumAbsoluteDifference(List<Integer> arr) {
        // Write your code here
        // int minDiff=Integer.MAX_VALUE;
        // for(int i=0;i<arr.size()-1;i++){
        //     for(int j=i+1;j<arr.size();j++){
        //         int curr=Math.abs(arr.get(i)-arr.get(j));
        //         minDiff=Math.min(curr,minDiff);
        //     }
        // }
        // return minDiff;

        int minDiff=Integer.MAX_VALUE;
        Collections.sort(arr);
        for(int i=0;i<arr.size()-1;i++){
            minDiff=Math.min(minDiff,Math.abs(arr.get(i)-arr.get(i+1)));
        }
        return minDiff;
    }
}
