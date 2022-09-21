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
           
        }
       
    for (int i = 0; i < arreglo.length; i++) { //PRIMER DIMENSION (3 FILAS)  
                    for (int j = 0; j < arreglo[i].length; j++) {//SEGUNDA DIMENSION (
                    System.out.print("[" + arreglo[i][j] + "]");
                }
                     System.out.println("");
                     
   
    }                
        }
    }
   
    ////////////////
    /*int [][] arreglo2 = new int[5][5];
     for (int x = arreglo.length; x == 0;  x--) { //PRIMER DIMENSION (3 FILAS)
                for (int y = arreglo.length; y == 0;  y--) {//SEGUNDA DIMENSION (
                    arreglo2[x][y] = arreglo[x][y];
                }
           
        }
       
    for (int x = 0; x < arreglo2.length; x++) { //PRIMER DIMENSION (3 FILAS)  
                    for (int y = 0; y < arreglo2[y].length; y++) {//SEGUNDA DIMENSION (
                    System.out.print("[" + arreglo2[x][y] + "]");
                }
                     System.out.println("");
    */