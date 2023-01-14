import java.util.ArrayList;
import java.util.List;

public class ACM_ICPC_Team {
    
    private static int topicCount(String p1, String p2) {
        int count=0;
        for(int i=0;i<p1.length();i++){
            if(p1.charAt(i)=='1' || p2.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
    
    public static List<Integer> acmTeam(List<String> topic) {
        // Write your code here;
        int maxTopics=0;
        int count=0;
        for(int i=0;i<topic.size()-1;i++){
            for(int j=i+1;j<topic.size();j++){
                int currMax=topicCount(topic.get(i),topic.get(j));
                if(currMax>maxTopics){
                    maxTopics=currMax;
                    count=1;
                }else if(currMax==maxTopics){
                    count++;
                }
            }
        }
        System.out.println(count);
        List<Integer> result = new ArrayList<>();
        result.add(maxTopics);
        result.add(count);
        return result;
    }
}
