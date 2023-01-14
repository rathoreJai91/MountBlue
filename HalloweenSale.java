public class HalloweenSale {
    public static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int gameCount=0;
        int currentCost=p;
        while(s>=currentCost && s>0){
            s-=currentCost;
            gameCount++;
            if(currentCost-d>m){
                currentCost-=d;
            }else{
                currentCost=m;
            }
        }
        return gameCount;
    }
}
