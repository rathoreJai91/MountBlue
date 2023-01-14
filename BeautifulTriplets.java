import java.util.List;

public class BeautifulTriplets {
    public static int beautifulTriplets(int d, List<Integer> arr) {
        // Write your code here
        int bTriplets=0;
        int n=arr.size();
        for(int i=0;i<n-2;i++){
            int first=arr.get(i);
            int j=i+1;
            while(j<n-1 && arr.get(j)-first<d){
                j++;
            }
            if(j==n-1){
                break;
            }
            if(arr.get(j)-first==d){
                int k=j+1;
                while(k<n && arr.get(k)-arr.get(j)<d){
                    k++;
                }
                if(k==n){
                    break;
                }
                if(arr.get(k)-arr.get(j)==d){
                    bTriplets++;
                }
            }
        }
        return bTriplets;
    }
}
