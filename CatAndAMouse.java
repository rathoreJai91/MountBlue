public class CatAndAMouse {
    
    static String catAndMouse(int x, int y, int z) {
        int disA=Math.abs(z-x);
        int disB=Math.abs(z-y);
        if(disA<disB){
            return "Cat A";
        }else if(disB<disA){
            return "Cat B";
        }else{
            return "Mouse C";
        }
    }
}
