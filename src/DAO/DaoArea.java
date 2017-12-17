/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Logica.Area;
import static Logica.Main.conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Iván
 */
public class DaoArea {

    public int guardarArea(Area area) {
        
        String sql_guardar, validar;
        validar = "SELECT id_area FROM areas WHERE id_area = '" + area.getId_area()+ "';";
        int numFilas;
        
        sql_guardar = "INSERT INTO areas (id_area, nombre_area, descripcion)" +
                "VALUES ('" + area.getId_area() + "', '" +
                area.getNombre_area() +  "', '" + area.getDescripcion()+ "')" ;
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while(consulta.next()){
                
                validar = consulta.getString(1);
            }
            
            if(validar.equals(area.getId_area())){
                
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

    public int comprobar(String codigoConsulta) {
        String sql;
        sql = "SELECT id_area FROM areas WHERE id_area = '" + codigoConsulta + "';";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                
                sql = consulta.getString(1);
            }
            
            if(sql.equals(codigoConsulta)){
                
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

    public int actualizarArea(String codigoConsulta, String nom, String cod, String des) {
        String sql_guardar, validar;
        
        validar = "SELECT id_area FROM areas WHERE id_area = '" + codigoConsulta + "';";
        sql_guardar = "UPDATE areas SET id_area = '"
                + cod + "', nombre_area = '" + nom + "', descripcion = '"+
                 des + "' WHERE id_area = '" + codigoConsulta + "';";
        
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

    public Area consultarDatosArea(String cod_area) {
        
       String sql, validar;
        Area area = new Area();
        
        
        validar = "SELECT id_area FROM areas WHERE id_area = '" + cod_area + "';";
        
        sql = "SELECT id_area, nombre_area, descripcion "
                + "FROM areas WHERE id_area = '" + cod_area + "';";
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while (consulta.next()) {
                
                validar = consulta.getString(1);
            }
            
            if (!validar.equals(cod_area)) {
                
                return null;
            }
            else {
                
                ResultSet consulta2 = sentencia.executeQuery(sql);
                
                while (consulta2.next()) {
                    
                    area.setId_area(consulta2.getString(1));
                    area.setNombre_area(consulta2.getString(2));
                    area.setDescripcion(consulta2.getString(3));
                }
                
                area.setId_area(validar);
                
                return area;
            }
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            
            System.out.println("Error" + e);
        }
        return null;
    }
        
    
}
