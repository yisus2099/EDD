package eva2_3_lista_doble;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA2_3_LISTA_DOBLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaDoble ListaDoble = new ListaDoble();
        ListaDoble.Agregar(10);
         ListaDoble.Agregar(20);
          ListaDoble.Agregar(30);
           ListaDoble.Agregar(40);
           ListaDoble.imprimir();
          
 try {
            ListaDoble.InsertarEn(35, 0);
        } catch (Exception ex) {
            Logger.getLogger(EVA2_3_LISTA_DOBLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        ListaDoble.imprimir();
        
        try {
            ListaDoble.BorrarEn(3);
        } catch (Exception ex) {
            Logger.getLogger(EVA2_3_LISTA_DOBLE.class.getName()).log(Level.SEVERE, null, ex);
        }
         ListaDoble.imprimir();
    }
}
