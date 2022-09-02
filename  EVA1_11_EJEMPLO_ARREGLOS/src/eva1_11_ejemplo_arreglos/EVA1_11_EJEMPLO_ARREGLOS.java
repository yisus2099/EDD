/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_ejemplo_arreglos;

import java.util.Scanner;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA1_11_EJEMPLO_ARREGLOS {

    /**
     * @param args the command line arguments int [][] capturaCali = new int
     * [899][000];
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int grupos, alumnos, cali;
        int capturaCali[][];
        System.out.println("¿Cuántos grupos son?");
        grupos = entrada.nextInt();

        capturaCali = new int[grupos][];
        for (int i = 0; i < grupos; i++) {
            System.out.println("¿Cuántos alumnos son del grupo " + (i+1) + "?");
            alumnos = entrada.nextInt();
            capturaCali[i] = new int[alumnos];
        }

        for (int i = 0; i < capturaCali.length; i++) {
            System.out.println("Calificaciones del grupo " + (i+1) + ":");
            for (int j = 0; j < capturaCali[i].length; j++) {
                cali = entrada.nextInt();
                capturaCali[i][j] = cali;
            }
        }
        for (int i = 0; i < capturaCali.length; i++) {
            System.out.println("Calificaciones del grupo " + (i+1) + ":");
            for (int j = 0; j < capturaCali[i].length; j++) {
                System.out.print(capturaCali[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
