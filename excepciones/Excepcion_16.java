package excepciones;

public class Excepcion_16 {

    public static void main(String[] args) {
        
        try{
        
            Object[] array = new Integer[10];
            array[0] = "cadena";
        
        } catch(ArrayStoreException ex){
            
            System.out.println("Se lanza cuando se intenta almacenar un objeto de un tipo incompatible en un array de tipo primitivo.");
            
        }
            
    }
    
}
