import java.util.*;
public class C1_Conditional_Stmt {
    
    public static void main(String[] args) {

        //if Else Statement
        int age = 16;
        if (age >= 18) {
            System.out.println("Adult");
        }
        if (age > 13 && age < 18 ) {
            System.out.println("Teenager");
        }
        else {
            System.out.println("Not Adult");
        } 

        // WAP To Print Largest of 2 numbers

         int a = 5 ;
         int b = 10 ;
         if (a>=b) {
            System.out.println("A is largest of two" + a) ;
        } else {
            System.out.println("B is largest of two " + b);
        } 

        // WAP To Print if no is Odd or Even
         Scanner sc = new Scanner(System.in);
         int C = sc.nextInt();
        
         if (C % 2 == 0) {
            System.out.println("No is EVEN");
        } else {
            System.out.println("No is ODD");
        } 

    }
}
