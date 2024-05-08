package excepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Excepcion_05 {

    public static void main(String[] args) throws FileNotFoundException {
        
        try{
            
            FileInputStream fis = new FileInputStream("archivo.txt");
            
        }catch(FileNotFoundException ex){
            
            System.out.println("Se lanza cuando se intenta abrir un archivo que no existe.");
            
        }
            
        
    }
    
}
