public class MaximizingXOR {
    public static int maximizingXor(int l, int r) {
        // Write your code here
        int maximal=0;
        for(int i=l;i<=r;i++){
            for(int j=i;j<=r;j++){
                maximal=Math.max(maximal,i^j);
            }
        }
        return maximal;
    }
}
