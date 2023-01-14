public class PalindromeIndex {
    
    private static boolean isPalindrome(String s, int index) {
        int i=0,j=s.length()-1;
        boolean check=true;
        while(i<=j){
            if(i==index){
                i++;
                continue;
            }
            if(j==index){
                j--;
                continue;
            }
            if(s.charAt(i)!=s.charAt(j)){
                check=false;
                break;
            }
            i++;
            j--;
        }
        return check;
    }

    public static int palindromeIndex(String s) {
        // Write your code here
        int index=-1;
        for(int i=-1;i<s.length();i++){
            if(isPalindrome(s, i)){
                index=i;
                break;
            }
        }
        return index;
    }
}
