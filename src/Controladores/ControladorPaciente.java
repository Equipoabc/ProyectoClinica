package Controladores;
import DAO.*;
import Logica.Paciente;

public class ControladorPaciente {
    
    DaoPaciente daoPaciente;
    
    public ControladorPaciente(){
        
        daoPaciente = new DaoPaciente();
    }

    public int crearPaciente(String nombre, String cedula, String fechaNacimiento, String telefono, String direc, String numero_seguro, String act_economica) {
        
        return daoPaciente.crearPaciente(nombre, cedula, fechaNacimiento, telefono, direc, numero_seguro, act_economica);
    }

    public Paciente consultarDatosPaciente(String cedula) {

        return daoPaciente.consultarDatosPaciente(cedula);
    }

    public int comprobar(String cedulaBusqueda) {
        
        return daoPaciente.comprobar(cedulaBusqueda);
    }

    public int actualizarPaciente(String cedula, String nombre, String telefono, String act, String direccion, String numero) {
        
        return daoPaciente.actualizarPaciente(cedula, nombre, telefono, act, direccion, numero);
    }
}