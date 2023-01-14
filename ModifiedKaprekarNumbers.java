public class ModifiedKaprekarNumbers {
    public static void kaprekarNumbers(int p, int q) {
        // Write your code here
        // boolean check=false;
        // for(int i=p;i<=q;i++){
        //     if(i==1){
        //         System.out.print(i+" ");
        //         check=true;
        //         continue;
        //     }
        //     int d=String.valueOf(i).length();
        //     String square = String.valueOf(i*i);
        //     if(square.length()>1){
        //         int index=square.length()-d;
        //         long x = Long.valueOf(square.substring(0,index));
        //         long y = Long.valueOf(square.substring(index));
        //         if(x+y==i){
        //             System.out.print(i+" ");
        //             check=true;
        //         }
        //     }
        // }
        // if(!check){
        //     System.out.println("INVALID RANGE");
        // }

        boolean flag = false;//Denotes if a Kaprekar number has been found
        
        if(p == 1)//Handle the one case where a 1 digit square is a Kaprekar
        {
            System.out.print(p+" ");
            flag = true;
        }
        
        
        for(long i = p; i <= q; i++)
        {
            long squareLong = i * i;
            String squareStr = String.valueOf(squareLong);
            
            if(squareStr.length() > 1)
            {
                long left = Long.parseLong(squareStr.substring(0,(int)Math.ceil(squareStr.length()/2)));
                long right = Long.parseLong(squareStr.substring((int)Math.ceil(squareStr.length()/2), squareStr.length()));
                if(left+right == i)
                {
                    System.out.print(i+" ");
                    flag = true;
                }
            }
        }
        if(!flag)
        {
            System.out.println("INVALID RANGE");
        }
    }
}
