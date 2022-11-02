package eva2_4_queue;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class MyQueue {
    private Nodo inicio;
    private Nodo fin;
    
    //lee, pero no borra el primer nodo de la lista
    public  Integer peek() {
        //Verificar si la list esta vacía
        //Si no esta vacía, regresar valor
        
        if(listaVacia()) {
            return null;
        }
        else{
            return inicio.getValor();
        }
    } 
    
        public  Integer poll() throws Exception{
        //Verificar si la list esta vacía
        //Si no esta vacía, regresar valor
        
        if(listaVacia()) {
            return null;
        }
        else{
            int valor = inicio.getValor();
            //borrar el nodo
            borrarEn(0):
            return inicio.getValor();
        }
    } 
    
}
