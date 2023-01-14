public class SherlockAndBeast {
    public static void decentNumber(int n) {
        // Write your code here
        int threes=0;
        while(n%3!=0){
            n-=5;
            threes++;
        }
        if(n<0){
            System.out.println(-1);
            return;
        }
        while(n!=0){
            System.out.print("555");
            n-=3;
        }
        for(int i=0;i<threes;i++){
            System.out.print("33333");
        }
        System.out.println();
    }
}
