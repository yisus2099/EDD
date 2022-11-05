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

    public void inOrder() {
        inOrderRecu(root);
        System.out.println("");
    }

    private void inOrderRecu(Nodo nodo) {
        if (nodo != null) {
            inOrderRecu(nodo.getIzquierdo());
            System.out.print(nodo.getValor() + " - ");
            inOrderRecu(nodo.getDerecho());
        }
    }

    public void preOrder() {
        preOrderRecu(root);
        System.out.println("");
    }

    private void preOrderRecu(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.getValor() + " - ");
            preOrderRecu(nodo.getIzquierdo());
            preOrderRecu(nodo.getDerecho());
        }
    }

    public void postOrder() {
        postOrderRecu(root);
        System.out.println("");
    }

    private void postOrderRecu(Nodo nodo) {
        if (nodo != null) {
            postOrderRecu(nodo.getIzquierdo());
            postOrderRecu(nodo.getDerecho());
            System.out.print(nodo.getValor() + " - ");
        }
    }

}
