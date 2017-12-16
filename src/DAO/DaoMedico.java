package DAO;
import java.sql.*;
import Logica.*;
import Conexion.*;

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

    public int guardarMedico(Medico medico) {
        String sql_guardarMedico, validar, sql_guardarEmpleado, validar2, validar3;
        int numFilas;
        
        validar = "SELECT id_empleado FROM medicos WHERE id_empleado = '" + medico.getId_empleado()+ "';";
        validar3 = "SELECT id_empleado FROM medicos WHERE id_empleado = '" + medico.getId_jefe()+ "';";
        validar2 = "SELECT id_empleado FROM empleados WHERE id_empleado = '" + medico.getId_empleado()+ "';";
        sql_guardarMedico = "INSERT INTO medicos (id_empleado, numero_licencia, especialidad, universidad, contrasena) VALUES ('" 
                + medico.getId_empleado() + "', '" + medico.getNumero_licencia() + "', '" + medico.getEspecialidad() 
                + "', '" + medico.getUniversidad() + "', '" + medico.getContrasena() + "');" ;
        sql_guardarEmpleado = "INSERT INTO empleados (id_empleado, id_jefe, id_area, "
                + "nombre_empleado, direccion, telefono, salario, email, cargo) VALUES ('" + medico.getId_empleado() + "', '"
                + medico.getId_jefe() + "', '" + medico.getId_area() + "', '"
                + medico.getNombre_empleado() + "', '" + medico.getDireccion() + "', '"
                + medico.getTelefono() + "', " + medico.getSalario() + ", '"
                + medico.getEmail() + "', '" + medico.getCargo() + "')";
        
         try {
            
            Connection conn= conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            Statement sentencia2 = conn.createStatement();
            Statement sentencia3 = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            ResultSet consulta2 = sentencia2.executeQuery(validar2);
            ResultSet consulta3 = sentencia3.executeQuery(validar3);
            
            while(consulta.next()){
                
                validar = consulta.getString(1);
            }
            while(consulta2.next()){
                
                validar2 = consulta2.getString(1);
            }
            while(consulta3.next()){
                
                validar3 = consulta3.getString(1);
            }
            
            if(validar.equals(medico.getId_empleado())){
                
                return 3;
            }
            else if (validar2.equals(medico.getId_empleado())){
                return 3;
            }
            else if (!validar3.equals(medico.getId_jefe())){
                return 4;
            }
            else {
                int numFilas2 = numFilas = sentencia.executeUpdate(sql_guardarEmpleado);
                numFilas = sentencia.executeUpdate(sql_guardarMedico);
                return numFilas + numFilas2;
            }
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            
            System.out.println("Error" + e);
        }
        
        return -1;
        
    }
    
    
    
}




