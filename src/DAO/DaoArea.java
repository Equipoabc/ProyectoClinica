package DAO;
import Conexion.Conexiones;
import Logica.Main;
import java.sql.*;
import java.util.ArrayList;


public class DaoArea {
    
    Conexiones conexion;
    
    public DaoArea(){
        conexion = Main.conexion;
    }

    public ArrayList<String> llenarCombo(){
        ArrayList<String> lista = new ArrayList<String>();
        String sql = "SELECT id_area, nombre_area FROM areas;";
        
        try {
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                
                lista.add(consulta.getString(1)+" "+consulta.getString(2));
            }
            
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            
            System.out.println("Error: " + e);
        }
        
        return lista;
    }
    
}
