/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_14_paso_ref;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA1_14_PASO_REF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arregloDatos = new int [100];
    }
    public static void llenar (int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = 100;
        }
    }
    public static void imprimir (int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + arreglo[i] + "]");
        }
    }
}
