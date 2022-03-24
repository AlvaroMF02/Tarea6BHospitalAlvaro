package clases;

import java.time.LocalDate;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author alvaro
 */
public class Nif {
    
    private String numero;
    private char letra;
    private LocalDate fechaCaducidad;
    
    public Nif(String numero, char letra, LocalDate fechaCaducidad) {
        this.numero = RandomStringUtils.randomNumeric(8).toUpperCase();
        this.letra = letra;
        this.fechaCaducidad = fechaCaducidad;
    }
    
    
    /*
    
    //metodo que genera la letra
    private char generarLetra(){
        
        
        return pepe;
    }
    
    //metodo renueva la fecha
    public LocalDate renovar(LocalDate fechaSolicitudRenovacion){
        
        return pepe;
    }
    
    
    */
}
