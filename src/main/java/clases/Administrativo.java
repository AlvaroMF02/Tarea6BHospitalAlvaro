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
        System.out.println("Se ha registrado el documento");
    }

    //metodo heredado de Empleado
    public double calcularIRPF() {

    }

    @Override
    public String toString() {
        return super.toString()+
                "Administrativo" + "grupo=" + grupo;
    }

}
