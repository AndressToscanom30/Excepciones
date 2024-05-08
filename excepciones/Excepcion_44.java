package excepciones;

import javax.sound.midi.InvalidMidiDataException;

public class Excepcion_44 {

    public static void main(String[] args) {
        
        try {
            
            reproducirMidi("cancion.mid");
            System.out.println("La canción se ha reproducido correctamente.");
            
        } catch (InvalidMidiDataException ex) {
            
            System.out.println("Este es lanzado cuando los datos MIDI proporcionados no son validos.");
            
            ex.printStackTrace();
            
        }
        
    }

    public static void reproducirMidi(String archivoMidi) throws InvalidMidiDataException {
        
        boolean datosMidiValidos = false;

        if (!datosMidiValidos) {
            
            throw new InvalidMidiDataException("Los datos MIDI proporcionados no son validos.");
            
        }

    }
    
}
