
package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
  
        for (int i=0; i<20; i++){
        System.out.print( Fibonacci.fact (i) + 
                "    ");

        }
        
        }
    public static int fact (int n) {
      if ( n < 2) {
         return 1;
     }
          return fact (n-1) + fact (n-2);
}

      
  }
    
    

