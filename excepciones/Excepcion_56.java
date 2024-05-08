package excepciones;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class Excepcion_56 {

    public static void main(String[] args) throws MalformedURLException, IOException {
        
        try {
            
            HttpURLConnection connection = (HttpURLConnection) new URL("http://example.com").openConnection();
            connection.setRequestMethod("INVALID");
            
        } catch (ProtocolException e) {
            
            System.err.println("Error de protocolo HTTP");
            e.printStackTrace();
            
        }
        
    }
    
}