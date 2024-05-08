package excepciones;

import java.security.cert.CertificateException;

public class Excepcion_46 {

    public static void main(String[] args) {
        
        try {
            
            throw new CertificateException("Excepción relacionada con el certificado");
            
        } catch (CertificateException ex) {
            
            ex.printStackTrace();
                    
        }
        
    }
    
}