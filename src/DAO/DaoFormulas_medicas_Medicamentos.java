package DAO;
import java.sql.*;
import Conexion.*;
import Logica.*;

public class DaoFormulas_medicas_Medicamentos {
    
    Conexiones conexion;
    
    public DaoFormulas_medicas_Medicamentos(){
        
        conexion = Main.conexion;
    }
    
    public int insertarFormula(int formula, String codigo){
        
        String sql;
               
        sql = "INSERT INTO formulas_medicas_medicamentos (codigo_formula, codigo_medicamento) "
                + "VALUES ('" + formula + "', '" + codigo +  "')";
        
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
