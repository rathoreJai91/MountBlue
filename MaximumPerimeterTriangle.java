import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumPerimeterTriangle {
    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        // Write your code here
        Collections.sort(sticks);
        List<Integer> triangle = new ArrayList<>();
        for(int i=sticks.size()-1;i>1;i--){
            if(sticks.get(i-2)+sticks.get(i-1)>sticks.get(i)){
                triangle.add(sticks.get(i-2));
                triangle.add(sticks.get(i-1));
                triangle.add(sticks.get(i));
                break;
            }
        }
        if(triangle.isEmpty()){
            triangle.add(-1);
        }
        return triangle;
    }
}
