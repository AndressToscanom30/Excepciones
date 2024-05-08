package excepciones;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class Excepcion_25 {

    public static void main(String[] args) {
        
        try{
            
            List<String> lista = new ArrayList<>();
            lista.add("A");
            for (String elemento : lista) {
                lista.remove(elemento);
            }
            
        } catch(ConcurrentModificationException ex){
            
            System.out.println("Se lanza cuando se detecta una modificación concurrente durante la iteración de una colección utilizando iteradores \"fall-fast\".");
            
        }
        
        
        
    }
    
}
