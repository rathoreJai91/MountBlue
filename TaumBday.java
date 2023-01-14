public class TaumBday {
    public static long taumBday(int b, int w, int bc, int wc, int z) {
        // Write your code here
        long cost=0;
        if(bc<wc){
            wc=Math.min(wc,bc+z);
        }else if(wc<bc){
            bc=Math.min(bc,wc+z);
        }
        cost=(b*bc)+(w*wc);
        return cost;
    }
}
