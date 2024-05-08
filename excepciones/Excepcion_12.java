package excepciones;

import java.util.Collections;
import java.util.List;

public class Excepcion_12 {

    public static void main(String[] args) {
        
        try{
        
            List<String> lista = Collections.emptyList();
            lista.add("elemento");
        
        } catch(UnsupportedOperationException ex){
            
            System.out.println("Se lanza cuando se invoca una operación que no es compatible o no está implementada en una clase específica.");
            
        }
        
    }
    
}
