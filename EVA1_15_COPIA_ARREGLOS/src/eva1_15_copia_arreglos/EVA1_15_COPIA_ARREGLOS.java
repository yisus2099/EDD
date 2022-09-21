/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_copia_arreglos;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA1_15_COPIA_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arregloDatos = new int [100];
        llenar(arregloDatos);
        imprimir(arregloDatos);
        
        int [] arregloCopia = new int [arregloDatos.length];
        System.out.println("");
        System.out.println(arregloDatos);
        System.out.println(arregloCopia);
        
        for (int i = 0; i < arregloDatos.length; i++) {
            arregloCopia [i] = arregloDatos [i];
        }
        imprimir(arregloCopia);
    }
    
    public static void llenar (int[] array){
        for (int i = 0; i < array.length; i++) {
            array [i] = (int)(Math.random()*100);  
        }
    }
    
    public static void  imprimir (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[ " + array[i] + " ]");
        }
    }
}

