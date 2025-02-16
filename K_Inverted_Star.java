public class K_Inverted_Star {
    public static void main(String args[]){
        // WAP to print an inverted star pattern
        int n = 4;
        for(int i=1 ; i<=n ; i++){          //i = line
            for (int j=1 ; j<=n-i+1 ;j++){  //Stars = j = n-i+1
            System.out.print("*");
            }System.out.println();
        }
    }
    
}
