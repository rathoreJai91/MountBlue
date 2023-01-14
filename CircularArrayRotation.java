import java.util.ArrayList;
import java.util.List;

public class CircularArrayRotation {
    
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here
        int n=a.size()-1;
        for(int i=0;i<k;i++){
            a.add(0, a.remove(n));
        }
        List<Integer> result = new ArrayList<>();
        for(int i : queries){
            result.add(a.get(i));
        }
        return result;
    }
}
