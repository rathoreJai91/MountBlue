import java.util.List;

public class InsertionSort2 {

    private static void print(List<Integer> arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void insertionSort2(int n, List<Integer> arr) {
        // Write your code here
        for(int i=1;i<n;i++){
            int curr=arr.get(i);
            int j = i-1;
            while(j>=0 && arr.get(j) > curr){
                arr.set(j+1,arr.get(j));
                j--;
            }
            arr.set(j+1,curr);
            print(arr);
        }
    }
}
