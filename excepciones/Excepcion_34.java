package excepciones;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;

public class Excepcion_34 {

    public static void main(String[] args) throws IOException {
        
        try{
            
            Selector selector = Selector.open();
            SelectionKey key = channel.register(selector, SelectionKey.OP_READ);
            
        } catch(UnsupportedOperationException ex){
            
            System.out.println("Se lanza para indicar que una operación no es compatible o no está implementada en la clase en la que se ha invocado.");
            
            ex.printStackTrace();
            
        }
        
    }

    private static class channel {

        private static SelectionKey register(Selector selector, int OP_READ) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public channel() {
        }
        
    }
    
}