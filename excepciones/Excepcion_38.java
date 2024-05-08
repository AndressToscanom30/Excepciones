package excepciones;

import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Excepcion_38 {

    public static void main(String[] args) {
        
        try{
            
            Path path = Paths.get("///damfoeforf");
            
        } catch(InvalidPathException ex){
            
            System.out.println("Se lanza cuando se proporciona una cadena de ruta de acceso inválida a los métodos de la clase Path.");
            
            ex.printStackTrace();
            
        }
        
    }
    
}
