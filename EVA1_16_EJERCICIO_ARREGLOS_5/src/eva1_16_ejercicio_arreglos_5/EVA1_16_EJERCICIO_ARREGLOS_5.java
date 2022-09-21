
package eva1_16_ejercicio_arreglos_5;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA1_16_EJERCICIO_ARREGLOS_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
       
        int [] arreglo = new int[50];
       
        for (int i = 0; i < arreglo.length; i++) {
            arreglo [i] = ((int)((Math.random() * 100)) + 1);
        }
       
        for (int i = 0; i < arreglo.length; i++) {
        if (arreglo[i] % 2 == 0)
        System.out.println("[ " + arreglo[i] + " ]");
        }
    }
   
}