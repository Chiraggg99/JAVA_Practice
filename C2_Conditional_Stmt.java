import java.util.*;
public class C2_Conditional_Stmt {
    
    public static void main(String[] args) {

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
        
    }
}