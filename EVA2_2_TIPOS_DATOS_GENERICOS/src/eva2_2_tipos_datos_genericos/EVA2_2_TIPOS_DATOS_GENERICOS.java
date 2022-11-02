
package eva2_2_tipos_datos_genericos;

import java.util.LinkedList;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA2_2_TIPOS_DATOS_GENERICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Tipos de Datos genéricos
        LinkedList <Integer> miLista = new LinkedList <Integer>();
       // miLista.
      TiposDatosGenericos <Integer> miObj = new TiposDatosGenericos<Integer>();
      miObj.setValor(100);
        System.out.println(miObj.getValor());
    }
    
}

class TiposDatosGenericos <T> {
    private  T valor;

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    
    
}