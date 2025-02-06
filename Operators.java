public class Operators {
       public static void main (String args[]){
        // Arithmatic operator(Binary)        ( + , - , * , / , % )  
        int A = 10;
        int B = 5;
        System.out.println("Addition of A and B is : " + (A+B)); 
        
        // Unary operator                     ( ++ , -- )
        //int C = ++A;                       //PRE
        //System.out.println(A + "," + C);
        int D = A++;                         //Post
        System.out.println(A + "," + D );

        //Relational operator                  ( == , != , > , < , <= , >= )
        System.out.println((A==B));

        // Logical Operator (AND , OR , NOT)
        System.out.println((3<2) && (3>5)); //Logical AND  (T AND F = T)
        System.out.println((3>6)||(7>0));   //Logical OR   (T OR F = F)
        System.out.println(!(3>2));         //Logical NOT  ( T = F , F = T )

        //Assignment operator                  (= , += , -= , *= , /=)
        int F = 10;
        // F = F + 10;
        F+= 10 ;
        System.out.println(F);     
       }
}
