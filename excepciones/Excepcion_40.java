package excepciones;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;

public class Excepcion_40 {

    public static void main(String[] args) {
        
        try {

            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            SecretKey key = keyGen.generateKey();
            
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            
            byte[] input = "Mensaje a cifrar".getBytes();
            byte[] output = new byte[10];
            
            int encryptedLength = cipher.doFinal(input, 0, input.length, output, 0);
            
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
            
            e.printStackTrace();
            
        } catch (ShortBufferException e) {
            
            System.out.println("**El error se da por qué el búfer de salida demasiado corto");
            
            e.printStackTrace();
        }
        
    }
    
}
