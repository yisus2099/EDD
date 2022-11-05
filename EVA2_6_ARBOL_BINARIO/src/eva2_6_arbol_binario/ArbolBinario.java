package eva2_6_arbol_binario;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class ArbolBinario {

    private Nodo root;

    public ArbolBinario() {
        this.root = null;
    }

    public void Agregar(int valor) {
        if (root == null) {
            root = new Nodo(valor);
        } else {
            AgregarRecur(valor, root);
        }
    }

    public void AgregarRecur(int valor, Nodo nodoActual) {
        Nodo nuevo = new Nodo(valor);
        if (valor < nodoActual.getValor()) {
            if (nodoActual.getIzquierdo() == null) {
                nodoActual.setIzquierdo(nuevo);
            } else {
                AgregarRecur(valor, nodoActual.getIzquierdo());
            }
        } else if (valor > nodoActual.getValor()) {
            if (nodoActual.getDerecho() == null) {
                nodoActual.setDerecho(nuevo);
            } else {
                AgregarRecur(valor, nodoActual.getDerecho());
            }
        } else {
            System.out.println("ELEMENTO REPETIDO");
        }
    }
}
