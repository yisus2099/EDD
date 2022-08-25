/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_arreglos;

/**  TDA --> Tipo abstracto de dato (objetos y clases)
 *   Estilo de programacion 
 *      CamelCase
 * funciones e identificadores ->empiezan las minusculas
 * 
 * 
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA1_4_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TIPO DE DETO [ ] IDENTIFICADOR = new TIPO DE DE DATO [TAMAÑO]
        //ARREGLO DE ENTEROS PARA CAPTURAR EDADES:
        //TODOS LOS IDENTIFICADORES DECLARADOS SON ARREGLOS ENTEROS
        int [] arregloEdades, arregloSalario, arregloCali;
        //SOLO ARREGLOPROMEDIO ES ARREGLO
        double arregloPromedio[], porcentaje;
        //LOS ARREGLOS SON OBJETOS
        arregloEdades = new int [50];
        
        System.out.println(arregloEdades);
        for (int i = 0; i < arregloEdades.length; i++) {
                arregloEdades[i] = (int)(Math.random() * 100);
            }
        for (int i = 0; i < 50; i++) {
            System.out.println("[" + i + "] = " + arregloEdades[i]);
            }
    }
    
}
