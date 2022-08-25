/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_for_each;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA1_5_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arregloDatos = new int[50];
        for (int i = 0; i < arregloDatos.length; i++) {
                arregloDatos[i] = (int)(Math.random() * 100);
            }
        //for-each
        for (int arregloDato : arregloDatos){
            System.out.print("[" + arregloDato + "]");
        }
    }
    
}
