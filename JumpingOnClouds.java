public class JumpingOnClouds {
    
    static int jumpingOnClouds(int[] c, int k) {
        int e=100;
        int n=c.length;
        int i=0;

        do {
            if(c[i]!=1){
                e--;
            }else{
                e-=3;
            }
            i=(i+k)%n;
        } while (i!=0);

        return e;
    }
}
