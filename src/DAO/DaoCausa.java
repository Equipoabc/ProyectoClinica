package DAO;
import Conexion.*;
import Logica.*;
import java.sql.*;
import java.util.ArrayList;

public class DaoCausa {

    Conexiones conexion;
    
    public DaoCausa(){
        
        conexion = Main.conexion;
    }
    
    public int registrarCausa(String nombre, String descripcion) {
        
        String sql_guardar;
        
        sql_guardar = "INSERT INTO Causas (nombre_causa, descripcion) "
                + "VALUES ('" + nombre + "', '" + descripcion + "');";
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_guardar); 
            return 1;
            
        } catch(SQLException e){            
            System.out.println("SQL error: " + e);
        } catch(Exception e){            
            System.out.println("Error" + e);
        }
        
        return -1;
    }    

    public ArrayList<String> llenarCausas() {
        
        ArrayList<String> lista = new ArrayList<String>();               
        String sql = "SELECT codigo_causa, nombre_causa FROM causas;";
        
        try {
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                
                 lista.add(consulta.getString(1) + " " + consulta.getString(2));
            }
            
        } catch(SQLException e){            
            System.out.println("SQL error: " + e);
        } catch(Exception e){            
            System.out.println("Error: " + e);
        }
        
        return lista;
    }

    public Causa consultarDatosCausa(String cod_causa) {
        String sql, validar;
        Causa causa = new Causa();
        validar = "SELECT codigo_causa FROM causas WHERE codigo_causa = '" + cod_causa + "';";
        
        sql = "SELECT codigo_causa, nombre_causa, descripcion FROM causas WHERE codigo_causa = '" + cod_causa + "';";
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while (consulta.next()) {
                
                validar = consulta.getString(1);
            }
            
            if (!validar.equals(cod_causa)) {
                
                return null;
            }
            else {
                
                ResultSet consulta2 = sentencia.executeQuery(sql);
                
                while (consulta2.next()) {
                    
                    causa.setCodigo_causa(consulta2.getString(1));
                    causa.setNombre_causa(consulta2.getString(2));
                    causa.setDescripcion(consulta2.getString(3));
                }
                
                return causa;
            }
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            
            System.out.println("Error" + e);
        }
        return null;
    }

    public int actualizarCausa(String codigoConsulta, String nom, String des) {
        String sql_guardar;
        
        sql_guardar = "UPDATE causas SET nombre_causa = '" + nom + "', descripcion = '"+
                 des + "' WHERE codigo_causa = '" + codigoConsulta + "';";
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            int numFilas = sentencia.executeUpdate(sql_guardar);
            return numFilas;
            
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            
            System.out.println("Error" + e);
        }
        
        return -1;
    }

    public int eliminarCausa(String cod_causa) {
        String sql;
        sql = "DELETE FROM causas WHERE codigo_causa = '" + cod_causa + "';";
        
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
