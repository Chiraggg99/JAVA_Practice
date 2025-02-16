import java.util.*;
public class P_Function_Parameter {
 
    public static int caclulatesum(int num1 ,int num2) {    // int a , int b is FUNCTION PARAMETERS
                                                            //Parameter or formal parameter(DEFINATION)

        int sum2 = num1 + num2 ;
        return sum2;  
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum1 = caclulatesum(a , b );               // Function Call with parameter
                                                       // Argument or actual parameter(CALL)
        System.out.println("Sum is : " + sum1);
        
    }  
}
