import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LuckBalance {

    public static int luckBalance(int k, List<List<Integer>> contests) {
        // Write your code here
        List<Integer> important = new ArrayList<>();
        int luck=0;
        for(int i=0;i<contests.size();i++){
            int currLuck=contests.get(i).get(0); 
            int importance=contests.get(i).get(1);
            if(importance==0){
                luck+=currLuck;
            }else{
                important.add(currLuck);
            } 
        }
        System.out.println(luck);
        System.out.println(important);
        Collections.sort(important , Collections.reverseOrder());

        for(int i : important){
            if(k!=0){
                luck+=i;
                k--;
            }else{
                luck-=i;
            }
        }
        return luck;
    }
}
