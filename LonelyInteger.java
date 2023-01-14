import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LonelyInteger {
    public static int lonelyInteger(List<Integer> a) {
        // Write your code here
        Set<Integer> s = new HashSet<>();
        for(int i : a){
            if(!s.contains(i)){
                s.add(i);
            }else{
                s.remove(i);
            }
        }
        Iterator<Integer> i = s.iterator();
        return i.next();
    }
}
