public class C3_Conditional_Stmt {
    public static void main(String[] args) {
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
