package eva3_1_ordenamientos;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA3_1_ORDENAMIENTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arregloDatos = new int[100];
        int[] arregloSel = new int[arregloDatos.length];
        int[] arregloIns = new int[arregloDatos.length];
        // System.out.println("ARREGLO ORIGINAL: ");
        llenar(arregloDatos);
        imprimir(arregloDatos);
        System.out.println("SELECTION SORT: ");
        copiar(arregloDatos, arregloSel);
        imprimir(arregloSel);
        double ini = System.nanoTime();
        selectionSort(arregloSel);
        double fin = System.nanoTime();
        imprimir(arregloSel);
        System.out.println("Selection Sort = " + (fin - ini));

        System.out.println("INSERTION SORT: ");
        copiar(arregloDatos, arregloIns);
        imprimir(arregloIns);
        ini = System.nanoTime();
        selectionSort(arregloIns);
        fin = System.nanoTime();
        imprimir(arregloIns);
        System.out.println("Insertion Sort = " + (fin - ini));

        System.out.println("QUICK SORT: ");
        copiar(arregloDatos, arregloIns);
        imprimir(arregloIns);
        ini = System.nanoTime();
        quickSort(arregloIns);
        fin = System.nanoTime();
        imprimir(arregloIns);
        System.out.println("QuickSort = " + (fin - ini));
        
         System.out.println("BUBBLE SORT: ");
        copiar(arregloDatos, arregloIns);
        imprimir(arregloIns);
        ini = System.nanoTime();
        bubbleSort(arregloIns);
        fin = System.nanoTime();
        imprimir(arregloIns);
        System.out.println("Bubble sort = " + (fin - ini));
    }

    //LLENAR ARREGLO
    public static void llenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }

    //IMPRIMIR ARREGLO
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

    public static void insertionSort(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            int temp = arreglo[i];//Es los que vamos a ordenar
            int insP = i;
            //BUSCAMOS EN QUE PUNTO DEBE QUEDAR TEMP
            //ESA POSICIÓN QUEDA ALMACENADA EN insP
            for (int prev = i - 1; prev >= 0; prev--) {
                if (arreglo[prev] > temp) {
                    //swap (intercambio parcial)
                    arreglo[insP] = arreglo[prev];
                    insP--;
                } else {
                    break;
                }
            }
            arreglo[insP] = temp;
        }
    }

    //QUICKSORT PUBLICO
    public static void quickSort(int[] arreglo) {
        quickSortRec(arreglo, 0, arreglo.length - 1);

    }

    private static void quickSortRec(int[] arreglo, int ini, int fin) {
        // pivote -> posición
        // Dos indices
        // ind_grand -> busca los mayores al pivote
        // ind peq -> busca los menores al pivote
        // si se encuentran  valores, se intercambian
        // si se cruzan, se intercambia el pivote con ind_peq
        //quicksort a cada lado del pivote
        if (ini >= fin) {
            return;
        }
        int pivot = arreglo[ini];
        int right = fin;
        int left = ini + 1;

        while (left <= right) {
            while (left <= fin && arreglo[left] < pivot) {
                left++;
            }
            while (right > ini && arreglo[right] >= pivot) {
                right--;
            }
            if (left < right) {
                int temp = arreglo[left];
                arreglo[left] = arreglo[right];
                arreglo[right] = temp;
            }
        }
        if (right > ini) {
            int temp = arreglo[ini];
            arreglo[ini] = arreglo[right];
            arreglo[right] = temp;
        }
        quickSortRec(arreglo, ini, right - 1);
        quickSortRec(arreglo, right + 1, fin);

    }

    //BUBBLE SORT 
    public static void bubbleSort(int[] arreglo){
  int n = arreglo.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arreglo[j-1] > arreglo[j]){  
                                 //swap elements  
                                 temp = arreglo[j-1];  
                                 arreglo[j-1] = arreglo[j];  
                                 arreglo[j] = temp;  
                         }  
                          
                 }  
         }  
  
}
}
