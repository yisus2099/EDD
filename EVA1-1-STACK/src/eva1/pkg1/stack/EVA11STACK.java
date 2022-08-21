/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1.pkg1.stack;

/**
 *
 * @author Jesùs Alejandro Torres Ramìrez
 */
public class EVA11STACK {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        // TODO code application logic here
     sout("INICIA MAIN")
        
     A();
        "RETOMA EJECUCIÒN MAIN"
        "TERMINA MAIN"
    }

    public static void A() {
        sysout("INICIA A")
        B();
        "RETOMA A"
            "TERMINA A"
    }

    public static void B() {
        "INICIA B"
        int i = 1;
        double d = 10.0;
        "TERMINA B"

    }

}
