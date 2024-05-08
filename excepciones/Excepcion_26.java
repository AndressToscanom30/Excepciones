package excepciones;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Excepcion_26 {

    public static void main(String[] args) {
        
        try{
            
            ResourceBundle bundle = ResourceBundle.getBundle("missing_resource");
            String value = bundle.getString("missing_key");
            
        } catch(MissingResourceException ex){
            
            System.out.println("**Se lanza cuando no se encuentra un recurso solicitado, como un archivo de propiedades o una clave en un archivo de propiedades.");
            
            ex.printStackTrace();
            
        }
        
    }
    
}
