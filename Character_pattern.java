public class Character_pattern {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';
        //Outer Loop
        for(int i=1 ; i<=n ; i++ ) {     // i = lines
            //inner loop
            for (int j=1 ; j<=i ; j++){  // j = char
                    System.out.print(ch);
                    ch++;
            }System.out.println();
            
        }
    }
    
}
