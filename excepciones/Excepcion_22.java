package excepciones;

public class Excepcion_22 {

    public static void main(String[] args) {
        
        try{
            
            int[] array = new int[-5];
            
        } catch(NegativeArraySizeException ex){
            
            System.out.println("Se lanza cuando se intenta crear un array con un tamaño negativo.");
            
        }
        
    }
    
}
