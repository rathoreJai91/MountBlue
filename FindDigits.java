public class FindDigits {
    public static int findDigits(int n) {
        // Write your code here
        return helper(n,n);
    }

    private static int helper(int n, int num) {
        if(num==0){
            return 0;
        }
        int count=0;
        int rem=num%10;
        if(rem!=0 && n%rem==0)count++;
        return count+helper(n,num/10);
    }
}
