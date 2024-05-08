package excepciones;

import javax.transaction.xa.XAException;

public class Excepcion_43 {

    public static void main(String[] args) {
        
        try {

            simulateDistributedTransaction();
            
        } catch (XAException e) {

            System.err.println("Es arrojando durante la transaccion distribuida: ");
            
            e.printStackTrace();
            
        }
        
    }

    public static void simulateDistributedTransaction() throws XAException {
        
        throw new XAException("Error en el recurso de transaccion participante");
    
    }
    
}
