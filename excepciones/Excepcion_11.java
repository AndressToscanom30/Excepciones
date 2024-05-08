package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcion_11 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite su nombre: ");
        
        
        try{
            
            int num = scanner.nextInt();
            System.out.println(num);
            
        } catch(InputMismatchException ex){
            
            System.out.println("Este error aparece cuando se ha declarado que la variable es de un tipo y se ingresa un dato de otro tipo.");
            
        }
        
    }
    
}
