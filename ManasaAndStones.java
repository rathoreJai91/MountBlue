import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ManasaAndStones {
    public static List<Integer> stones(int n, int a, int b) {
        // Write your code here
        // TreeSet<Integer> set = stonesHelper(n,a,b,0);
        // List<Integer>  result =  new ArrayList<>(set);
        // return result;

        //or

        TreeSet<Integer> result = new TreeSet<>();
        for(int i=0 ; i<n ; i++){
            result.add( a*i + b*(n-i-1));
        }
        return new ArrayList<>(result);
    }

    // private static TreeSet<Integer> stonesHelper(int n, int a, int b, int i) {
    //     if(n==1){
    //         TreeSet<Integer> result = new TreeSet<>();
    //         result.add(i);
    //         return result;
    //     }
    //     TreeSet<Integer> result = new TreeSet<>();

    //     result.addAll(stonesHelper(n-1, a, b, i+a));
    //     result.addAll(stonesHelper(n-1, a, b, i+b));
    //     return result;
    // }
}
