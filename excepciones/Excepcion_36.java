package excepciones;

import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;

public class Excepcion_36 {

    public static void main(String[] args) {
        
        try{
            
            Charset charset = Charset.forName("conjunto_de_caracteres_inválido");
            
        } catch(IllegalCharsetNameException ex){
            
            System.out.println("Se lanza cuando se proporciona un nombre de conjunto de caracteres no válido.");
            
            ex.printStackTrace();
            
        }
        
        
        
    }
    
}
