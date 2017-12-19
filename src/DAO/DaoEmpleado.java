package DAO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Conexion.*;
import Logica.*;
import java.sql.*;

public class DaoEmpleado {

    Conexiones conexion;
    
    public DaoEmpleado(){
        
        conexion = Main.conexion;
    }
    
    public void listarEmpleados(DefaultTableModel modelo, JTable tabla) {
        
        String sql;
        
        sql = "SELECT nombre_area, id_empleado, nombre_empleado, direccion, telefono, email, cargo FROM Empleados NATURAL JOIN Areas ORDER BY nombre_area;";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            Object fila[] = new Object[7];
            
            while(consulta.next()){

                
                for (int i = 0; i < 7; i++){
                    
                    fila[i] = consulta.getObject(i + 1);
                }
                
                modelo.addRow(fila);
            }
            
            tabla.updateUI();
            
        } catch(SQLException e){            
            System.out.println("SQL error: " + e);          
        } catch(Exception e){            
            System.out.println("Error: " + e);           
        }
    }

    public void listarEmpleadosArea(String nombre, String id_area, DefaultTableModel modelo, JTable tabla) {
    
        String sql;
        
        sql = "SELECT id_empleado, nombre_empleado, direccion, telefono, email, cargo FROM Empleados WHERE id_area = '" + id_area + "';";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            Object fila[] = new Object[7];
            
            while(consulta.next()){
                
                fila[0] = nombre;
                
                for (int i = 1; i <= 6; i++){
                    
                    fila[i] = consulta.getObject(i);
                }
                
                modelo.addRow(fila);
            }
            
            tabla.updateUI();
            
        } catch(SQLException e){            
            System.out.println("SQL error: " + e);          
        } catch(Exception e){            
            System.out.println("Error: " + e);           
        }
    }    
}
