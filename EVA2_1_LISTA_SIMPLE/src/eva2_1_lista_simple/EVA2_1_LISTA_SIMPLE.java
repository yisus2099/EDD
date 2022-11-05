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
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Lista miLista1 = new Lista();

        //Elementos de la lista
        miLista1.agregar(10);//0
        miLista1.agregar(20);//1
        miLista1.agregar(30);//2
        miLista1.agregar(40);//3
        miLista1.agregar(50);//4
        miLista1.agregar(60);//5

        System.out.println("Lista: ");
        System.out.println("Primera lista");
        miLista1.imprimir();
        miLista1.tamaLista();
     

        /*
         // Agregamos grandes cantidades de datos
         for (int i = 0; i < 100; i++) { // O(N2)
         miLista1.agregar(i);
         } 
         */
       

        try {
            miLista1.InsertarEn(89, 0);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Lista: ");
        System.out.println("Primera lista");
        miLista1.imprimir();

        try {
            miLista1.BorrarEn(5);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("------");
        System.out.println("Lista: ");
        System.out.println("Primera lista");
        miLista1.imprimir();
    }

}
