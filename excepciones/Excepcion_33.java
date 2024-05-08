package excepciones;

import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

public class Excepcion_33 {

    public static void main(String[] args) {
        
        try{
            
            ByteBuffer buffer = ByteBuffer.allocate(10).asReadOnlyBuffer();
            buffer.put((byte) 1);
            
        } catch(ReadOnlyBufferException ex){
            
            System.out.println("Se lanza cuando se intenta modificar un búfer de solo lectura.");
            
            ex.printStackTrace();
            
        }
        
        
        
    }
    
}
