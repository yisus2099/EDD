/*
Nodo de lista doble
 */
package eva2_6_arbol_binario;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class Nodo {

    private int valor;
    private Nodo derecho;
    private Nodo izquierdo;

    //Default, el nuevo nodo se va al final de la vista
    //El final de la lista se indica con null
    public Nodo() {
        this.derecho = null;
        this.izquierdo = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.derecho = null;
        this.izquierdo = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }
    
    
    

}
