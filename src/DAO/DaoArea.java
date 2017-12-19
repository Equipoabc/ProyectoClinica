package DAO;
import Conexion.Conexiones;
import Logica.*;
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
    
     public String seleccionArea(String area){
        String sql = "SELECT id_area, nombre_area FROM areas WHERE id_area = '" + area + "';";
        String result = "";
        
        try {
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                
                result = consulta.getString(1) + " " + consulta.getString(2); 
            }
            
            } catch(SQLException e){
            
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            
            System.out.println("Error: " + e);
        }
        
        return result;
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
        }
        catch(SQLException e){
            
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

    public int eliminarArea(String cod_area) {
        String sql;
        sql = "DELETE FROM areas WHERE id_area = '" + cod_area + "';";
        
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

    public ArrayList<String> consultarAreas() {
        
        ArrayList<String> lista = new ArrayList<String>();
        
        String sql = "SELECT id_area, nombre_area FROM areas;";
        
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
}
