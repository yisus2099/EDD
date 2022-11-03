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
    private int cont = 0;

    //POR DEFAULT LA LISTA ESTA VACIA
    public Lista() {
        this.inicio = null;//NO HAY NODOS EN LA LISTA
        this.fin = null;
        this.cont = 0;
    }

    public boolean listaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimir() {
        Nodo temp = inicio;
        while (temp != null) {
            System.out.print(temp.getValor() + " - ");
            temp = temp.getSiguiente();
            temp = temp.getSiguiente();
        }
        if (tamaLista() == 0) {
            System.out.println("La lista esta vacía");
        }

    }

    public void agregar(int valor) {
        Nodo newNodo = new Nodo(valor);

        if (inicio == null) {//No hay nodos en la lista
            inicio = newNodo;
            fin = newNodo;
        } else {
            fin.setSiguiente(newNodo);
            fin = newNodo;
        }
    }

    public int tamaLista() {
        return this.cont++;
    }

//Insertar en posisiciones no validads
    public void InsertarEn(int valor, int pos) throws Exception {
        int cantNodos = tamaLista();
        //que debemos validar
        //Insertar algo en una posicion no valida
        //Posiciones mayores a  la cantidad de elementos
        //Posiciones negativas
        if (pos < 0) {
            throw new Exception("No es posible insertar en  posiciones negativa");
        } else if (pos >= cantNodos) {
            throw new Exception(pos + "No es una posicion valida en la lista");
        } else {
            Nodo nuevoNodo = new Nodo(valor);
            cont++; //Se aumenta el contador debido a la creación del nuevo nodo 
            if (pos == 0) {//Inserta al inicio de la lista
                nuevoNodo.setSiguiente(inicio);
                inicio = nuevoNodo;

            } else { //Inserta en otra posicion 
                Nodo temp = inicio;
                while (cont < (pos - 1)) {
                    temp = temp.getSiguiente();
                    cont++;
                }
                nuevoNodo.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(nuevoNodo);
            }
        }

    }

    //Metodo para limpiar toda la lista
    public void Limpiar() {
        inicio =null;
        fin =null;
        cont=0;
    }
    
    //Eliminar segun la posicion en la lista
    public void BorrarEn(int pos) throws Exception {
        //Evaluar si la posicion para eliminar es  valida
        if ((inicio == null)) {
            throw new Exception("No es posible eliminar elementos en posiciones negativas");
             }
        else {
            //No elimianr en posiciones negativas
            if ((pos < 0)) {
                throw new Exception("No es posible eliminar elementos en posiciones negativas");
            }else if(pos > tamaLista()){
                throw new Exception("No hay un elemento en la posicon asignada");
            }
            else{
                //Posicion valida
                cont--;
               Nodo temp = inicio;
                if (pos ==s) {
                    
                }
            }
        }
        
    }
}
