package eva2_3_lista_doble;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class ListaDoble {

    private Nodo inicio;
    private Nodo fin;
    private int cont;

    public ListaDoble() {
        this.inicio = null;
        this.fin = null;
        this.cont = 0;
    }

//Lista esta vacía
    public boolean listaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimir() {
        if (listaVacia()) {
            System.out.print("Lista vacía ");
        } else {
            Nodo temp = inicio;
            //Mover temp hasta que llegue al nodo final
            while (temp != null) {
                System.out.print(temp.getValor() + " - ");
                temp = temp.getSiguiente();
            }
        }
        System.out.println("");
    }

    public int tamaLista() {
        return this.cont;
    }

    public void Limpiar() {
        inicio = null;
        fin = null;
        cont = 0;
    }

    public void Agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);

        //Verificar si hay nodos en la lista
        if (inicio == null) {//no hay nodos en la lista
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            //Hay nodos en la lista
            // Nos movemos por la lista con temp
            // Hata el ultimo nodo
            fin.setSiguiente(nuevoNodo);
            nuevoNodo.setPrevio(fin);
            fin = nuevoNodo;
        }
        cont++;
    }
}
