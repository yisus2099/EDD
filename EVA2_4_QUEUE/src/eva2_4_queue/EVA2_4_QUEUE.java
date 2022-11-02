
package eva2_4_queue;

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
        myQueue.agregar(10); //Primero en ser atendido
        myQueue.agregar(20);
        myQueue.agregar(30);
        myQueue.agregar(40);
        myQueue.agregar(50); //Ultimo en llegar, ultimo en ser atendido
        System.out.println("Primer Valor ene llegar es:  " + myQueue.peek());
        myQueue.imprimir();
        
        System.out.println("Primer Valor ene llegar es:  " + myQueue.peek());
        myQueue.imprimir();

    }

}
