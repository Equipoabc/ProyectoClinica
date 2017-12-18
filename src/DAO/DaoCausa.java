package DAO;
import Conexion.*;
import Logica.*;
import java.sql.*;

public class DaoCausa {

    Conexiones conexion;
    
    public DaoCausa(){
        
        conexion = Main.conexion;
    }
    
    public int registrarCausa(String nombre, String descripcion) {
        
        String sql_guardar;
        
        sql_guardar = "INSERT INTO Causas (nombre_causa, descripcion) "
                + "VALUES ('" + nombre + "', '" + descripcion + "');";
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_guardar); 
            return 1;
            
        } catch(SQLException e){            
            System.out.println("SQL error: " + e);
        } catch(Exception e){            
            System.out.println("Error" + e);
        }
        
        return -1;
    }    
}
