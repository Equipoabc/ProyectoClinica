package DAO;
import java.sql.*;
import Logica.*;
import Conexion.*;
import java.util.ArrayList;

public class DaoMedico {
    Conexiones conexion;
    
    public DaoMedico(){
        conexion = Main.conexion;
    }

    public Medico consultarDatosMedico(String user) {
        String sqlMedicos, sqlEmpleados, validar;
        Medico medico = new Medico();
        
        validar = "SELECT id_empleado FROM medicos WHERE id_empleado = '" + user + "';";
        sqlMedicos = "SELECT id_empleado, numero_licencia, especialidad, universidad,"
                + " contrasena FROM medicos WHERE id_empleado = '" + user + "';";
        
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while (consulta.next()) {
                
                validar = consulta.getString(1);
            }
            
            if (!validar.equals(user)) {
                
                return null;
            } else {
                
                ResultSet consulta2 = sentencia.executeQuery(sqlMedicos);
                
                while (consulta2.next()) {
                    
                    medico.setId_empleado(consulta2.getString(1));
                    medico.setNumero_licencia(consulta2.getString(2));
                    medico.setEspecialidad(consulta2.getString(3));
                    medico.setUniversidad(consulta2.getString(4));
                    medico.setContrasena(consulta2.getString(5));
                }
                
                return medico;
            }
            
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            
            System.out.println("Error" + e);
        }
        
        return null;
    }
    public ArrayList<String> llenarCombo(){
        
        ArrayList<String> lista = new ArrayList<String>();
        String sql = "SELECT id_empleado, nombre_empleado FROM empleados;";                
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




