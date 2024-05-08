package excepciones;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Excepcion_39 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        
        
        try{
            
            MessageDigest digest = MessageDigest.getInstance("algoritmo_inexistente");
            
        } catch(NoSuchAlgorithmException ex){
            
            System.out.println("Se lanza cuando se solicita un algoritmo criptográfico que no está disponible en el entorno en ejecución.");
            
            ex.printStackTrace();
            
        }
        
        
        
    }
    
}
