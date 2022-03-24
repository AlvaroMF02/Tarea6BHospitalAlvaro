package clases;

import java.time.LocalDate;

/**
 *
 * @author alvaro
 */
public abstract class Persona {

    private String nombre;
    private String apellido;
    private Nif nif;

    public Persona(String nombre, String apellido, Nif nif) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
    }

    public Persona() {  //sigo sin saber para que se crea uno vacio :)
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
    public abstract void renovarNIF(LocalDate fechaSolicitud);

}
