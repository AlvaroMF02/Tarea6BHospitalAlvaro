package clases;

import java.util.ArrayList;

/**
 *
 * @author Álvaro
 */
public class Hospital {

    private String nombre;
    private String direccion;
    private int numeroCamas;
    private ArrayList<Paciente> pacientes = new ArrayList<>();
    private ArrayList<Empleado> empleados = new ArrayList<>();

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
    public void contratarEmpleado(Empleado emp) {
        empleados.add(emp);
    }

    public void ingresarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Hospital:" + "nombre=" + nombre + ", direccion=" + direccion + ", numeroCamas=" + numeroCamas;
    }

}
