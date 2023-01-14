import java.math.BigInteger;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BigSorting {
    public static List<String> bigSorting(List<String> unsorted) {
        // Write your code here
        Collections.sort(unsorted, new Comparator<String>() {
            public int compare(String s1 , String s2){
                if(s1.length()>s2.length()) return 1;
                else if(s1.length()<s2.length()) return -1;
                else{
                    BigInteger b1 = new BigInteger(s1);
                    BigInteger b2 = new BigInteger(s2);
                    return b1.compareTo(b2);
                }
            }
        });        
        return unsorted;
    }
}
