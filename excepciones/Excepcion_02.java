package excepciones;

public class Excepcion_02 {

    public static void main(String[] args) {
        
        String str = null;
        
        try{
            
            System.out.println(str.length());
            
        }catch(NullPointerException ex){
            
            System.out.println("Se lanza cuando se intenta acceder o invocar un método en un objeto que es null.");
            
        }
            
        
    }
    
}
