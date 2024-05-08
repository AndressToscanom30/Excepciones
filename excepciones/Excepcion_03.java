package excepciones;

public class Excepcion_03 {

    public static void main(String[] args) {
       
        try{
            
            int[] array = new int[3];
            System.out.println(array[5]);
            
        }catch(ArrayIndexOutOfBoundsException ex){
            
            System.out.println("Se lanza cuando se intenta acceder a un índice fuera del rango válido de un array.");
            
        }
    }
    
}
