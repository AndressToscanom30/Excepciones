package excepciones;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class Excepcion_45 {

    public static void main(String[] args) {
        
        try {
            
            Sequencer sequencer = MidiSystem.getSequencer();
            
            
            throw new MidiUnavailableException("El secuenciador MIDI no esta disponible.");
            
        } catch (MidiUnavailableException ex) {
            
      
            System.err.println("Se lanza cuando no se puede acceder a un dispositivo MIDI o cuando ocurre un problema relacionado con la disponibilidad de los recursos MIDI, como los sintetizadores o los dispositivos de entrada/salida MIDI.");
            ex.printStackTrace();
            
        }
        
    }
    
}
