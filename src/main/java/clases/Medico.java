package clases;

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
        System.out.println("El medico trata al paciente");
    }

    //metodo heredado de empleado
    public double calcularIRPF() {

    }

    @Override
    public String toString() {
        return super.toString()+
                "Medico" + "especialidad=" + especialidad;
    }

}
