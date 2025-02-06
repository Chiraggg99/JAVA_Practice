import java.util.*;
public class Conditional_Stmt {
    
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

        //WAP To Print Largest of 2 numbers

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

         // Else if Statement
         int age = 22;
        if (age >= 18) {
            System.out.println("Adult");
        }
        else if (age > 13 && age < 18 ) {
            System.out.println("Teenager");
        }
        else {
            System.out.println("Child");
        } 

        // Income Tax Calculator
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax ; 
        
        if (income <500000) {
            tax = 0 ;

        }else if (income >=500000 && income <1000000) {
            tax = (int) (income * 0.2);

        } else {
            tax = (int) (income *0.3);
        }   System.out.println("Your Tax is : " + tax);    
        
        // WAP To Print Largest of Three numbers
        int X = 1 , Y = 2 , Z = 3;
        if ((X >= Y) && (X >= Z) ) {
        System.out.println("Largest is X");

        }else if ((Y >= Z)) {
        System.out.println("Lagest is Y");
    
        }else {
        System.out.println("Largest is Z");
        }


        // Ternary operator 
        // (Variable = Condition ? Stmt 1 : Stmt 2;)
        
        int A = 4;
        String type = ((A % 2 ) == 0 ) ? "Even" : "Odd" ;
        System.out.println(type);

        // Student PASS / FAIL :

        int marks = 89;       
        String reportcard = marks >= 33 ? "Pass" : "Fail";
        System.out.println(reportcard);

        // SWITCH Stmt:
        int number = 2;
        switch(number) {
        case 1 : System.out.println("Samosa");
                    break;
        case 2 : System.out.println("Burger"); 
                    break; 
        case 3 : System.out.println("Momoes");
                    break;
        default:System.out.println("We wake up!!");
        }
    }
}
