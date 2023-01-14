public class BeautifulDays {

    private static int reverse(int n){
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;
    }
    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int count=0;
        for(int d=i;d<=j;d++){
            int rev=reverse(d);
            if(Math.abs(rev-d)%k==0){
                count++;
            }
        }
        return count;
    }
}
