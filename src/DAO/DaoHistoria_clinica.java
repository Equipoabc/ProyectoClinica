package DAO;
import Conexion.Conexiones;
import Logica.Main;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DaoHistoria_clinica {

    Conexiones conexion;
    
    public DaoHistoria_clinica(){
        
        conexion = Main.conexion;
    }  
    
    public String consultarNumero(String cedula){
        
        String sql;
        sql = "SELECT numero_historia FROM Historias_clinicas WHERE id_paciente = '" + cedula + "';";

        try {

            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            sql = "";

            while (consulta.next()) {

                sql = consulta.getString(1);
            }

            return sql;

        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return "Error";
    }

    public void crearHistoria(String fecha, String cedula) {
        
        String sql_guardar;
        
        sql_guardar = "INSERT INTO Historias_clinicas (fecha_apertura, id_paciente) "
                + "VALUES ('" + fecha + "', '" + cedula + "');";
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_guardar);     
            
        } catch(SQLException e){            
            System.out.println("SQL error: " + e);
        } catch(Exception e){            
            System.out.println("Error" + e);
        }
    }

    public void consultarHistoria(String cedula, DefaultTableModel modelo, JTable tabla) {
        
         String sql;
        
        sql = "SELECT registros.numero_registro, codigo_formula FROM registros NATURAL JOIN historias_clinicas NATURAL JOIN formulas_medicas" +
                " WHERE id_paciente = '" + cedula + "';";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            Object fila[] = new Object[2];
            
            while(consulta.next()){
                
                
                for (int i = 0; i < 2; i++){
                    
                    fila[i] = consulta.getObject(i+1);
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
