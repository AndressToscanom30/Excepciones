package excepciones;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Excepcion_50 {

    public static void main(String[] args) {
        
        String dateString = "2022-30-30";
        
        try {

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false); // Hacer que el análisis sea estricto
            dateFormat.parse(dateString);
            System.out.println("La cadena es una fecha válida.");
            
        } catch (ParseException e) {
            // Capturar la excepción ParseException si la cadena no es una fecha válida
            System.err.println("Error al analizar la cadena como fecha: " + e.getMessage());
            e.printStackTrace();
        }
        
    }
    
}
