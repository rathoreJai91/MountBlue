

public class StrongPassword {
    
    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int addCharacters=0;
        boolean lowercase=false, uppercase=false, number=false;
        boolean special=false;
        for(int i=0;i<n;i++){
            if(password.charAt(i)>='a' && password.charAt(i)<='z'){
                lowercase=true;
            }else if(password.charAt(i)>='A' && password.charAt(i)<='Z'){
                uppercase=true;
            }else if(password.charAt(i)>='0' && password.charAt(i)<='9'){
                number=true;
            }else{
                special=true;
            }
        }
        if(!lowercase){
            addCharacters++;
        }
        if(!uppercase){
            addCharacters++;
        }
        if(!number){
            addCharacters++;
        }if(!special){
            addCharacters++;
        }
        if(n<6){
            return Math.max(addCharacters,6-n);
        }
        return addCharacters;
    }
}
