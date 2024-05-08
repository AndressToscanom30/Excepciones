package excepciones;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

public class Excepcion_20 {

    public static void main(String[] args) {
        
        try{
            
            Charset charset = Charset.forName("UTF-16LA");
            
        } catch(UnsupportedCharsetException ex){
            
            System.out.println("Se lanza cuando se intenta utilizar un conjunto de caracteres (charset) no soportado por el sistema.");
            
        }
        
    }
    
}
