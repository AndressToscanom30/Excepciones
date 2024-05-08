package excepciones;

import java.security.Provider;
import java.security.Security;

public class Excepcion_28 {

    public static void main(String[] args) {
        
        try{
            
            Security.addProvider(new MySecurityProvider());
            
        } catch(RuntimeException ex){
            
            System.out.println("Se lanza cuando ocurre una condición anormal que no puede ser manejada por el código.");
            
        }
        
    }

    private static class MySecurityProvider extends Provider {

        public MySecurityProvider() {
        }
        
    }
    
}