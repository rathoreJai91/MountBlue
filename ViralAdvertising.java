public class ViralAdvertising {
    
    public static int viralAdvertising(int n) {
        // Write your code here
        int recipients=5;
        int totalLikes=0;

        for(int i=0;i<n;i++){
            int todayLikes=recipients/2;
            totalLikes+=todayLikes;
            recipients=(recipients/2)*3;
        }
        return totalLikes;
    }
}
