/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_arreglos_multidim;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA1_9_ARREGLOS_MULTIDIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int[][] matrizDatos = new int [3][5];
            System.out.println(matrizDatos.length);
            for (int i = 0; i < matrizDatos.length; i++) { //PRIMER DIMENSION (3 FILAS)
                System.out.println("Columnas: "  + matrizDatos[i].length);
                for (int j = 0; j < matrizDatos[i].length; j++) {//SEGUNDA DIMENSION (
                    matrizDatos[i][j] = 100;
                }
            
        }
                for (int i = 0; i < matrizDatos.length; i++) { //PRIMER DIMENSION (3 FILAS)  
                    for (int j = 0; j < matrizDatos[i].length; j++) {//SEGUNDA DIMENSION (
                    System.out.print("[" + matrizDatos[i][j] + "]");
                }
                     System.out.println("");
        }
               
    }
    
}
