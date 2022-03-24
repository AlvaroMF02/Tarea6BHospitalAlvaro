package clases;

import java.time.LocalDate;

/**
 *
 * @author Álvaro
 */
public class Paciente extends Persona {

    private String numeroHistoria;

    public Paciente(String numeroHistoria, String nombre, String apellido, Nif nif) {
        super(nombre, apellido, nif);
        this.numeroHistoria = numeroHistoria;
    }

    public Paciente(String numeroHistoria) {
        super();
    }

    public String getNumeroHistoria() {
        return numeroHistoria;
    }

    public void setNumeroHistoria(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    //metodo heredado
    public void renovarNIF(LocalDate fechaSolicitud) {

    }

    //metodo propio de paciente
    public void tomarMedicina(String medicina) {
        System.out.println("El paciente se tomará " + medicina);
    }

    @Override
    public String toString() {
        return super.toString()+
                "Paciente" + "numeroHistoria=" + numeroHistoria;
    }

}
