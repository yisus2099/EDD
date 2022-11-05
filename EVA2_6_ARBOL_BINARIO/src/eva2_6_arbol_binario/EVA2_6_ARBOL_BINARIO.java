
package eva2_6_arbol_binario;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA2_6_ARBOL_BINARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBinario arbol = new ArbolBinario();
        
        arbol.Agregar(13);
        arbol.Agregar(10);
        arbol.Agregar(18);
        arbol.Agregar(2);
        arbol.Agregar(11);
        arbol.Agregar(17);
        arbol.Agregar(20);
        arbol.Agregar(16);
        arbol.Agregar(16);
        
        arbol.inOrder();
        arbol.preOrder();
        arbol.postOrder();
        
    }
    
}
