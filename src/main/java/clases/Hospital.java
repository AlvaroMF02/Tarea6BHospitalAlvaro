package clases;

/**
 *
 * @author Álvaro
 */
public class Hospital {
    
    private String nombre;
    private String direccion;
    private int numeroCamas;

    public Hospital(String nombre, String direccion, int numeroCamas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCamas = numeroCamas;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }
    
    
    //metodos de hospital
    public void contratarEmpleado(Empleado emp){
        System.out.println("Se ha contratado a un nuevo empleado");
    }
    
    public void ingresarPaciente(Paciente paciente){
        System.out.println("Se ha ingresado a un nuevo paciente");
    }

    @Override
    public String toString() {
        return "Hospital:" + "nombre=" + nombre + ", direccion=" + direccion + ", numeroCamas=" + numeroCamas;
    }
    
}
