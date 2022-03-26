package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Álvaro
 */
public class GestionHospital {

    public static void main(String[] args) {

        //creacion del hospital
        Hospital hospital = new Hospital("Cristo Salvador", "C/Angeles Nº13", 666);

        //creacion de los empleados con el metodo contratar
        //medico
        hospital.contratarEmpleado(new Medico("cirugia", "78468476357", 1000, "Arnaldo", "Gerruz", new Nif("87510773", 'C', LocalDate.EPOCH)));         //0
        hospital.contratarEmpleado(new Medico("enfermero", "165468466854", 1000, "Juan", "Lopez", new Nif("29547615", 'P', LocalDate.EPOCH)));          //1

        //administrativo
        hospital.contratarEmpleado(new Administrativo(Grupo.C, "165168416516", 800, "Antonio", "Ramirez", new Nif("269843645", 'J', LocalDate.EPOCH))); //2
        hospital.contratarEmpleado(new Administrativo(Grupo.D, "168865168949", 900, "Fernando", "Ortiz", new Nif("368421598", 'P', LocalDate.EPOCH)));  //3
        hospital.contratarEmpleado(new Administrativo(Grupo.A, "851526298465", 1000, "Juana", "Maria", new Nif("85264579", 'M', LocalDate.EPOCH)));     //4

        //creacion de los pacientes con el metodo ingresar
        hospital.ingresarPaciente(new Paciente("1", "Nacho", "Salcedo", new Nif("369852147", 'I', LocalDate.EPOCH)));                                   //0
        hospital.ingresarPaciente(new Paciente("2", "Victoria", "Sampalo", new Nif("26841259", 'A', LocalDate.EPOCH)));                                 //1
        hospital.ingresarPaciente(new Paciente("3", "Domingo", "Jose", new Nif("954786324", 'N', LocalDate.EPOCH)));                                    //2
        hospital.ingresarPaciente(new Paciente("4", "Juan Jose", "Bazan", new Nif("85264792", 'F', LocalDate.EPOCH)));                                  //3
        hospital.ingresarPaciente(new Paciente("5", "Pepe", "Moreno", new Nif("45682159", 'S', LocalDate.EPOCH)));                                      //4

        //elegir medico y paciente aleatoriamente para tratarlo con un metodo de medico
        //crear numero aleatorio para el indice
        Random alea = new Random();
        int medicAlea = alea.nextInt(2);    //(1 - 0 + 1) + 0;  (mayor - menor + 1) + menor
        int pacieAlea = alea.nextInt(5);    //(4 - 0 + 1) + 0;
        
        /*
        hospital.getEmpleados().get(medicAlea);
        hospital.getPacientes().get(pacieAlea);  //.tomarMedicina("Paracetamol");

        //me deja acceder al metodo de pacientes porque no hay otra clase de por medio
        //mientras que en Medico no me deja porque está Empleado de por medio
        
        
        for (int i = 0; i < hospital.getEmpleados().size(); i++) {
            if (hospital.getEmpleados().get(medicAlea) instanceof Medico) {
            ((Medico) hospital.getEmpleados().get(medicAlea).)
        }
            
        }
        //casting
        if (hospital.getEmpleados().get(medicAlea) instanceof Medico) {
            ((Medico) hospital.getEmpleados().get(medicAlea).)
        }
         */
        
        //calcular el IRPF de todos los empleados
        hospital.getEmpleados().get(0).renovarNIF(LocalDate.EPOCH);

        //renovar el NIF a un paciente
        hospital.getPacientes().get(pacieAlea).renovarNIF(LocalDate.EPOCH);

    }
}