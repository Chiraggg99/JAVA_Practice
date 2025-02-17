public class H7_Function_Overloading {  
    
    
// Methods - 1(User defined like sum , product)  ;  2(Inbuilt like pow() , sqrt() , max() )
// FUNCTION OVERLOADING = Multiple function with same name but diff parameters


public static int sum(int a , int b){           //Fn to calculate sum of two no.s
    return a+b;
}
public static int sum(int a , int b , int c){   //Fn to calculate sum of three no.s
    return a+b+c;
}
public static float sum(float a , float b){         //Fn to calculate sum of two float no.s
    return a+b;
}
    public static void main (String args[]){
        System.out.println(sum(5,3));
        System.out.println(sum(4,5,3));
        System.out.println(sum(3,2));
        System.out.println(sum(2.3f,3.4f));    // float typ

    }
    
}
