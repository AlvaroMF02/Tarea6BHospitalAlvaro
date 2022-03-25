package clases;

import java.time.LocalDate;
import java.util.Random;

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

    public Paciente() {
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
        //random para que de true o false aleatoriamnet
        Random curao = new Random();
        boolean curado=curao.nextBoolean();
        
        if(curado=true){
            System.out.println(getNombre()+" se ha curado exitosamente");
        }else{
            System.out.println(getNombre()+" le ha sentado mal "+medicina);
        }
        
    }

    @Override
    public String toString() {
        return super.toString()+
                "Paciente" + "numeroHistoria=" + numeroHistoria;
    }

}
