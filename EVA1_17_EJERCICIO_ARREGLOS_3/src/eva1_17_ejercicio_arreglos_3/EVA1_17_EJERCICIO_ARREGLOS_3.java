/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_ejercicio_arreglos_3;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA1_17_EJERCICIO_ARREGLOS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
         int [][] arreglo = new int[5][5];
       
     for (int i = 0; i < arreglo.length; i++) { //PRIMER DIMENSION (3 FILAS)
                for (int j = 0; j < arreglo[i].length; j++) {//SEGUNDA DIMENSION (
                    arreglo[i][j] = ((int)((Math.random() * 100)) + 1);
                }
           imprimirMatriz(arreglo);
        }
       
 }                
        
    
    public static void imprimirMatriz (int [][]arreglo){
        for (int i = 0; i < arreglo.length; i++) { 
                    for (int j = 0; j < arreglo[i].length; j++) {
                    System.out.print("[" + arreglo[i][j] + "]");
                }
                     System.out.println("");
                     
   
    }                
    }
}
    