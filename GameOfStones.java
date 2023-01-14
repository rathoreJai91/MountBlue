public class GameOfStones {
    
    public static String gameOfStones(int n) {
        // Write your code here
        if(n<2){
            return "Second";
        }
        if(n%7==0 || n%7==1){
            return "Second";
        }else{
            return "First";
        }
    }
}
