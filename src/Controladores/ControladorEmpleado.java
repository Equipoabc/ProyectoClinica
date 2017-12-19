package Controladores;
import DAO.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorEmpleado {
    
    DaoEmpleado daoEmpleado;
    
    public ControladorEmpleado(){
        
        daoEmpleado = new DaoEmpleado();
    }

    public void listarEmpleados(DefaultTableModel modelo, JTable tabla) {
        
        daoEmpleado.listarEmpleados(modelo, tabla);
    }

    public void listarEmpleadosArea(String nombre, String id_area, DefaultTableModel modelo, JTable tabla) {
        
        daoEmpleado.listarEmpleadosArea(nombre, id_area, modelo, tabla);      
    }

    public void listarCitasMeses(int id_mes, DefaultTableModel modelo, JTable tabla) {
        daoEmpleado.listarCitasMeses(id_mes, modelo, tabla);
    }
}
