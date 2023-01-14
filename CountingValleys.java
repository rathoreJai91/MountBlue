
public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int altitude=0;
        boolean isValley=false;
        int valleyCount=0;

        for(int i=0;i<steps;i++){
            if(altitude==0){
                if(isValley){
                    valleyCount++;
                    isValley=false;
                }
                if(path.charAt(i)=='D'){
                    isValley=true;
                }
            }
            if(path.charAt(i)=='U'){
                altitude++;
            }else{
                altitude--;
            }
        }
        if(altitude==0 && isValley){
            valleyCount++;
        }
        return valleyCount;
    }
}
