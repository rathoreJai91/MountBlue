public class ChocolateFeast {
    public static int chocolateFeast(int n, int c, int m) {
        // Write your code here
        // int choco=n/c;
        // int wrappers=0;
        // int chocoCount=0;
        // while(choco!=0 || wrappers==m){
        //     if(wrappers==m){
        //         wrappers=0;
        //         choco++;
        //     }
        //     if(choco!=0){
        //         choco--;
        //         chocoCount++;
        //         wrappers++;
        //     }
        // }
        // return chocoCount;

        //or

        int choco = n / c;
        int wrappers = choco;    
        while (wrappers >= m) {
            int freebies = wrappers / m;
            choco += freebies;
            wrappers = freebies + wrappers % m;
        }
        return choco;
    }
}
