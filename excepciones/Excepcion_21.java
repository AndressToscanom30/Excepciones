package excepciones;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Excepcion_21 {

    public static void main(String[] args) {
        
        try{
            
            LocalDate.of(2022, 2, 29);
            
        } catch(DateTimeException ex){
            
            System.out.println("Se lanza cuando ocurre un error relacionado con la manipulación de objetos de fecha y hora utilizando la API de fecha y hora de Java (java.time).");
            
        }
        
        
        
    }
    
}
