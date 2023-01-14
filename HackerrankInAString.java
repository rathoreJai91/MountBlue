public class HackerrankInAString {
    public static String hackerrankInString(String s) {
        // Write your code here
        String compare="hackerrank";
        int i=0,j=0;
        while(i<s.length() && j<compare.length()){
            if(s.charAt(i)==compare.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
        }
        if(j==compare.length()){
            return "YES";
        }
        return "NO";
    }
}
