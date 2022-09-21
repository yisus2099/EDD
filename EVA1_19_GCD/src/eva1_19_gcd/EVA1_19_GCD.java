/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_gcd;

/**
 * LISTO
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA1_19_GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(gcd(181, 7));
    }

    public static int gcd(int dividiendo, int divisor) {
        int res = dividiendo % divisor;

        if (res == 0) { //Maximo comun mínimo
            return divisor;
        } else {
            return gcd(divisor, res);
        }
    }
}
