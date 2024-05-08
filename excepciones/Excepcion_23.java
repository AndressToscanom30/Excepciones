package excepciones;

import java.lang.reflect.Field;

public class Excepcion_23 {

    public static void main(String[] args) throws NoSuchFieldException {
        
        try{
            
            Class<?> clase = String.class;
            Field campo = clase.getField("campoInexistente");
            
        } catch(NoSuchFieldException ex){
            
            System.out.println("Se lanza cuando se intenta acceder a un campo que no existe en una clase.");
            
        }
        
        
        
    }
    
}
