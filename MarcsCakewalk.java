import java.util.Collections;
import java.util.List;

public class MarcsCakewalk {
    
    public static long marcsCakewalk(List<Integer> calorie) {
        // Write your code here
        Collections.sort(calorie);
        int index=calorie.size()-1;
        long miles=0;
        for(int i : calorie){
            miles+= Math.pow(2,index)*i;
            index--;
        }
        return miles;
    }
}
