
public class SeqFibonacci {
    public static void main (String args []) {
        for (int i=0; i<0; i++){
        System.out.println("O proximo número da sequência Fibonacci é: " + fact (3));
        }
        
        }
    public static int fact (int n) {
      if ( n < 2) {
         return n;
     }else{
          return fact (n-1) + fact (n-2);
}

      
  }
      
}
