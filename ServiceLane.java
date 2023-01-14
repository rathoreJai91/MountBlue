import java.util.ArrayList;
import java.util.List;

public class ServiceLane {

    private static int maxWidth( List<Integer> width , int s, int e){
        int min=Integer.MAX_VALUE;
        for(int i=s;i<=e;i++){
            min=Math.min(min, width.get(i));
        }
        return min;
    }

    public static List<Integer> serviceLane(int n, List<Integer> width, List<List<Integer>> cases) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<cases.size();i++){
            int startIndex = cases.get(i).get(0);
            int endIndex = cases.get(i).get(1);
            int max = maxWidth( width , startIndex , endIndex);
            result.add(max);
        }
        return result;
    }
}
