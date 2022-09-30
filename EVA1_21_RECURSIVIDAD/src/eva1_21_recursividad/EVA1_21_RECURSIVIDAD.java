package eva1_21_recursividad;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class EVA1_21_RECURSIVIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Main " + A());
    }
    public static String A() {
        return "A " + B();
    }
    public static String B(){
        return "B " + C();
    }
    public static  String C(){
        return "C";
    }
}
