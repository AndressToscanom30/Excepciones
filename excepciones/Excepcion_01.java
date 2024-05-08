package excepciones;

public class Excepcion_01 {

    public static void main(String[] args) {
        
        try {
            
            double division = 4 / 0;
            System.out.println("La división es: " + division);
            
        } catch (ArithmeticException ex) {
            
            System.out.println("No se puede dividir por cero       V");
            
            ex.printStackTrace();
            
        }
        
    }
    
}
