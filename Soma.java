
public class Soma {
    
    
public static void main (String [] args) {
 
int []v = {1,2,3,4,5};

       int resultado = somarV (v, 0);
       
       System.out.println(resultado);
  } 
   public static int somarV (int[]v, int i){
    
       int resultado = somarV (v, 0);
    if (i<v.length ) 
   return v[i] + somarV (v, i + 1);
     else return 0;
  
   
  }    
  }

