package excepciones;

import java.nio.file.ProviderNotFoundException;
import java.security.Provider.Service;
import java.util.ServiceLoader;

public class Excepcion_32 {

    public static void main(String[] args) {
        
        try{
            
            Service service = ServiceLoader.load(Service.class).findFirst().orElseThrow(() -> new ProviderNotFoundException("Proveedor no encontrado"));
            
        } catch(ProviderNotFoundException ex){
            
            System.out.println("Se lanza cuando no se puede encontrar un proveedor de servicios específico.");
            
            ex.printStackTrace();
            
        }
        
    }
    
}
