import java.util.List;

public class MisereNim {
    public static String misereNim(List<Integer> s) {
        // Write your code here 
        int count = 0;
        int n = s.size();
        int ans=0;
        for(int i : s){    
            if(i==1){
                count++;
            }
            ans = (ans^i);
        }
        if(count==n){
            if(count%2==0){
                return "First";
            }
            return "Second";
        }
        if(ans==0){
            return "Second";
        }
        return "First";
    }
}
