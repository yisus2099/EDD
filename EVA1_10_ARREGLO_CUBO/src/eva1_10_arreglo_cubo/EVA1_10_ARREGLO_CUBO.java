/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_arreglo_cubo;

/**
 *
 * @author moviles
 */
public class EVA1_10_ARREGLO_CUBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][][] cuboDatos = new int [3][4][5];
        for (int i = 0; i < cuboDatos.length; i++) {
            for (int j = 0; j < cuboDatos[i].length; j++) {
                for (int k = 0; k < cuboDatos[i][j].length; k++) {
                    cuboDatos[i][j][k] = 50;
                }
                
                
            }
            
        }
        
          for (int i = 0; i < cuboDatos.length; i++) {
            for (int j = 0; j < cuboDatos[i].length; j++) {
                for (int k = 0; k < cuboDatos[i][j].length; k++) {
                    System.out.print("[" + cuboDatos[i][j] + "]");
                }
                
                
            }
            System.out.println("");
        }
    }
    
}
