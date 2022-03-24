package clases;

/**
 *
 * @author alvaro
 */
public abstract class Empleado {
    
    private String numeroSeguridadSocial;
    private double salario;
    
    
    //metodo para calcular el IRPF
    public abstract double calcularIRPF();
}
