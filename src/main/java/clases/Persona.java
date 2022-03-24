package clases;

import java.time.LocalDate;

/**
 *
 * @author alvaro
 */
public abstract class Persona {
    
    private String nombre;
    private String apellido;
    private Nif nif;
    
    public abstract void renovarNIF();
        
    
}
