
public class DayOfTheProgrammer {
    public static String dayOfProgrammer(int year) {
        // Write your code here
        String pDay="";
        if(year==1918){
            pDay+="26.09."+Integer.toString(year);
        }else if(year<1918){
            if(year%4==0){
                pDay+="12.09."+Integer.toString(year);
            }else{
                pDay+="13.09."+Integer.toString(year);
            }
        }else{
            if(year%400==0 || (year%4==0 && year%100!=0)){
                pDay+="12.09."+Integer.toString(year);
            }else{
                pDay+="13.09."+Integer.toString(year);
            }
        } 
        return pDay;
    }
}
