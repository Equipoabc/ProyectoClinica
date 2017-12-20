package DAO;
import Logica.*;
import Conexion.Conexiones;
import java.sql.*;
import java.util.ArrayList;

public class DaoMedicamento {
    
    Conexiones conexion;
    
    public DaoMedicamento(){
        
        conexion = Main.conexion;
    }

    public int guardarMedicamento(Medicamento medicamento) {
        
      String sql_guardar, validar;
        validar = "SELECT codigo_medicamento FROM medicamentos WHERE codigo_medicamento = '" + medicamento.getCodigo_medicamento()+ "';";
        int numFilas;
        
        sql_guardar = "INSERT INTO medicamentos (codigo_medicamento, nombre_medicamento, costo, descripcion)" +
                "VALUES ('" + medicamento.getCodigo_medicamento() + "', '" + 
                medicamento.getNombre_medicamento()+ "', '" + 
                medicamento.getCosto() +  "', '" 
                + medicamento.getDescripcion()+ "');";
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            
            while(consulta.next()){
                
                validar = consulta.getString(1);
            }
            
            if(validar.equals(medicamento.getCodigo_medicamento())){
                
                return 2;
            }
            
            else{
                
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

    public int comprobar(String id){
        
        String sql;
        sql = "SELECT codigo_medicamento FROM medicamentos WHERE codigo_medicamento = '" + id + "';";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                
                sql = consulta.getString(1);
            }
            
            if(sql.equals(id)){
                
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

    public int actualizarMedicamento(String codigoConsulta, String nom, String des, String cos) {
   
        
        String sql_guardar, validar;
        
        validar = "SELECT codigo_medicamento FROM medicamentos WHERE codigo_medicamento = '" + codigoConsulta + "';";
        sql_guardar = "UPDATE medicamentos SET codigo_medicamento = '"
                + codigoConsulta + "', nombre_medicamento = '" + nom + "', descripcion = '"+
                 des + "', costo = '" + cos +"' WHERE codigo_medicamento = '" + codigoConsulta + "';";
        
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

    public Medicamento consultarDatosMedicamento(String cod_med) {
        
        String sql, validar;
        Medicamento medicamento = new Medicamento();
        
        
        validar = "SELECT codigo_medicamento FROM medicamentos WHERE codigo_medicamento = '" + cod_med + "';";
        
        sql = "SELECT codigo_medicamento, nombre_medicamento, costo, descripcion "
                + "FROM medicamentos WHERE codigo_medicamento = '" + cod_med + "';";
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while (consulta.next()) {
                
                validar = consulta.getString(1);
            }
            
            if (!validar.equals(cod_med)) {
                
                return null;
            }
            else {
                
                ResultSet consulta2 = sentencia.executeQuery(sql);
                
                while (consulta2.next()) {
                    
                    medicamento.setCodigo_medicamento(consulta2.getString(1));
                    medicamento.setNombre_medicamento(consulta2.getString(2));
                    medicamento.setCosto(Integer.parseInt(consulta2.getString(3)));
                    medicamento.setDescripcion(consulta2.getString(4));
                }
                
                medicamento.setCodigo_medicamento(validar);
                
                return medicamento;
            }
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            
            System.out.println("Error" + e);
        }
        return null;
    }

    public int eliminarMedicamento(String cod_med) {
        String sql;
        sql = "DELETE FROM medicamentos WHERE codigo_medicamento = '" + cod_med + "';";
        
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
  
    public ArrayList<String> llenarMedicamentos(){        
        ArrayList<String> lista = new ArrayList<String>();               
        String sql = "SELECT codigo_medicamento, nombre_medicamento FROM medicamentos;";
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
