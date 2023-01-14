import java.util.ArrayList;
import java.util.List;

public class CountingSort2 {
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> sorted = new ArrayList<>();
        int[] count = new int[100];
        
        for(int i : arr){
            count[i]++;
        }
        for(int i=0;i<100;i++){
            while(count[i]!=0){
                sorted.add(i);
                count[i]--;
            }
        }
        return sorted;
    }
}
