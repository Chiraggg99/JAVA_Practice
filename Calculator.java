import java.util.*;
public class Calculator {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value of A :");
        int a = sc.nextInt();

        System.out.println("Enter the Value of B :");
        int b = sc.nextInt();

        System.out.println("Define Operator (+ , - , * , / , %)");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+' : System.out.println("Addition of A and B is : " + a+b);
                        break;
            case '-' : System.out.println("Subtraction of A and B is : " + (a-b));
                        break;
            case '*' : System.out.println("Multiplication of A and B is : " + a*b);
                        break;
            case '/' : System.out.println("Division of A and B is : " + a/b);
                        break;
            case '%' : System.out.println("Modulo of A and B is : " + a%b);
                        break;
            default  : System.out.println("Wrong operator");        
        }

     }   
}
