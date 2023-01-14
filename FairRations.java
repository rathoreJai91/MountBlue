import java.util.List;

public class FairRations {
    public static String fairRations(List<Integer> B) {
        // Write your code here
        int count=0;
        for(int i=0;i<B.size()-1;i++){
            if(B.get(i)%2!=0){
                B.add(i+1,B.remove(i+1)+1);
                count+=2;
            }
        }
        if(B.get(B.size()-1)%2==0){
            return Integer.toString(count);
        }
        return "NO";
    }
}
