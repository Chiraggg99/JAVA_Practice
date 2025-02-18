import java.util.*;
public class H8_Prime {
     // WAP to check a no n is Prime or not
        
        // only for n>=2
        public static boolean isPrime(int n){ 
            if (n==2){
                return true;
            }          
            boolean isPrime = true;
            for (int i=2 ; i<=n-1 ; i++){          // i<= Math.sqrt(n) [For more optimized solution]
                if (n % i==0){ 
                    isPrime = false;
                    break;
                }
            } 

            return isPrime;
        }
        public static void main (String args[]) {
            System.out.println(isPrime(4));
    }


    // public static boolean isPrime(int n){
    //     if (n==2){
    //         return true;
    //     }
    //     for (int i=2 ; i<=Math.sqrt(n) ; i++){               //  OPTIMIZED CODE
    //         if (n % i == 0) {
    //             return false;
    //         }
    //     }return true;
    // }
    // public static void main (String args[]) {
    //              System.out.println(isPrime(3));
    
    // }    
}
