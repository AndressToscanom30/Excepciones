package excepciones;

public class Excepcion_27 {

    public static void main(String[] args) {
        
        try{
            
            try{
        
            Object objeto = new Object();
            objeto.wait();
        
            } catch(InterruptedException ex){

                System.out.println("No entrará aquí");

            } 
            
        } catch(IllegalMonitorStateException ex){
            
            System.out.println("**Se lanza cuando se realiza una operación de monitoreo ilegal, como esperar o notificar en un objeto sin poseer el bloqueo adecuado.");
            
            ex.printStackTrace();
            
        }
            
    }
    
}
