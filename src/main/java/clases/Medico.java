package clases;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Álvaro
 */
public class Medico extends Empleado {

    private String especialidad;

    public Medico(String especialidad, String numeroSeguridadSocial, double salario, String nombre, String apellido, Nif nif) {
        super(numeroSeguridadSocial, salario, nombre, apellido, nif);
        this.especialidad = especialidad;
    }

    public Medico() {
        super();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //metodo propio de medico
    public void tratar(Paciente paciente, String medicina) {
        System.out.println("El medico" + getNombre() + " trata al paciente" + paciente.getNombre() + " el medicamento " + medicina);
        //tambien hay que llamar al metodo del paciente
    }

    //metodo heredado de empleado
    @Override
    public double calcularIRPF() {
        double irpf;
        if (getEspecialidad().equalsIgnoreCase("cirugia")) {
            irpf = 0.025 * getSalario();
        } else {
            irpf = 0.235 * getSalario();
        }
        return irpf;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Medico" + "especialidad=" + especialidad;
    }

}
