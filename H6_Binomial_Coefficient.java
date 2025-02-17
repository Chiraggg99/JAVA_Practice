public class H6_Binomial_Coefficient {       

    public static int factorial(int n){
        int f = 1 ;
        
        for (int i=1 ; i<=n ; i++){
            f = f * i;   
             
        } return f ;                                      // Fatctorial of n 
    } 

    public static int binCoefficient(int n , int r){      // Binomial coefficient =  nCr = n! \ r!(n-r)!
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);                    // nmr = n-r
        int binCoeff  = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }
    public static void main(String[] args) {
        System.out.println(binCoefficient( 5 , 2)); 
            
    }

}
