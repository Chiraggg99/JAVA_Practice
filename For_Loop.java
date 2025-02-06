import java.util.*;
public class For_Loop {
    public static void main (String [] args) {
        // # For loop
        for(int i = 1 ; i<=10; i++) {
            System.out.println("Hello World");
            }
         

        // WAP To Print a Square pattern 
        for (int line = 1 ; line <=4 ; line++) {
            System.out.println("****");
        }
             //  ->>>> Same code with while loop
        int line =1 ;
        while(line <= 4) {
            System.out.println("****");
            line++;
        }

       
        // WAP To Print Reverse of a no

        int n = 10899;

        while( n > 0 ) {
            int lastdigit = n % 10;
            System.out.print(lastdigit + " ");
            n = n / 10 ; // n/=10
        }
       System.out.println();

    
       // Reverse the Giver no (Change the original no)
       int n = 10899;
       int rev = 0;
       
       while ( n > 0) {
           int lastdigit = n % 10;
           rev = ( rev*10 ) + lastdigit;
           n=n/10;

       }
       System.out.println(rev);
       

       // WAP To display all no entered by the used excet multiple of 10

         Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter your number: ");
            int n = sc.nextInt();

         if (n % 10 == 0 ) {
            continue;
            }
            System.out.println("Number was : " + n );
        } while(true);

       
    }
    

}  