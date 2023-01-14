import java.util.List;

public class InsertionSort1 {

    private static void print(List<Integer> arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        for(int i=n-1;i>0;i--){
            if(arr.get(i)<arr.get(i-1)){
                int temp=arr.get(i);
                arr.set(i, arr.get(i-1));
                print(arr);
                arr.set(i-1, temp);
            }else{
                break;
            }
        }
        print(arr);
    }
}
