package excepciones;

import java.net.MalformedURLException;
import java.net.URL;

public class Excepcion_49 {

    public static void main(String[] args) {
        
        try {
            URL url = new URL("htp://example.com"); // Error de sintaxis en la URL
        } catch (MalformedURLException e) {
            System.err.println("URL malformada");
            e.printStackTrace();
        }
        
    }
    
}
