package excepciones;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Excepcion_10 {

    public static void main(String[] args) {
        
        
        try{
            
            List<String> lista = new ArrayList<>();
            String elemento = lista.iterator().next();
        
        } catch(NoSuchElementException ex){
            
            System.out.println("Se lanza cuando se intenta acceder a un elemento que no existe en una colección, como una lista vacía o un conjunto sin el elemento especificado.");
            
        }
        
    }
    
}