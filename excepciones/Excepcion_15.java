package excepciones;

public class Excepcion_15 {

    public static void main(String[] args) {
        
        System.out.println("Antes de la espera de 2 segundos...");
        
        try {
            
            Thread.currentThread().interrupt();
            
            Thread.sleep(2000);
            
            System.out.println("Después de esperar 2 segundos.");
            
        } catch (InterruptedException e){
            
            System.err.println("Se ha producido un error: " + e.getMessage());
            e.printStackTrace();
            
        }
        
        System.out.println("Fin del programa.");
        
    }
    
}