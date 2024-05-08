package excepciones;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Excepcion_54 {

    public static void main(String[] args) {
        
        try{
            
            try {
            
                Type type = new ParameterizedType() {
                    // Implementación de ParameterizedType con parámetro de tipo mal formado
                };
            } catch (MalformedParameterizedTypeException e) {
                System.err.println("Error");
            }
            
        } catch(ExceptionInInitializerError ex){
            
            System.out.println("**Se lanza cuando un parámetro de tipo parametrizado no está bien formado.");
            
            ex.printStackTrace();
            
        }
        
    }
    
}
