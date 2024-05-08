package excepciones;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Excepcion_37 {

    public static void main(String[] args) throws IOException {
        
        try{
            
            Socket socket = new Socket("host_inexistente", 8080);
            
        } catch(UnknownHostException ex){
            
            System.out.println("Se lanza cuando se intenta acceder a un host cuyo nombre no se puede resolver.");
            
            ex.printStackTrace();
            
        }
        
    }
    
}
