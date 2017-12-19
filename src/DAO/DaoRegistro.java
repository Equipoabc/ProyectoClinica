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
        
        sql_guardar = "INSERT INTO Registros (numero_historia, fecha_consulta, hora, id_empleado) "
                + "VALUES (" + Integer.parseInt(historia) + ", '" + fech + "', '" +
                hor + "', '" + cedula_medico +  "')";
        
        try {    
            
            Connection conn= conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_guardar);
            return this.consultarRegistro(historia, fech, hor);
            
        } catch(SQLException e){            
            System.out.println("SQL error: " + e);
        } catch(Exception e){            
            System.out.println("Error" + e);
        }
        
        return -1;
    }    

    public int consultarRegistro(String historia, String fech, String hor) {
        
        String sql;
        sql = "SELECT numero_registro FROM registros "
                + "WHERE numero_historia = " + Integer.parseInt(historia) + " AND fecha_consulta = '" + fech + "' AND hora = '" + hor + "';";
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement(); 
            ResultSet consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                
                return Integer.parseInt(consulta.getString(1));
            }
                              
        } catch(SQLException e){            
            System.out.println("SQL error: " + e);
        } catch(Exception e){            
            System.out.println("Error: " + e);
        }
        
        return -1;
    }
}