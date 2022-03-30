package clases;

import java.time.LocalDate;

/**
 *
 * @author alvaro
 */
public abstract class Persona {

    private String nombre;
    private String apellido;
    private Nif nif;    //puede ser final, al tratarse de un objeto, con un primitivo no se podria

    public Persona(String nombre, String apellido, Nif nif) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
    }

    public Persona() { 
        super();
    }

    //no he puesto los de NIF porque ya hay una clase
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //metodo que heredaran las clases hijas
    public void renovarNIF(LocalDate fechaSolicitud) {
        nif.renovarNif(fechaSolicitud);
    }

}
