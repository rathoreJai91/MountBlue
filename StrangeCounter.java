public class StrangeCounter {
    public static long strangeCounter(long t) {
        // Write your code here
        // long value=3;
        // long start=3;
        // while(t!=1){
        //     if(value==1){
        //         value=start*2;
        //         start=value;
        //         t--;
        //     }else{
        //         value--;
        //         t--;
        //     }
        // }
        // or

        long start=3;
        while(t>start){
            t-=start;
            start*=2;
        }
        long value=start-t+1;
        return value;

    }
    public static void main(String[] args) {
        System.out.println(strangeCounter(15));
    }
}
