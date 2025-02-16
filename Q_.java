public class Q_ {
    
    public static void swap(int a , int b) {
        //SWAP
         int temp = a;
         a = b ;
         b = temp ;
 
         System.out.println("A = "+ a);
         System.out.println("B = " + b);

    }

    public static void main(String[] args) {
        //swap - value Exchange
        int a = 5;
        int b = 10;
        swap(a , b);
       
    }
} 