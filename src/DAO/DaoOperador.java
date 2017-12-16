package DAO;
import java.sql.*;
import Logica.*;
import Conexion.*;

public class DaoOperador {
    
    Conexiones conexion;
    
    public DaoOperador(){
        
        conexion = Main.conexion;
    }
    
    public Operador loginOperador(String user){
        
        String sql;
        Operador operador = new Operador();
        
        sql = "SELECT usuario, contrasena FROM Operador WHERE usuario = '" + user + "';";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                
                operador.setUsuario(consulta.getString(1));
                operador.setContrasena(consulta.getString(2));
            }
            
            return operador;
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            
            System.out.println("Error: " + e);
        }
        
        return null;
    }
    
    public int actualizarContrasena(String cedula, String contrasena) {
        
        String sql_guardar, validar;
        
        validar = "SELECT cedula_op FROM Operadores WHERE cedula_op = '" + cedula + "';";
        sql_guardar = "UPDATE Operadores SET contrasena = '" + contrasena +  "' WHERE cedula_op = '" +
                cedula + "';";
        
        try {
            
            Connection conn= conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            
            while(consulta.next()){
                
                validar = consulta.getString(1);
            }
            
            if(validar.equals(cedula)){
                sentencia.executeUpdate(sql_guardar);
                return 1;
            }
            else {
                return 2;
            }
            
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            
            System.out.println("Error" + e);
        }
        
        return -1;
    }
}