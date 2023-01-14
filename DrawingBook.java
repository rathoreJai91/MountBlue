public class DrawingBook {
    public static int pageCount(int n, int p) {
        // Write your code here
        int fromFront=0;
        int fromRear=0;
        if(p!=1){
            fromFront=p/2;
        }
        if(n-p==1 && p%2!=0){
            fromRear=1;
        }else if(n-p>1){
            fromRear=(n-p)/2;
        }
        return Math.min(fromFront,fromRear);
    }
}
