package excepciones;

public class Excepcion_14 {

    public static void main(String[] args) {
        
        
        try{
            
            String str = "Hola";
            char caracter = str.charAt(10);
            
        } catch(StringIndexOutOfBoundsException ex){
            
            System.out.println("Se lanza cuando se intenta acceder a un índice fuera del rango válido de una cadena.");
            
            ex.printStackTrace();
            
        }
        
    }
    
}
