package clases;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Álvaro
 */
public class GestionHospital {

    public static void main(String[] args) {

        Paciente paciente = new Paciente();
        Medico medico = new Medico();
        Administrativo administrativo = new Administrativo();

        //creacion del hospital
        Hospital hospital = new Hospital("Cristo Salvador", "C/Angeles Nº13", 666);

        //creacion de los empleados con el metodo contratar
        //medico
        hospital.contratarEmpleado(new Medico("cirugia", "78468476357", 1000, "Arnaldo", "Gerruz", new Nif("87510773", 'C', LocalDate.EPOCH)));
        hospital.contratarEmpleado(new Medico("enfermero", "165468466854", 1000, "Juan", "Lopez", new Nif("29547615", 'P', LocalDate.EPOCH)));

        //administrativo
        hospital.contratarEmpleado(new Administrativo(Grupo.C, "165168416516", 800, "Antonio", "Ramirez", new Nif("269843645", 'J', LocalDate.EPOCH)));
        hospital.contratarEmpleado(new Administrativo(Grupo.D, "168865168949", 900, "Fernando", "Ortiz", new Nif("368421598", 'P', LocalDate.EPOCH)));
        hospital.contratarEmpleado(new Administrativo(Grupo.A, "851526298465", 1000, "Juana", "Maria", new Nif("85264579", 'M', LocalDate.EPOCH)));

        //creacion de los pacientes con el metodo ingresar
        hospital.ingresarPaciente(new Paciente("1", "Nacho", "Salcedo", new Nif("369852147", 'I', LocalDate.EPOCH)));
        hospital.ingresarPaciente(new Paciente("2", "Victoria", "Sampalo", new Nif("26841259", 'A', LocalDate.EPOCH)));
        hospital.ingresarPaciente(new Paciente("3", "Domingo", "Jose", new Nif("954786324", 'N', LocalDate.EPOCH)));
        hospital.ingresarPaciente(new Paciente("4", "Juan Jose", "Bazan", new Nif("85264792", 'F', LocalDate.EPOCH)));
        hospital.ingresarPaciente(new Paciente("5", "Pepe", "Moreno", new Nif("45682159", 'S', LocalDate.EPOCH)));

        //elegir medico y paciente aleatoriamente para tratarlo con un metodo de medico
        if (hospital.get(0) instanceof Medico) {
            ((Medico) hospital.get(0)).;
        }

    }
}
