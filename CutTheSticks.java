import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CutTheSticks {
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        List<Integer> result = new ArrayList<>();
        int i=0;
        while(i<arr.size()){
            result.add(arr.size());
            int shortest=arr.get(i);
            for(int j=i+1;j<arr.size();j++){
                arr.set(j,arr.get(j)-shortest);
                if(arr.get(j)<1){
                    arr.remove(j);
                    j--;
                }
            }
            arr.remove(i);
        }
        return result;
    }
}
