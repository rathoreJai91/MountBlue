import java.util.List;

public class LargestPermutation {
    
    private static void swap(List<Integer> arr , int a , int b){
        int temp = arr.get(a);
        arr.set(a,arr.get(b));
        arr.set(b,temp);
    }

    private static int maxIndex(List<Integer> arr , int index , int n){
        int max = 0;
        int maxValue = Integer.MIN_VALUE;

        for(int i=index ; i<n ; i++){
            if(arr.get(i)>maxValue){
                maxValue=arr.get(i);
                max=i;
            }
        }
        return max;
    }

    public static List<Integer> largestPermutation(int k, List<Integer> arr) {
        // Write your code here
        int n=arr.size();
        int index = 0;
        int max = -1;
        while(index<n && k>0){
            max = maxIndex(arr, index, n);
            if(arr.get(max) > arr.get(index)){
                swap(arr,index,max);
                k--;
            }
            index++;
        }
        return arr;
    }
}
