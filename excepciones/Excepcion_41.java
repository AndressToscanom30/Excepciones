package excepciones;

public class Excepcion_41 {

    public static void main(String[] args) {
        
        try {
            
            throw new UnmodifiableClassException("No se puede modificar esta clase");
            
        } catch (UnmodifiableClassException e) {
            
            System.err.println("Es lanzada cuando se intenta modificar una clase que no puede ser modificada, generalmente porque es una clase final o porque es una clase cargada de un archivo JAR que no puede ser modificada en tiempo de ejecución.");
            e.printStackTrace();
            
        }
        
    }

    private static class UnmodifiableClassException extends Exception {

        public UnmodifiableClassException(String no_se_puede_modificar_esta_clase) {
        }
    }
    
}
