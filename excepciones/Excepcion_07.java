package excepciones;

public class Excepcion_07 {

    public static void main(String[] args) {
        
        try{
            
            Class.forName("clase.inexistente");
            
        } catch(ClassNotFoundException ex){
            
            System.out.println("Se lanza cuando se intenta cargar una clase que no se encuentra en el classpath.");
            
        }
        
        
        
    }
    
}
