import java.util.List;

public class JumpingOnClouds2 {
    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int jumps=0;
        int currCloud=0;
        int n=c.size();
        
        while(currCloud<n-1){
            if(currCloud+2<n && c.get(currCloud+2)==0){
                currCloud+=2;
                jumps++;
            }else{
                currCloud++;
                jumps++;
            }
        }
        return jumps;
    }
}
