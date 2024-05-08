package excepciones;

public class Excepcion_08 {

    public static void main(String[] args) {
        
        try{
            
            int edad = -5;
        
            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa");
            }
        
            
        } catch(IllegalArgumentException ex){
            
            System.out.println("Se lanza cuando se pasa un argumento ilegal o inapropiado a un método.");
            
        }
        
        
    }
    
}
