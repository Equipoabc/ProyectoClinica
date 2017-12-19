package DAO;
import Conexion.Conexiones;
import Logica.Main;
import java.sql.*;

public class DaoFormula_medica {
    
    Conexiones conexion;
            
    public DaoFormula_medica(){
        
        conexion = Main.conexion;
    }
    
    public int crearFormulaMedica(String idMedico, int registro) {
                
        String sql;
        sql = "INSERT INTO formulas_medicas (id_empleado, numero_registro)" +
                " VALUES ('" + idMedico + "', " + registro + ");";
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement(); 
            sentencia.executeUpdate(sql);
            
            return this.consultarIdFormula(idMedico, registro);
                  
            
        } catch(SQLException e){            
            System.out.println("SQL error: " + e);
        } catch(Exception e){            
            System.out.println("Error: " + e);
        }
        
        return -1; 
    }    

    private int consultarIdFormula(String idMedico, int registro) {
       
        String sql;
        sql = "SELECT codigo_formula FROM formulas_medicas "
                + "WHERE id_empleado = '" + idMedico + "' AND numero_registro = " + registro + ";";
        
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
