public class FunnyString {
    public static String funnyString(String s) {
        // Write your code here
        int forward=0;
        int reverse=0;
        int i=0,j=s.length()-1;

        while(i<j){
            forward+=Math.abs(s.charAt(i)-s.charAt(i+1));
            reverse+=Math.abs(s.charAt(j)-s.charAt(j-1));
            i++;
            j--;
        }
        if(forward==reverse) return "Funny";

        return "Not Funny";
    }
}
