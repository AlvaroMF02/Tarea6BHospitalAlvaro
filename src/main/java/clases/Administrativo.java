package clases;

/**
 *
 * @author Álvaro
 */
public class Administrativo extends Empleado {

    private Grupo grupo;

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario, String nombre, String apellido, Nif nif) {
        super(numeroSeguridadSocial, salario, nombre, apellido, nif);
        this.grupo = grupo;
    }

    public Administrativo() {
        super();
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    //metodo propio de Administrativo
    public void registrarDocumento(String nombreDoc) {
        System.out.println(getNombre()+" "+getApellido()+" ha registrado el documento "+nombreDoc+", cuyo hashcode es "+nombreDoc.hashCode());
    }

    //metodo heredado de Empleado
    public double calcularIRPF() {
        double resultado=0;
        switch (this.grupo) {
            case C:
                resultado=getSalario() * 0.175;
                break;
            case D:
                resultado=getSalario() * 0.18;
                break;
            case A:
                resultado=getSalario() * 0.185;
                break;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Administrativo" + "grupo=" + grupo;
    }

}
