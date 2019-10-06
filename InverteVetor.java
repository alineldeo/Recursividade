
public class InverteVetor {
    public static void main (String args []) {

        float []v = {1,2,3,4,5,6};
            inverter (v,0, v.length - 1);


}
    public static void inverter (float []v, int i, int a) {
           if (i < a) {
             trocar (v, i, a);
           inverter (v, i + 1, a -1);
   }
 
} 
   public static void trocar (float []v, int i, int a) {
       float aux = v[i];  
       v[i] = v[a];
       v[a] = aux;

    }
}

