package excepciones;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Excepcion_35 {

    public static void main(String[] args) {
        
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> tarea = () -> { 
            
            throw new RuntimeException("Error en la tarea"); 
        
        };
        
        Future<Integer> futuro = executor.submit(tarea);
        
        try {
            
            Integer resultado = futuro.get();
            System.out.println("Resultado de la tarea: " + resultado);
            
        } catch(InterruptedException ex) {
            
            ex.printStackTrace();
            
        } catch (ExecutionException ex) {
            
            System.out.println("Se lanza cuando ocurre un error durante la ejecución de un proceso o tarea en un ExecutorService, por lo general como resultado de un error en el proceso que está siendo ejecutado:\n");
            
            ex.printStackTrace();
            
        }
        
        executor.shutdown();
        
    }
    
}