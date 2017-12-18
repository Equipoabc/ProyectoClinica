package Controladores;
import DAO.*;
import Logica.*;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorCita {

    DaoCita daoCita;
    
    public ControladorCita(){
        daoCita = new DaoCita();
    }

    public int insertarCita(String id_empleadoS, String id_pacienteS, String fechaS, String horario, String precioS) {
        Cita cita = new Cita();
        cita.setId_empleado(id_empleadoS);
        cita.setId_paciente(id_pacienteS);
        cita.setFecha(fechaS);
        cita.setHora(horario);
        cita.setPrecio(precioS);
        
        int resultado = daoCita.insertarCita(cita);
        return resultado;
        
    }

    public ArrayList<String> llenarCombo(String id) {
        return daoCita.llenarCombo(id);
    }

    public Cita consultarDatosCita(String id_paciente, String fechaN, String horaN) {
        Cita cita;
        cita = daoCita.consultarDatosCita(id_paciente, fechaN, horaN);
        return cita;
    }

    public int actualizarCita(String id_paciente, String id_empleadoS, String precioS, String fechaS, String horario, String fechaVieja, String horaVieja) {
        return daoCita.actualizarCita(id_paciente, id_empleadoS, precioS, fechaS, horario, fechaVieja, horaVieja);
    }

    public int validarPacienteCitas(String id_paciente) {
        return daoCita.validarPacienteCitas(id_paciente);
    }

    public int eliminarCita(String id_paciente, String fechaN, String horaN) {
        return daoCita.eliminarCita(id_paciente, fechaN, horaN);
    }

    public int consutarAgenda(String fecha, String medico, DefaultTableModel modelo, JTable tabla) {
        
        return daoCita.consutarAgenda(fecha, medico, modelo, tabla);
    }
}
