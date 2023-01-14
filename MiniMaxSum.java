import java.util.*;

public class MiniMaxSum {
    
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        // long maxSum=Integer.MIN_VALUE;
        // long minSum=Integer.MAX_VALUE;
        // for(int i=0;i<arr.size();i++){
        //     long currSum=0;
        //     for(int j=0;j<arr.size();j++){
        //         if(i!=j){
        //             currSum+=arr.get(j);
        //         }
        //     }
        //     maxSum=Math.max(maxSum, currSum);
        //     minSum=Math.min(minSum, currSum);
        // }
        //System.out.println(minSum + " " + maxSum);
        
        long maxValue=Integer.MIN_VALUE;
        long minValue=Integer.MAX_VALUE;
        long totalSum=0;
        for(int i : arr){
            totalSum+=i;
            if(i>maxValue){
                maxValue=i;
            }
            if(i<minValue){
                minValue=i;
            }
        }
        System.out.print(totalSum-maxValue+" ");
        System.out.print(totalSum-minValue);

        
    }
}
