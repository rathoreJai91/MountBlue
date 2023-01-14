public class BeautifulBinaryString {
    public static int beautifulBinaryString(String b) {
        // Write your code here
        int changes=0;
        for(int i=0;i<b.length()-2;i++){
            if(b.charAt(i)=='0' && b.charAt(i+1)=='1' && b.charAt(i+2)=='0'){
                changes++;
                i+=2;
            }
        }
        return changes;
    }
}
