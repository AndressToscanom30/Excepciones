package excepciones;

import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;

public class Excepcion_48 {

    public static void main(String[] args) {
        
        try {
            
            validarCertificado();
            
        } catch (CertificateExpiredException e) {
            
            System.out.println("Error: El certificado ha expirado.");
            
            e.printStackTrace();
            
        } catch (CertificateNotYetValidException e) {
            
            System.out.println("Error: El certificado aún no es valido.");
            
            e.printStackTrace();
            
        } catch (CertificateEncodingException e) {
            
            System.out.println("Error: Error de codificación del certificado.");
            
            e.printStackTrace();
            
        } catch (CertificateParsingException e) {
            
            System.out.println("Error: Error al analizar el certificado.");
            
            e.printStackTrace();
            
        } catch (CertificateException e) {
            
            
            System.out.println("Error: Ocurrio un problema con el certificado.");
            e.printStackTrace();
            
        }
        
    }

    public static void validarCertificado() throws CertificateException {
        
        int tipoDeError = (int) (Math.random() * 4);
        
        switch (tipoDeError) {
            
            case 0:
                throw new CertificateExpiredException("El certificado ha expirado.");
                
            case 1:
                throw new CertificateNotYetValidException("El certificado aun no es valido.");
                
            case 2:
                throw new CertificateEncodingException("Error de codificacion del certificado.");
                
            case 3:
                throw new CertificateParsingException("Error al analizar el certificado.");
                
            default:
                throw new CertificateException("Ocurrio un problema con el certificado.");
                
        }
        
    }
    
}