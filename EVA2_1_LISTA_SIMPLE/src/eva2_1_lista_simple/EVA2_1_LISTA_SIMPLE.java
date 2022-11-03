package eva2_1_lista_simple;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA2_1_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista miLista = new Lista();
        miLista.agregar(10);//0
        miLista.agregar(20);//1
        miLista.agregar(30);//2
        miLista.agregar(40);//3
        miLista.agregar(50);//4
        miLista.agregar(60);//5
        System.out.println("Cantidad de nodos:  " + miLista.tamaLista());
        miLista.imprimir();
        try {
            miLista.InsertarEn(70, 3);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
