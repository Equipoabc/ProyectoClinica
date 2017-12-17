package DAO;
import Conexion.Conexiones;
import Logica.Main;
import java.sql.*;

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
}
