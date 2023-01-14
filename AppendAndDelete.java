public class AppendAndDelete {
    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        if(s.length()+t.length()<=k){
            return "Yes";
        }
        int i = 0;
        while(i < s.length() && i < t.length()){
            if(s.charAt(i) != t.charAt(i)){
                break;
            }
            i++;
        }
        int diffCount=(s.length()-i)+(t.length()-i);
        if(diffCount>k){
            return "No";
        }
        return (k>=diffCount && (k-diffCount)%2==0)? "Yes" : "No";
    }
}
