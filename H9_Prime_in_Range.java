public class H9_Prime_in_Range {
    //WAP to Print all Prime no in a Range

    public static boolean isPrime(int n) {
            if (n==2){
                return true;
            }
            for (int i=2 ; i<=Math.sqrt(n) ; i++){               
                if (n % i == 0) {
                    return false;
                }
            }return true;
        }

    public  static void PrimesInRange(int n){
        for(int i=2 ; i<=n ; i++) {    // true then print
            if (isPrime(i)) {
                System.out.print(i+ " ");
            }
        } System.out.println();
    }   
    public static void main (String args[]) {
        PrimesInRange(5);
        
    }    
}


