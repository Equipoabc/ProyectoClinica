package DAO;
import Conexion.*;
import Logica.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DaoCita {

    Conexiones conexion;
    
    public DaoCita(){
        
        conexion = Main.conexion;
    }

    public int consutarAgenda(String fecha, String medico, DefaultTableModel modelo, JTable tabla) {
        
        String sql;
        
        sql = "SELECT hora, id_paciente, nombre_paciente FROM Citas NATURAL JOIN Pacientes WHERE id_empleado = '" + medico + "' AND fecha = '" + fecha + "' ORDER BY hora;";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            Object fila[] = new Object[3];
            
            while(consulta.next()){
                
                for (int i = 0; i < 3; i++){
                    
                    fila[i] = consulta.getObject(i + 1);
                }
                
                modelo.addRow(fila);
            }
            
            tabla.updateUI();
            return 1;
            
        } catch(SQLException e){            
            System.out.println("SQL error: " + e);
            return 2;
        } catch(Exception e){            
            System.out.println("Error: " + e);
            return 2;
        }
    } 
}
