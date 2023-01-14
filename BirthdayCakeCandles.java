import java.util.*;
public class BirthdayCakeCandles {
    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int maxHeight=0;
        int maxCount=0;
        for(int i : candles){
            if(i==maxHeight){
                maxCount++;
            }else if(i>maxHeight){
                maxHeight=i;
                maxCount=1;
            }
        }
        return maxCount;
    }
    
}
