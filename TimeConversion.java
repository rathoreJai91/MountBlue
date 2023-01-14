public class TimeConversion {
    public static String timeConversion(String s) {
        // Write your code here

        if(s.charAt(s.length()-2)=='A'){
            if(s.charAt(0)=='1' && s.charAt(1)=='2'){
                return "00"+s.substring(2,8);
            }else{
                return s.substring(0, 8);
            }
        }else{
            int hour=Integer.parseInt(s.substring(0, 2));
            if(hour!=12){
                hour=12+hour%12;
            }
            return Integer.toString(hour)+s.substring(2, 8);
        }

    }
}
