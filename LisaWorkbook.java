import java.util.List;

public class LisaWorkbook {
    public static int workbook(int n, int k, List<Integer> arr) {
        // Write your code here
        int special=0;
        int page=1;
        for(int i : arr){
            int count=0;
            for(int j=1;j<=i;j++){
                if(j==page){
                    special++;
                }
                count++;
                if(count==k){
                    page++;
                    count=0;
                }
            }
            if(count!=0) page++;
        }
        return special;
    }
}
