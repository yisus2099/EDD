package eva2_3_lista_doble;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class ListaDoble {
       private Nodo inicio;
    private Nodo fin;
    private int cont;

    public ListaDoble(Nodo inicio, Nodo siguiente, int cont) {
        this.inicio = null;
        this.fin = null;
        this.cont = 0;
    }
    
    
public void 
    //Agregar Nodo
    if(pos == 0){ //Insertar al inicio de la lista
    nuevoNodo.setSiguiente(inicio);
    inicio = nuevoNodo;
}
    else{
    Nodo temp = inicio;
    int cont = 0;
    while(cont < pos ) {
        temp = temp.getSiguiente();
        cont ++;
    }
    
    nuevoNodo.setSiguiente(temp);
    nuevoNodo.setPrevio(temp.getPrevio());
    temp.getPrevio().setSiguiente(nuevoNodo);
    temp.setPrevio(nuevoNodo);
     
}
this.cont++;
    

    
    
}

