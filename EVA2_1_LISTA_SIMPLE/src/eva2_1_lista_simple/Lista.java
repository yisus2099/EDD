/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_lista_simple;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class Lista {

    private Nodo inicio;
    private Nodo fin;
    private int cont;

     public Lista() {
        this.inicio = null;//No hay nodos en la lista
        this.fin = null;
        this.cont = 0;//No hay nodos en la lista
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

    //Método para agregar nodos
    public void agregar(int valor) {
        Nodo newNodo = new Nodo(valor);

        if (inicio == null) {//No hay nodos en la lista
            inicio = newNodo;
            fin = newNodo;
        } else {
            /*
           Tenemos que movernos por cada nodo hasta
           llegar al final de la lista (último nodo)                 
            Nodo temp = front;
            
           Mover a temp por cada nodo hasta llegar al final
            while(temp.getNext() != null) {
                temp = temp.getNext(); // Final de la lista
                    }
            Agregar un nuevo nodo al final de la lista
            temp.setNext(newNode); */

            fin.setSiguiente(newNodo);
            fin = newNodo;
        }
        cont++;
    }

public int tamaLista(){
    return this.cont;
}
//Insertar en posisiciones no validads
    public void InsertarEn(int valor, int pos) throws Exception {
        int cantNodos = tamaLista();

        //que debemos valorar
        //insertar una posicion no valida
        //posiciones negativas 
        //posiciones mayores a la cantidad de elementos
        if (pos < 0)// posiciones negativas
        {
            throw new Exception("No puede insertarse un nodo en una posicion negativa");
        } else if (pos >= cantNodos)//posiciones mayores a la cantidad  de elementos
        {
            throw new Exception(pos + " No es una possicion valida en la lista");
        } else {
            Nodo nuevoNodo = new Nodo(valor);
            if (pos == 0) {//insertar al inicio de la lista
                nuevoNodo.setSiguiente(inicio);
                inicio = nuevoNodo;
            } else {// insertar un nodo en una posicion
                Nodo temp = inicio;
                int cont = 0;
                while (cont < (pos - 1)) {

                    temp = temp.getSiguiente();
                    cont++;

                }
                // y ahora??
                nuevoNodo.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(nuevoNodo);

            }
            this.cont++;
        }
    }

    //Metodo para limpiar toda la lista
    public void Limpiar() {
        inicio = null;
        fin = null;
        cont = 0;
    }

    //Eliminar segun la posicion en la lista
    public void BorrarEn(int pos) throws Exception {
        int cantNodos = tamaLista();
        if (pos < 0)// posiciones negativas
        {
            throw new Exception("No se pueden eliminar nodos de porsiciones negativas");
        } else if (pos >= cantNodos)//posiciones mayores a la cantidad  de elementos
        {
            throw new Exception("Esa posicion no es válida en la lista");
        } else {

            if (cantNodos == 1) {
                Limpiar();
            } else {
                //Borrar el primer nodi
                //borrar nodo intermedio
                //borrar el ultimo nodo
                if (pos == 0) {
                    inicio = inicio.getSiguiente();
                } else {
                    Nodo temp = inicio;
                    int cont = 0;
                    while (cont < (pos - 1)) {
                        temp = temp.getSiguiente();
                        cont++;
                    }
                    Nodo objSig = temp.getSiguiente();
                    temp.setSiguiente(objSig.getSiguiente());
                    if (pos == (cantNodos - 1)) {
                        fin = temp;
                    }
                }
                this.cont--;
            }
        }
    }

    public int getValueAt(int pos) throws Exception {

        int cantNodos = tamaLista();
        int Valor = 0;
        if (pos < 0)// posiciones negativas
        {
            throw new Exception("No puede insertarse un nodo en una posicion negativa");
        } else if (pos >= cantNodos)//posiciones mayores a la cantidad  de elementos
        {
            throw new Exception(pos + " no es una possicion valida en la lista");
        } else {
            Nodo temp = inicio;
            int cont = 0;
            while (cont < (pos)) {
                temp = temp.getSiguiente();
                cont++;

            }
            Valor = temp.getValor();

        }
        return Valor;
    }
   
}
