package excepciones;

public class Excepcion_19 {

    public static void main(String[] args) {
        
        try {
            
            metodoCiclado();
            
        } catch (StackOverflowError ex) {
            
            System.err.println("Esto pasa cuando se ha producido un desbordamiento de pila (StackOverflowError):");
            ex.printStackTrace();
        
        }
        
    }
    
    public static void metodoCiclado() {
        
        metodoCiclado();
        
    }
    
}
