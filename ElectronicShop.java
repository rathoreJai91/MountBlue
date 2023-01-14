public class ElectronicShop {
    
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        
        int maxCost=-1;
        for(int i : keyboards){
            if(i<b){
                for(int j : drives){
                    if(i+j<=b){
                        maxCost=Math.max(i+j,maxCost);
                    }
                }
            }
        }
        return maxCost;
    }
}
