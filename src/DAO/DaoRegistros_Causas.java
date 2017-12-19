package DAO;
import Conexion.*;
import Logica.*;
import java.sql.*;

public class DaoRegistros_Causas {

    Conexiones conexion;
    
    public DaoRegistros_Causas(){
        
        conexion  = Main.conexion;
    }
    
    public int insertarCausa(int registro, int causa) {
        
        String sql;
               
        sql = "INSERT INTO registros_causas (numero_registro, codigo_causa) "
                + "VALUES ('" + registro + "', '" + causa +  "')";
        
        try {
            
            Connection conn= conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            return sentencia.executeUpdate(sql);
            
        } catch(SQLException e){            
            System.out.println("SQL error: " + e);
        } catch(Exception e){            
            System.out.println("Error" + e);
        }
        
        return -1;
    }    
}
