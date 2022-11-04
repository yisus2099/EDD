package eva2_1_lista_simple;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */

/*
 Usar dos clase:
 -Clase nodo:
    Tipo de dato, referencia
 - Clase lista:
    Agregar un nuevo nodo
 Agregar un nodo al final de la lista.
 */
public class EVA2_1_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista miLista1 = new Lista();
        Lista miLista2 = new Lista();

        //Elementos de la lista
        miLista1.agregar(10);//0
        miLista1.agregar(20);//1
        miLista1.agregar(30);//2
        miLista1.agregar(40);//3
        miLista1.agregar(50);//4
        miLista1.agregar(60);//5

        miLista2.agregar(1);
        miLista2.agregar(2);
        miLista2.agregar(3);
        miLista2.agregar(4);
        miLista2.agregar(5);
        miLista2.agregar(6);
        miLista2.agregar(7);
        miLista2.agregar(8);
        miLista2.agregar(9);
        miLista2.agregar(10);
                
        System.out.println("Lista: ");
                System.out.println("Primera lista");
                miLista1.imprimir();
                System.out.println("Segunda Lista");
                miLista2.imprimir();
        


    }

}
