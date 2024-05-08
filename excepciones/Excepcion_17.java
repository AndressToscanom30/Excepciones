package excepciones;

import java.io.IOException;
import java.lang.reflect.Method;

public class Excepcion_17 {

    public static void main(String[] args) throws IOException {
        
        try{
        
            Class<?> clase = String.class;
            Method metodo = clase.getMethod("metodoInexistente");
        
        } catch(NoSuchMethodException ex){
            
            System.out.println("Se lanza cuando intentas acceder a un método que no existe en una clase.");
            
        }    
    }
    
}
