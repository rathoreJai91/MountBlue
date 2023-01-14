public class SherlockAndSquares {
    public static int squares(int a, int b) {
        // Write your code here
        
        int start = (int) Math.sqrt(a);
        int end = (int) Math.sqrt(b);
        int perfectSquare=end-start;
        perfectSquare+=(Math.pow(start, 2)>=a)?1:0;
        return perfectSquare;
    }
}
