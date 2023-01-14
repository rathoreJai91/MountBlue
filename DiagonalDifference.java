import java.util.*;

public class DiagonalDifference{

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int leftDiagonal=0;
        int rightDiagonal=0;
        int n=arr.size();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    leftDiagonal+=arr.get(i).get(j);
                }
                if(j==n-i-1){
                    rightDiagonal+=arr.get(i).get(j);
                }
            }
        }
        return Math.abs(leftDiagonal-rightDiagonal);
    }

}