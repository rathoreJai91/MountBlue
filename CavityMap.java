import java.util.ArrayList;
import java.util.List;

public class CavityMap {
    public static List<String> cavityMap(List<String> grid) {
        // Write your code here
        if(grid.size()<=2){
            return grid;
        }
        int n = grid.size();
        List<String> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            String modified="";
            String curr = grid.get(i);
            for(int j=0;j<n;j++){
                char num = curr.charAt(j);
                if(i!=0 && i!=n-1 && j!=0 && j!=n-1){
                    if(num>curr.charAt(j-1) && num>curr.charAt(j+1) && num>grid.get(i-1).charAt(j) && num>grid.get(i+1).charAt(j)){
                        modified+="X";
                    }else{
                        modified+=num;
                    }
                }else{
                    modified+=num;
                }
            }
            result.add(modified);
        }
        return result;
    }
}
