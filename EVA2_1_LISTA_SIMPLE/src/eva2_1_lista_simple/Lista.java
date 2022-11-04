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
        this.cont=0;//No hay nodos en la lista
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
            System.out.print("Lista vacía -");
        } else {
            Nodo temp = inicio;
            //Mover temp hasta que llegue al nodo final
            while (temp != null) {
                System.out.println(" [" + temp.getValor() + "] ");
               temp = temp.getSiguiente(); //Final de la lista
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

    public int tamaLista() {
        return this.cont;
    }

//Insertar en posisiciones no validads
    public void InsertarEn(int valor, int pos) throws Exception {
        
        if (pos < 0) {
            throw new Exception("No es posible insertar en  posiciones negativa");
        } else if (pos >= tamaLista()) {
            throw new Exception(pos + "No es una posicion valida en la lista");
        } else {
            Nodo newNodo = new Nodo(valor);
              //Se aumenta el contador debido a la creacion del nuevo nodo
            if (pos == 0) {//Inserta al inicio de la lista
                newNodo.setSiguiente(inicio);
                inicio = newNodo;

            } else { //Inserta en otra posicion 
                Nodo temp = inicio;
                int cont = 0;
                
                //Mover temp por cada nodo hasta llegar al nodo deseado
                while (cont < (pos - 1)) {
                    temp = temp.getSiguiente();
                    cont++;
                }
                //Conectar el nuevo nodo a la lista
                newNodo.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(newNodo);
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
        int valorNodos = tamaLista();
        int cont = 0;
        Nodo temp = inicio;

        if (pos < 0) { //Posicion negativa
            throw new Exception("No se pueden eliminar nodos de porsiciones negativas");
        } else if (pos >= valorNodos) {//Posciones mas altas que las que tenemos
            throw new Exception("Esa posicion no es válida en la lista");
        } else {
            if (valorNodos == 1) {
                Limpiar();
            } else {
                if (pos == 0) {
                    inicio = inicio.getSiguiente();
                } else {
                    //Mover temp por cada nodo hasta llegar al que queremos
                    while (cont < (pos - 1)) {
                        temp = temp.getSiguiente();
                        cont++;
                    }
                    Nodo objNext = temp.getSiguiente();
                    temp.setSiguiente(objNext.getSiguiente());

                    if (pos == (valorNodos - 1)) {//Cantodad de los nodos menos el que desconectamos
                        fin = temp; //Reconectar a fin
                    }
                }
            }
            this.cont--;
        }

    }

    public int getValueAt(int pos) throws Exception {

        int valueNodes = tamaLista();
        int cont = 0, valor = 0;
        Nodo temp = inicio;
        if (pos < 0) {
            throw new Exception("No se pueden agregar ndos a posiciones negativas");
        } else if (pos >= valueNodes) { //Posiciones mayores a la cantidad de elementos
            throw new Exception("Esta posicion no es valida");
        } else {
            //Mover temp hasata llegar al nodo deseado
            while (cont < pos) {
                temp = temp.getSiguiente();
                cont++;
            }
            valor = temp.getValor();
            System.out.println("El valor de la posición " + pos + " es: " + valor);
        }
        return valor;

    }
}
