public class SaveThePrisoner {
    public static int saveThePrisoner(int n, int m, int s) {
        // Write your code here
        int unlucky= (s-1+m)%n;
        return (unlucky==0)?n:unlucky;
    }
}
