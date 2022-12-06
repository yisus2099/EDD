package eva3_3_busqueda_binaria;

import java.util.Scanner;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA3_3_BUSQUEDA_BINARIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //IMPRIMIR ARREGLO

        int[] arregloDatos = new int[15];
        int[] arregloSel = new int[arregloDatos.length];

        System.out.println("ARREGLO ORIGINAL: ");
        llenar(arregloDatos);
        copiar(arregloDatos, arregloSel);
        imprimir(arregloDatos);
        
        System.out.println("SELECTION SORT: ");
        selectionSort(arregloSel);
        imprimir(arregloSel);

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el valor a buscar.");
        int buscar = input.nextInt();
        System.out.println("El valor está en la posición: " + busquedaBinaria(arregloSel, buscar));

    }

    //LLENAR ARREGLO
    public static void llenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }

    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < 10) {
                System.out.print("[" + arreglo[i] + "]");
            } else {
                System.out.print("[" + arreglo[i] + "]");
            }
        }
        System.out.println("");
    }

    //COPIAR ARREGLO
    public static void copiar(int[] arreglo, int[] copia) {
        for (int i = 0; i < arreglo.length; i++) {
            copia[i] = arreglo[i];
        }
    }

    //SELECTION SORT (n2) 
    //COMPRACIONES
    //INTERCAMBIOS (SWAP)
    public static void selectionSort(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            int min = i;
            //BUSCAR EL ELEMENTO (POSICION) MAS PEQUEÑO
            for (int j = i + 1; j < arreglo.length; j++) {
                //Buscar el mas pequeño
                if (arreglo[min] > arreglo[j]) {
                    min = j;
                }
            }
            //SWAP INTERCAMBIAR 
            if (min != i) {
                int temp = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = temp;
            }
        }
    }

    //BUSQUEDA BINARIA // arreglo con los datos, valor a buscar
    public static int busquedaBinaria(int[] datos, int valor) {
        return busquedaBinRec(datos, 0, datos.length - 1, valor);

    }

    //O(logn) base 2
    private static int busquedaBinRec(int[] datos, int ini, int fin, int valor) {
         int mitad = ini + ((fin - ini) / 2);
        int resu = -1;
        if (ini < fin) {
            if (valor == datos[mitad]) {
                resu = mitad;
            } else if (valor < datos[mitad]) {
                resu = busquedaBinRec(datos, ini, mitad - 1, valor);
            } else {
                resu = busquedaBinRec(datos, mitad + 1, fin, valor);
            }
        }
        return resu;
    }
}
