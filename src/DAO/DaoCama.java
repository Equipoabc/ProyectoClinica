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
    public Cama consultarDatosCama(String numeroCama) {
        String sql, validar;
        Cama cama = new Cama();
        
        validar = "SELECT numero_cama FROM Camas WHERE numero_cama = '" + numeroCama + "';";
        sql = "SELECT numero_cama, descripcion, estado, id_area "
                + "FROM Camas WHERE numero_cama = '" + numeroCama + "';";
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while (consulta.next()) {
                
                validar = consulta.getString(1);
            }
            
            if (!validar.equals(numeroCama)) {
                
                return null;
            }
            else {
                
                ResultSet consulta2 = sentencia.executeQuery(sql);
                
                while (consulta2.next()) {                    
                    cama.setNumero_cama(consulta2.getString(1));
                    cama.setDescripcion(consulta2.getString(2));
                    cama.setEstado(consulta2.getString(3));
                    cama.setId_area(consulta2.getString(4));
                }
                
                return cama;
            }
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            
            System.out.println("Error" + e);
        }
        return null;
    }
    public int actualizarCama(String numeroCama, String area, String descripcion) {
        
        String sql_guardar, validar;
        
        validar = "SELECT numero_cama FROM Camas WHERE numero_cama = '" + numeroCama + "';";
        sql_guardar = "UPDATE Camas SET numero_cama = '" + numeroCama + "', descripcion = '"
                + descripcion + "', id_area = '"
                + area  + "';";
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while (consulta.next()) {
                
                validar = consulta.getString(1);
            }
            
            int numFilas = sentencia.executeUpdate(sql_guardar);
            return numFilas;
            
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            
            System.out.println("Error" + e);
        }
        
        return -1;
    }    
    public int comprobar(String numeroCama){
        
        String sql;
        sql = "SELECT numero_cama FROM Camas WHERE numero_cama = '" + numeroCama + "';";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                
                sql = consulta.getString(1);
            }
            
            if(sql.equals(numeroCama)){
                
                return 1;
            }
            return 0;
            
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            
            System.out.println("Error: " + e);
        }
        
        return 0;
    } 
    public int eliminarCama(String numeroCama) {
        String sql;
        sql = "DELETE FROM camas WHERE numero_cama = '" + numeroCama + "';";
        
        try {
            int numFilas;
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            numFilas = sentencia.executeUpdate(sql);
            return numFilas;
        }
        catch (SQLException e) {
            System.out.println("SQL error: " + e);
        }
        catch (Exception e) {
            System.out.println("Error" + e);
        }
        return -1;
    }    
}
