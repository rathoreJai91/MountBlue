
public class LibraryFine {
    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here
        // if(y1>y2){
        //     return 10000;
        // }else if(m1!=m2){
        //     return (m1-m2)*500;
        // }else if(d1!=d2){
        //     return (d1-d2)*15;
        // }
        // return 0;

        int fine=0;
        if(y1==y2){
            if(m1==m2){
                if(d1>d2){
                    fine=(d1-d2)*15;
                }
            }else if(m1>m2){
                fine=(m1-m2)*500;
            }
        }else if(y1>y2){
            fine=10000;
        }
        return fine;
    }
}
