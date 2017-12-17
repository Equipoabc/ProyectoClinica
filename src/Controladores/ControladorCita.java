package Controladores;
import DAO.*;
import Logica.*;

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
    
}
