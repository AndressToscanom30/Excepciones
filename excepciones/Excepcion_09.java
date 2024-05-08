package excepciones;

public class Excepcion_09 {

    public static void main(String[] args) {
        
        try{
            
            String str = "123abc";
            int num = Integer.parseInt(str);
            
        } catch(NumberFormatException ex){
            
            System.out.println("Se lanza cuando se intenta convertir una cadena en un tipo numérico, pero la cadena no tiene el formato adecuado.");
            
        }
        
    }
    
}
