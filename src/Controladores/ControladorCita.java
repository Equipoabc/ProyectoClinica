package Controladores;
import DAO.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorCita {

    DaoCita daoCita;
    
    public ControladorCita(){
        
        daoCita = new DaoCita();
    }

    public int consutarAgenda(String fecha, String medico, DefaultTableModel modelo, JTable tabla) {
        
        return daoCita.consutarAgenda(fecha, medico, modelo, tabla);
    }
}
