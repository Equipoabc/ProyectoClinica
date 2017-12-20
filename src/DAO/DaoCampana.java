package DAO;

import Conexion.Conexiones;
import Logica.Campana;
import Logica.Main;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoCampana {
    
    Conexiones conexion;
    
    public DaoCampana(){
        
        conexion = Main.conexion;
    }
    
    public int guardarCampana(Campana campana) {
        
        String sql_guardar, validar;
        validar = "SELECT codigo_campana FROM Campanas WHERE codigo_campana = '" + campana.getCodigo_campana() + "';";
        int numFilas;
        System.out.println(campana.getFecha_realizacion());
        sql_guardar = "INSERT INTO Campanas (codigo_campana, nombre_campana, objetivo, fecha_realizacion, id_empleado) " 
                + "VALUES ('" + campana.getCodigo_campana() + "', '" +
                campana.getNombre_campana() +  "', '" + campana.getObjetivo() +  "', '" +
                campana.getFecha_realizacion() +  "', '" +campana.getId_empleado() + "')" ;
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while(consulta.next()){
                
                validar = consulta.getString(1);
            }
            
            if(validar.equals(campana.getCodigo_campana())){
                
                return 2;
            }
            
            else {
                
                numFilas = sentencia.executeUpdate(sql_guardar);
                return numFilas;
            }
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            
            System.out.println("Error: " + e);
        }
        
        return -1;
    }   
    public Campana consultarDatosCampana(String id_campana) {
        String sql, validar;
        Campana campana = new Campana();
        
        validar = "SELECT codigo_campana FROM campanas WHERE codigo_campana = '" + id_campana + "';";
        sql = "SELECT nombre_campana, objetivo, fecha_realizacion, id_empleado "
                + "FROM Campanas WHERE codigo_campana = '" + id_campana + "';";
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while (consulta.next()) {
                
                validar = consulta.getString(1);
            }
            
            if (!validar.equals(id_campana)) {
                
                return null;
            }
            else {
                
                ResultSet consulta2 = sentencia.executeQuery(sql);
                
                while (consulta2.next()) {
                    
                    campana.setNombre_campana(consulta2.getString(1));
                    campana.setObjetivo(consulta2.getString(2));
                    campana.setFecha_realizacion(consulta2.getString(3));
                    campana.setId_empleado(consulta2.getString(4));         
                    
                }
                campana.setCodigo_campana(validar);
                
                return campana;
            }
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            
            System.out.println("Error" + e);
        }
        return null;
    }
    public int comprobar(String codigo){
        
        String sql;
        sql = "SELECT codigo_campana FROM Campanas WHERE codigo_campana = '" + codigo + "';";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                
                sql = consulta.getString(1);
            }
            
            if(sql.equals(codigo)){
                
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
    public int actualizarCampana(String codigo, String nombre, String objetivo, String fecha, String medico) {
        
        String sql_guardar, validar;
        validar = "SELECT codigo_campana FROM Campanas WHERE codigo_campana = '" + codigo + "';";
        sql_guardar = "UPDATE Campanas SET nombre_campana = '"
                + nombre + "', objetivo = '" + objetivo + "', fecha_realizacion = '"
                + fecha + "', id_empleado = '" + medico + "' WHERE codigo_campana = '" + codigo + "';";
        
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

    public ArrayList<String> llenarCombo() {
        ArrayList<String> lista = new ArrayList<String>();
        String sql = "SELECT codigo_campana, nombre_campana FROM campanas;";
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
