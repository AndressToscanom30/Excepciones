package excepciones;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Excepcion_18 {

    public static void main(String[] args) {
     
        try{
            
            String fecha = "2022-13-01";
            LocalDate.parse(fecha);
            
        } catch(DateTimeParseException ex){
            
            System.out.println("Se lanza cuando ocurre un error al analizar una cadena en un objeto de fecha y hora utilizando la API de fecha y hora de Java (java.time).");
            
        }
        
        
    }
    
}
