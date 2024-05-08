package excepciones;

public class Excepcion_24 {

    public static void main(String[] args) {
        
        try{
            
            Thread thread = new Thread();
            thread.start();
            thread.start();
            
        } catch(IllegalThreadStateException ex){
            
            System.out.println("Se lanza cuando se realiza una operación inválida en un hilo, como iniciar un hilo que ya ha sido iniciado.");
            
        }
        
    }
    
}
