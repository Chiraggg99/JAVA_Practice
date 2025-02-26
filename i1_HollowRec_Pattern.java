public class i1_HollowRec_Pattern {
    public static void hollow_rec(int totRows ,int totCols) {
        for(int i=1 ; i<= totRows ; i++) {  //outer loop
            for (int j=1 ; j<=totCols ; j++) { //inner - column
                // cell - (i,j)
                if(i == 1 || i == totRows || j == 1 || j == totCols)  {
                //boundar cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }   
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        hollow_rec(4,4 );
    }    
}
