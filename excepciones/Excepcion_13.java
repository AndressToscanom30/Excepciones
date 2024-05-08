package excepciones;

public class Excepcion_13 {

    public static void main(String[] args) {
        
        try{
            
            Object obj = "cadena";
            Integer num = (Integer) obj;
            
        } catch(ClassCastException ex){
            
            System.out.println("Se lanza cuando se intenta convertir un objeto a un tipo incompatible mediante una operación de casting.");
            
            ex.printStackTrace();
            
        }
            
        
    }
    
}
