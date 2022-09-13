/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_copia_objetos;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA1_12_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int value = 100;
        int copiaValue;
        copiaValue = value;
        System.out.println("Valor = " + value);
        System.out.println("Copia = " + copiaValue);
        value ++;
        
        System.out.println("Valor = " + value);
        System.out.println("Copia = " +copiaValue);
        
        //Objeto
        pruebaValor prueba = new pruebaValor();
        prueba.x = 1000;
        pruebaValor pruebaCopia = new pruebaValor();
        pruebaCopia = prueba;
        
        System.out.println("AHORA CON EL OBJETO");
        System.out.println("Prueba " + prueba.x);
        System.out.println("Prueba copia " + pruebaCopia.x);
        
        prueba.x++;
        System.out.println("Prueba " + prueba.x);
        System.out.println("Prueba copia " + pruebaCopia.x);
        
        
    }
    
}

class pruebaValor {
    int x;
}