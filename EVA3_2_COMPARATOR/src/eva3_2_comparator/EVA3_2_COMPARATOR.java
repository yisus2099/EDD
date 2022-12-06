
package eva3_2_comparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA3_2_COMPARATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     // Lista
        LinkedList <Integer> list = new <Integer> LinkedList();        
        list.add((int)(Math.random() * 100));
        list.add((int)(Math.random() * 100));
        list.add((int)(Math.random() * 100));
        list.add((int)(Math.random() * 100));
        list.add((int)(Math.random() * 100));
        list.add((int)(Math.random() * 100));
        
        System.out.println("Lista: ");
        System.out.println(list);
        
        // Si se quiere ordenar, debe haber un criterio.
        // Para ordenar, debemos utilizar un comparador.
        
        // Ordenar -> Comparator
        // Comparator es una interfaz.        
        Comparator ordenar = new Comparator() { // Clase anónima: Clase que no tiene que ser instanciada.
            @Override
            public int compare(Object o1, Object o2) {
                Integer val1 = (Integer)o1;
                Integer val2 = (Integer)o2;
                
                return val1 - val2;
            }
        };
        
        // Mandamos el comparator recién creado arriba
        list.sort(ordenar);
        
        // Imprimimos la lista
        System.out.println("\nLista ordenada: ");
        System.out.println(list);
        System.out.println();
        

        // Lista que va a almacenar personas
        LinkedList <Persona> personList = new <Persona> LinkedList();
        personList.add(new Persona("Juan", "Pérez", "Rojas", 14, 700));
        personList.add(new Persona ("Pedro", "Corral", "Rivas", 14, 475.50));
        personList.add(new Persona ("Carlos", "Rojas", "Cruz", 14, 650));
        personList.add(new Persona ("Daniel", "Morales", "Pérez", 21, 1050));
        personList.add(new Persona ("Kevin", "González", "Peinado", 18, 350));
        
        System.out.println(personList);
        
        // Comparar apellido paterno.                              
        Comparator pLastName = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String val1 = o1.toString();
                String val2 = o2.toString();
                
                return val1.compareTo(val2);
            }
        };
        
        personList.sort(pLastName);        
        System.out.println(personList);
        
        
        // Comparar apellido materno.                              
        Comparator mLastName = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String val1 = o1.toString();
                String val2 = o2.toString();
                
                return val1.compareTo(val2);
            }
        };
        
        personList.sort(mLastName);        
        System.out.println(personList);
        
        // Como recorrer collections
        // iterator              
        for (Iterator <Persona> iterator = personList.iterator();
            iterator.hasNext();) {
            // Person person = iterador();
        }
        
    }    
}

class Persona {
    private String nombre, paterno, materno;
    private int edad;
    private double salario;    

    public Persona(String nombre, String paterno, String materno, int edad, double salario) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.salario = salario;
    }        
}