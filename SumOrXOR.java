public class SumOrXOR {
    public static long sumXor(long n) {
        // Write your code here
        long c = 0;
        while(n>0){
            if((n & 1)==0){
                c++;
            } 
            n>>=1;
        }
        c=(long)Math.pow(2,c);
        return c;
    }
}
