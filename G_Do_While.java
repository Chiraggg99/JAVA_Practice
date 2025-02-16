import java.util.*;

public class G_Do_While {
    public static void main (String [] args) {

    // DO WHILE LOOP    
        int counter = 1 ;
        do{
            System.out.println("Hello World");
            counter++;

        } while (counter <= 10);


    // Break Stmt in Looping    
         for(int i=1 ; i<=5 ; i++) {
            if (i == 3){
              break;
            }
             System.out.println(i);
        }

        System.out.println("I am out of the loop");

        
        
    //  WAP to Keep Entering number till user enter a multiple of 10
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter your no : ");
            int n = sc.nextInt();

            if( n % 10 == 0 ) { 
                break;
            }
            System.out.println(n);

        } while(true);


    // Continue Stmt : To Skip a iteration

        for( int i=1 ; i<=5 ; i++ ) {
         if (i == 3){
              continue;
            }
            System.out.println(i);
        }


    }
}
