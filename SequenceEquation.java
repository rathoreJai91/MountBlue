import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SequenceEquation {
    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=p.size();
        for(int i=0;i<n;i++){
            map.put(p.get(i), i+1);
        }
        List<Integer> result = new  ArrayList<>();

        for(int i=1;i<=n;i++){
            int temp = map.get(i);
            result.add(map.get(temp));
        }
        return result;
    }
}
