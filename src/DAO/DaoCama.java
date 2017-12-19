package DAO;
import Conexion.Conexiones;
import Logica.*;
import java.sql.*;
import java.util.ArrayList;

public class DaoCama {
    
    Conexiones conexion;
    
    public DaoCama(){
        
        conexion = Main.conexion;
    }
    
    public int guardarCama(Cama cama){
        
        String sql_guardar, validar;
        int numFilas;
        
        validar = "SELECT numero_cama FROM Camas WHERE numero_cama = '" + cama.getNumero_cama() + "';";
        sql_guardar = "INSERT INTO Camas (numero_cama, descripcion, estado, id_area) VALUES ('" 
                + cama.getNumero_cama() + "', '" +
                cama.getDescripcion() +  "', '" + cama.getEstado() +  "', '" +
                cama.getId_area()  +  "')" ;
        
        try {
            
            Connection conn= conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while(consulta.next()){
                
                validar = consulta.getString(1);
            }
            
            if(validar.equals(cama.getNumero_cama())){
                
                return 2;
            }            
            else {                
                numFilas = sentencia.executeUpdate(sql_guardar);
                return numFilas;
            }
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            
            System.out.println("Error" + e);
        }
        
        return -1;
    }  

    
}
