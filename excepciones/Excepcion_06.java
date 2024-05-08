package excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Excepcion_06 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        BufferedReader reader = null;
        
        try {
            
            reader = new BufferedReader(new FileReader("mi_archivo.txt"));
            
            String linea = reader.readLine();
            System.out.println("Primera línea: " + linea);
            
            reader.close();
            
        } catch (IOException ex) {
            
            System.out.println("Error al cerrar el archivo: " + ex.getMessage());
            
        }
        
    }
    
}