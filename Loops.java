import java.util.*;

public class Loops {
    public static void main(String[] args) {

        // # WHILE LOOP
        int Counter = 0;
        while (Counter < 10) {
            System.out.println("Hello World");
            Counter++ ;
        }
        System.out.println("Printed HW 10x");


        // WAP To Print no 1 to 10 using WHILE LOOP :
        int no = 0 ;
        while ( no <= 10){
            System.out.print(no);
            no++;
        }

         
        // WAP To Print number from 1 to N :
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of N :");
        int n = sc.nextInt();
        int a = 1 ;

        while (a <= n) {
            System.out.print(a+" ");
            a++;
        }
        

        // WAP To Print Sum of first n Naturat numbers :
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value of N :");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1 ;

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of Natural no.s is : "+ sum);


        
        
        
    }
}
