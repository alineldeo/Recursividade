public class PositivoN {

    public static void main (String args []){
    System.out.println (PositivoN.soma(5));
    }
  public static int soma (int n) {
	     if(n == 1) {
	 	return 1;
             }
	     return n + soma(n - 1);

  }
}