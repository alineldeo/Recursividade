
public class Inverte {
    
     public static void main (String [] args) {
         System.out.println(123);
 }
          public static int invert (int n, int total){
             if (n == 0 ) 
               return total;
               else  return invert( n / 10, total * 10  +  n  %  10);
    
    
}
          
          }