package excepciones;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Excepcion_55 {

    public static void main(String[] args) {
        
        try{
            
            try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_UNDEFINED); // Código de tecla no definido
            } catch (AWTException e) {
                System.err.println("Error: Error en la plataforma AWT");
                e.printStackTrace();
            }
            
        } catch(IllegalArgumentException ex){
            
            System.out.println("Invalid key code");
            
            ex.printStackTrace();
            
        }
        
    }
    
}
