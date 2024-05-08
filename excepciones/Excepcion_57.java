package excepciones;

public class Excepcion_57 {

    public static void main(String[] args) {
        
        Thread thread = new Thread();
        thread.start();
        
        try {
            
            thread.start();
            
        } catch (IllegalThreadStateException ex) {
            
            System.err.println("Estado ilegal del hilo");
            
            ex.printStackTrace();
        }
        
    }
    
}
