package clases;

/**
 *
 * @author Álvaro
 */
public enum Grupo {
    
    C(0.175), 
    D(0.018), 
    A(0.185);
    
    private double irpf;

    private Grupo(double irpf) {
        this.irpf = irpf;
    }
    
    
    

    public double getIrpf() {
        return irpf;
    }

    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }
    
    
    
    
}
