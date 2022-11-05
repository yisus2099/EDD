
package eva2_5_stack;



/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA2_5_STACK {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStack myStack = new MyStack();
        
        myStack.Push(10);
        myStack.Push(20);
        myStack.Push(30);
        myStack.Push(40);
        
        myStack.imprimir();
        System.out.println("Cima de la pila: " + myStack.Peek());
        
        try{
            System.out.println("Borrado del ultimo nodo: " + myStack.Pop());
        } catch(Exception ex){
            ex.printStackTrace();
        }
        myStack.imprimir();
    }
}
