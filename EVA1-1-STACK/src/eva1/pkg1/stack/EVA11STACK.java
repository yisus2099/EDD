/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1.pkg1.stack;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA11STACK {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("INICIA MAIN");
        
     A();
        System.out.println("RETOMA EJECUCIÒN MAIN");
        System.out.println("TERMINA MAIN");
    }

    public static void A() {
        System.out.println("INICIA A");
        B();
        System.out.println("RETOMA A");
        System.out.println("TERMINA A");
    }

    public static void B() {
        System.out.println("INICIA B");
        int i = 1;
        double d = 10.0;
        System.out.println("TERMINA B");

    }

}
