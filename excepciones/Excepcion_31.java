package excepciones;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.MalformedInputException;

public class Excepcion_31 {

    public static void main(String[] args) throws CharacterCodingException {
        
        try{
            
            CharsetDecoder decoder = Charset.forName("UTF-8").newDecoder();
            CharBuffer buffer = decoder.decode(ByteBuffer.wrap(new byte[] { (byte) 0xFF }));
            
        } catch(MalformedInputException ex){
            
            System.out.println("Se lanza cuando ocurre un error durante la decodificación de caracteres debido a una entrada de datos mal formada.");
            
            ex.printStackTrace();
            
        }
        
    }
    
}
