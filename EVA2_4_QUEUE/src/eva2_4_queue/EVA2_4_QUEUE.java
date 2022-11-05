package eva2_4_queue;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA2_4_QUEUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyQueue myQueue = new MyQueue();

        myQueue.Agregar(10); //Primero en ser atendido
        myQueue.Agregar(20);
        myQueue.Agregar(30);
        myQueue.Agregar(40); //Ultimo en llegar, ultimo en ser atendido

        myQueue.imprimir();
        System.out.println("Primer Valor en llegar es: " + myQueue.peek());

        try {
            System.out.println("El primer nodo en ser eliminado es: " + myQueue.poll());
        } catch (Exception ex) {
            Logger.getLogger(EVA2_4_QUEUE.class.getName()).log(Level.SEVERE, null, ex);
        }
        myQueue.imprimir();
    }
}
