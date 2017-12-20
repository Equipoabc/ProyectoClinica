package Controladores;
import DAO.*;
import Logica.Paciente;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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

    public void consultarGastosPacientesMensual(String datoM, String datoA, DefaultTableModel modelo, JTable tabla) {
        
        daoPaciente.consultarGastosPacientesMensual(datoM, datoA, modelo, tabla);
    }

    public void consultarGastosPacientesAnual(String datoA, DefaultTableModel modelo, JTable tabla) {
        
        daoPaciente.consultarGastosPacientesAnual(datoA, modelo, tabla);
    }

    public void consultarGastosPacienteMensual(String cedula, String datoM, String datoA, DefaultTableModel modelo, JTable tabla) {
        
        daoPaciente.consultarGastosPacienteMensual(cedula, datoM, datoA, modelo, tabla);
    }

    public void consultarGastosPacienteAnual(String cedula, String datoA, DefaultTableModel modelo, JTable tabla) {
        
        daoPaciente.consultarGastosPacienteAnual(cedula, datoA, modelo, tabla);
    }

    public void consultarHistoriaEsp(String cedula, DefaultTableModel modelo, JTable tabla) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}