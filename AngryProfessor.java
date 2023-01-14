import java.util.List;

public class AngryProfessor {
    
    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        int count=0;
        for(int i : a){
            if(i<=0){
                count++;
            }
        }
        return (count<k)?"YES" : "NO";
    }
}
