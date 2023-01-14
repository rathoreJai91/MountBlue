public class CamelCase {
    public static int camelcase(String s) {
        // Write your code here
        int words=0;
        if(!s.isEmpty()){
            words++;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                words++;
            }
        }
        return words;
    }
}
