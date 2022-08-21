/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_heap;

/** En Java las direcciones de memoria se les llama referencias
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA_3_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
        //obj y obj2 guardan referencias
        Prueba obj = new Prueba();
        Prueba obj2 = new Prueba();
        System.out.println(x);
        System.out.println(obj.valor);
        System.out.println(obj2);
        
    }
    
}

 class Prueba {
    public int valor = 100;
}