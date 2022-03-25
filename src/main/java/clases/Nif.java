package clases;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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

    
    //metodo que genera la letra
    private char generarLetra(String numero){
        char letra;
        switch (Integer.parseInt(numero) % 23) {
            case 0:
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;
            case 2:
                letra = 'W';
                break;
            case 3:
                letra = 'A';
                break;
            case 4:
                letra = 'G';
                break;
            case 5:
                letra = 'M';
                break;
            case 6:
                letra = 'Y';
                break;
            case 7:
                letra = 'F';
                break;
            case 8:
                letra = 'P';
                break;
            case 9:
                letra = 'D';
                break;
            case 10:
                letra = 'X';
                break;
            case 11:
                letra = 'B';
                break;
            case 12:
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break;
            case 14:
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            case 16:
                letra = 'Q';
                break;
            case 17:
                letra = 'V';
                break;
            case 18:
                letra = 'H';
                break;
            case 19:
                letra = 'L';
                break;
            case 20:
                letra = 'C';
                break;
            case 21:
                letra = 'K';
                break;
            default:
                letra = 'E';
                break;
        }
        return letra;
    }
    
    
    
    //metodo renueva la fecha
    public LocalDate renovarNif(LocalDate fechaSolicitudRenovacion){
        LocalDate hoy = LocalDate.now();
        LocalDate fechaNueva = hoy.plusYears(10);
        return fechaNueva;
    }
    
    
    @Override
    public String toString() {
        return "Nif:" + "numero=" + numero + ", letra=" + letra + ", fechaCaducidad=" + fechaCaducidad;
    }

}
