package excepciones;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Excepcion_51_1 {

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException {
        
        try{
            
            try {
                Method method = SomeClass.class.getDeclaredMethod("someMethod");
                method.invoke(new SomeClass()); // Método invocado que lanza una excepción
            } catch (InvocationTargetException e) {
                System.err.println("Error: Excepción lanzada por el método invocado");
                e.printStackTrace();
            }
            
        } catch(NoSuchMethodException ex){
            
            System.out.println("Erro al mostrar mal la excepción:");
            
            ex.printStackTrace();
            
        }
        
    }

    private static class SomeClass {

        public SomeClass() {
        }
    }
    
}
