
public class CaesarCipher {
    public static String caesarCipher(String s, int k) {
        // Write your code here
        String encrypted="";
        for(int i=0;i<s.length();i++){
            int curr=s.charAt(i);
            if(curr>=65 && curr<=90){
                curr= 65 + (curr-65+k)%26;
            }else if(curr>=97 && curr<=122){
                curr= 97 + (curr-97+k)%26;
            }
            encrypted+=(char)curr;
        }            
        return encrypted;
    }
}
