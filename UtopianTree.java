public class UtopianTree {
    public static int utopianTree(int n) {
        // Write your code here
        int height=1;
        if(n==0) return height;

        for(int i=1;i<=n;i++){
            if(i%2==0){
                height++;
            }else{
                height*=2;
            }
        }
        return height;
    }
}
