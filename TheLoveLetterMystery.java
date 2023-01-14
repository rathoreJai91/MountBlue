public class TheLoveLetterMystery {
    public static int theLoveLetterMystery(String s) {
        // Write your code here
        int start=0;
        int end=s.length()-1;
        int count=0;

        while(start<end){
            count+=Math.abs(s.charAt(start)-s.charAt(end));
            start++;
            end--;
        }
        return count;
    }
}
