package excepciones;

import java.util.IllegalFormatFlagsException;

public class Excepcion_30 {

    public static void main(String[] args) {
        
        try{
            
            String mensaje = String.format("% %", "cadena", 123);
            
        } catch(IllegalFormatFlagsException ex){
            
            System.out.println("**Se lanza cuando ocurre un error durante la conversión de un argumento en una cadena de formato.**");
            
            ex.printStackTrace();
            
        }
        
        
        
    }
    
}
