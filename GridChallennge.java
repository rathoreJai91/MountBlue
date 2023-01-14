import java.util.Arrays;
import java.util.List;

public class GridChallennge {

    static final int MAX_CHAR=26;

    public static String sort(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String sorted="";
        for(char i : arr){
            sorted+=i;
        }
        return sorted;
    }

    public static boolean check(List<String> grid,int n){ 
        int l=grid.get(0).length();
        for(int i=0;i<l;i++){
            for(int j=0;j<n-1;j++){
                if(grid.get(j).charAt(i)>grid.get(j+1).charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static String gridChallenge(List<String> grid) {
        // Write your code here
        int n=grid.size();
        for(int i=0;i<n;i++){
            grid.set(i, sort(grid.get(i)));
        }
        if(check(grid,n)){
            return "YES";
        }
        return "NO";
    }

}
