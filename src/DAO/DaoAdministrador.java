package DAO;
import java.sql.*;
import Logica.*;
import Conexion.*;

public class DaoAdministrador {
    
    Conexiones conexion;
    
    public DaoAdministrador(){
        
        conexion = Main.conexion;
    }
    
    public Administrador loginAdministrador(String user){
        
        String sql;
        Administrador administrador = new Administrador();
        
        sql = "SELECT usuario, contrasena FROM Administrador WHERE usuario = '" + user + "';";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                
                administrador.setUsuario(consulta.getString(1));
                administrador.setContrasena(consulta.getString(2));
            }
            
            return administrador;
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            
            System.out.println("Error: " + e);
        }
        
        return null;
    }
}
