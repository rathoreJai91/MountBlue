public class SeparateTheNumbers {
    public static void separateNumbers(String s) {
        // Write your code here
        boolean isValid=false;
        String subString="";

        for(int i=1;i<=s.length()/2;i++){
            subString=s.substring(0, i);
            String beautiful=subString;
            Long currNum=Long.parseLong(subString);
            while(beautiful.length()<s.length()){
                beautiful+=Long.toString(++currNum);
            }
            if(beautiful.equals(s)){
                isValid=true;
                break;
            }
        }
        System.out.println((isValid)?"YES "+subString : "NO");
    }
}
