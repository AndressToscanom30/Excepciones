package excepciones;

import com.sun.tools.attach.AttachNotSupportedException;

public class Excepcion_47 {

    public static void main(String[] args) {
        try {
           
            attachToVM();
            
        } catch (AttachNotSupportedException ex) {
            
            System.out.println("Error al intentar adjuntar a la VM: ");
        
            ex.printStackTrace();
            
        }
        
    }

    public static void attachToVM() throws AttachNotSupportedException {
        
        throw new AttachNotSupportedException("Adjuntar a la VM no esta soportado.");
    
    }
    
}
