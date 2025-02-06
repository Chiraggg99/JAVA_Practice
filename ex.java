import java.util.*;

public class ex {
    public static void main (String [] args) {
    
        // WAP To check if the number is prime or not  [  n = root(n) * root(n)  ]

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   

        if(n==2) {
            System.out.println("n is a prime number");

        } else {
            boolean isPrime = true;
            for (int i=2 ; i<=n-1 ; i++) {
                if ( n % i ==0) {  // n is a multiple of i (i not equal to n)
                    isPrime = false;

                }
            }
            if (isPrime == true) {
                System.out.println("n is a prime number");
            } else {
                System.out.println("n is not a prime number");
            }

        
        }
        
    }

}


