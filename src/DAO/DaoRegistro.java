package DAO;
import Logica.Main;
import Conexion.Conexiones;
import java.sql.*;

public class DaoRegistro {
    
    Conexiones conexion;
    
    public DaoRegistro(){
        
        conexion = Main.conexion;
    }

    public int crearRegistro(String historia, String fech, String hor, String cedula_medico) {
        
        String sql_guardar;
        int resultado;
        
        sql_guardar = "INSERT INTO Registros (numero_historia, fecha_consulta, hora, id_empleado) "
                + "VALUES (" + Integer.parseInt(historia) + ", '" + fech + "', '" +
                hor + "', '" + cedula_medico +  "')";
        
        try {    
            
            Connection conn= conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            resultado = sentencia.executeUpdate(sql_guardar);
            return resultado;
            
        } catch(SQLException e){            
            System.out.println("SQL error: " + e);
        } catch(Exception e){            
            System.out.println("Error" + e);
        }
        
        return -1;
    }    
}