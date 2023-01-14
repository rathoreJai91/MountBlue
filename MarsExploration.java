public class MarsExploration {
    
    public static int marsExploration(String s) {
        // Write your code here
        int alterations=0;
        for(int i=0;i<s.length();i++){
            if(i%3==0 || i%3==2){
                if(s.charAt(i)!='S'){
                    alterations++;
                }
            }else{
                if(s.charAt(i)!='O'){
                    alterations++;
                }
            }
        }
        return alterations;
    }
}
