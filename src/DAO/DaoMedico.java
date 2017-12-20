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
        String sqlMedicos, validar, sqlEmpleado, validar2;
        Medico medico = new Medico();
        
        validar2 = "SELECT id_empleado FROM empleados WHERE id_empleado = '" + user + "';";
        validar = "SELECT id_empleado FROM medicos WHERE id_empleado = '" + user + "';";
        sqlMedicos = "SELECT id_empleado, numero_licencia, especialidad, universidad,"
                + " contrasena FROM medicos WHERE id_empleado = '" + user + "';";
        sqlEmpleado = "SELECT id_jefe, id_area, nombre_empleado, direccion, telefono, salario,"
                + "email, cargo FROM empleados WHERE id_empleado = '" + user + "';";
       
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            Statement sentencia2 = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            ResultSet consulta2 = sentencia2.executeQuery(validar2);
            
            while (consulta.next()) {
                
                validar = consulta.getString(1);
            }
            while (consulta2.next()) {
                
                validar2 = consulta2.getString(1);
            }
            
            if (!validar.equals(user)) {
                
                return null;
            }
            else if (!validar2.equals(user)) {
                return null;
            }
            else {
                ResultSet consulta3 = sentencia.executeQuery(sqlMedicos);
                
                while (consulta3.next()) {
                    
                    medico.setId_empleado(consulta3.getString(1));
                    medico.setNumero_licencia(consulta3.getString(2));
                    medico.setEspecialidad(consulta3.getString(3));
                    medico.setUniversidad(consulta3.getString(4));
                    medico.setContrasena(consulta3.getString(5));
                }
                
                ResultSet consulta4 = sentencia.executeQuery(sqlEmpleado);
                
                while (consulta4.next()) {
                    
                    medico.setId_jefe(consulta4.getString(1));
                    medico.setId_area(consulta4.getString(2));
                    medico.setNombre_empleado(consulta4.getString(3));
                    medico.setDireccion(consulta4.getString(4));
                    medico.setTelefono(consulta4.getString(5));
                    medico.setSalario(consulta4.getInt(6));
                    medico.setEmail(consulta4.getString(7));
                    medico.setCargo(consulta4.getString(8));
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
                int numFilas2 = sentencia.executeUpdate(sql_guardarEmpleado);
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

    public int actualizarMedico(String id_empleado, String id_jefe, String id_area, String nombre_empleado,
            String direccion, String telefono, String sal, String email, String car, String numLi, String espe, 
            String uni, String contrasena) {
        
          String sql_guardar, sql_guardar2, validar;
        validar = "SELECT id_empleado FROM medicos WHERE id_empleado = '" + id_jefe + "';";
        sql_guardar = "UPDATE empleados SET id_jefe = '" + id_jefe + "', id_area = '" + id_area + "', nombre_empleado = '"
            + nombre_empleado + "', direccion = '" + direccion + "', telefono = '" + telefono + 
            "', salario = " + sal + ", email = '" + email + "', cargo = '" + car
            + "' WHERE id_empleado = '" + id_empleado + "';";
        
        sql_guardar2 = "UPDATE medicos SET numero_licencia = '" + numLi + "', especialidad = '" + espe + 
            "', universidad = '" + uni + "', contrasena = '" + contrasena + "' WHERE id_empleado = '" + id_empleado + "';";
        System.out.println(sql_guardar2);

        try {

            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);

            while (consulta.next()) {

                validar = consulta.getString(1);
            }
               
            if(!validar.equals(id_jefe)){
                    
                return 4;
            }
            else {
                    
                int resultado = sentencia.executeUpdate(sql_guardar);
                int resultado2 = sentencia.executeUpdate(sql_guardar2);
                return resultado + resultado2;
            }               
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return -1;
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
        }
        catch(SQLException e){
            
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            System.out.println("Error" + e);
        }
        
        return lista;
    }     
     public String seleccionMedico(String id_medico){
        String sql = "SELECT id_empleado, nombre_empleado FROM empleados WHERE id_empleado = '" + id_medico + "';";
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

}




