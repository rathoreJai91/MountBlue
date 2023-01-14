public class RepeatedString {
    public static long repeatedString(String s, long n) {
        // Write your code here
        // long ans=0;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='a'){
        //         ans++;
        //     }
        // }
        // if(ans==0){
        //     return 0;
        // }
        // ans*=n/s.length();
        // long rem = n%s.length();
        // for(int i=0;i<rem;i++){
        //     if(s.charAt(i)=='a'){
        //         ans++;
        //     }
        // }
        // return ans;
        
        //above code also passed

        long aCount=0;
        long repetitions= n/s.length();
        long rem = n%s.length();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                aCount+=repetitions;
                if(i<rem){
                    aCount++;
                }
            }
        }
        return aCount;
    }    
}
