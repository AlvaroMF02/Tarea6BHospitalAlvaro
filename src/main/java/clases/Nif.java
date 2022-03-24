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
        this.letra = letra; //se llama al metodo generarLetra aqui?
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNumero() {
        return numero;
    }

    public char getLetra() {
        return letra;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    /*
    
    //metodo que genera la letra
    private char generarLetra(){
        
        
        return letra;
    }
    
    //metodo renueva la fecha
    public LocalDate renovar(LocalDate fechaSolicitudRenovacion){
        
        return nuevaFecha;
    }
    
    
     */
    @Override
    public String toString() {
        return "Nif:" + "numero=" + numero + ", letra=" + letra + ", fechaCaducidad=" + fechaCaducidad;
    }

}
