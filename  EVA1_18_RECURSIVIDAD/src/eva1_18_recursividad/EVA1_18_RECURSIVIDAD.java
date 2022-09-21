/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_recursividad;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA1_18_RECURSIVIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

    public static void falsoForDes(int valor) {
        if (valor == 1) {
            System.out.println(valor + " - ");

        }
    }

    public static void falsoForAsc(int valor, int ini) {
        System.out.println("");
        if (ini <= valor) {
            System.out.println(ini + " - ");
            falsoForAsc(valor, ini + 1);
        }
    }
}
