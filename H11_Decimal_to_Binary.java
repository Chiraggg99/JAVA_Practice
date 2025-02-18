public class H11_Decimal_to_Binary{

    public static void decToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while (n > 0) {
            int rem = n % 2;        // Last Digit (in Binary form so %2)
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }       System.out.println("Binarry form of " + myNum + " = " + binNum);
    }
     public static void main(String[] args) {
        decToBin(7);    
    }
}
