package excepciones;

import java.util.UnknownFormatConversionException;

public class Excepcion_29 {

    public static void main(String[] args){
        
        try{
            
            String mensaje = String.format("%3 %4", "cadena", 123);
            
        } catch(UnknownFormatConversionException ex){
            
            System.out.println("Se produce cuando se proporciona una conversión desconocida.");
            
            ex.printStackTrace();
            
        }
        
        
        
    }
    
}
