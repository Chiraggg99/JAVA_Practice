import java.util.*; 
public class JavaBasics {
    public static void main (String args[] ) {
        System.out.println("Hello World ");
        /*  for Comment  */

       /*  int a = 10;
        int b = 20;
        String name = "Tony Stark";
        System.out.println(a + b + "," + name); */
        
    Scanner sc = new Scanner(System.in);
    //String input = sc.next();        // sc.nextLine TO INCLUDE SAPCES IN INPUT (Eg Tony Stark)
    //System.out.println(input);  

    int a =  sc.nextInt();
    int b = sc.nextInt();             
    int sum = a + b ;
    System.out.println(sum);   

    }
}
