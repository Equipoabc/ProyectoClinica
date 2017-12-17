package DAO;
import Conexion.Conexiones;
import Logica.*;
import java.sql.*;

public class DaoEnfermera {
    Conexiones conexion;
    
    public DaoEnfermera(){
        conexion = Main.conexion;
        
    }

    public int guardarEnfermera(Enfermera enfermera) {
        String sql_guardarEnfermera, validar, sql_guardarEmpleado, validar2, validar3;
        int numFilas;
        
        validar = "SELECT id_empleado FROM enfermeras WHERE id_empleado = '" + enfermera.getId_empleado()+ "';";
        validar2 = "SELECT id_empleado FROM empleados WHERE id_empleado = '" + enfermera.getId_empleado()+ "';";
        validar3 = "SELECT id_empleado FROM empleados WHERE id_empleado = '" + enfermera.getId_jefe()+ "';";
        sql_guardarEnfermera = "INSERT INTO enfermeras (id_empleado, anos_experiencia) VALUES ('" + enfermera.getId_empleado() + "', " 
                + enfermera.getAnos_experiencia() + ");" ;
        sql_guardarEmpleado = "INSERT INTO empleados (id_empleado, id_jefe, id_area, "
                + "nombre_empleado, direccion, telefono, salario, email, cargo) VALUES ('" + enfermera.getId_empleado() + "', '"
                + enfermera.getId_jefe() + "', '" + enfermera.getId_area() + "', '"
                + enfermera.getNombre_empleado() + "', '" + enfermera.getDireccion() + "', '"
                + enfermera.getTelefono() + "', " + enfermera.getSalario() + ", '"
                + enfermera.getEmail() + "', '" + enfermera.getCargo() + "')";
        
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
            
            if(validar.equals(enfermera.getId_empleado())){
                
                return 3;
            }
            else if (validar2.equals(enfermera.getId_empleado())){
                return 3;
            }
            else if (!validar3.equals(enfermera.getId_jefe())){
                return 4;
            }
            else {
                int numFilas2 = numFilas = sentencia.executeUpdate(sql_guardarEmpleado);
                numFilas = sentencia.executeUpdate(sql_guardarEnfermera);
                return numFilas + numFilas2;
            }
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            
            System.out.println("Error" + e);
        }
        
        return -1;
        
    }

    public Enfermera consultarDatosEnfermera(String cedulaConsulta) {
        String sqlEnfermeras, validar, sqlEmpleado, validar2;
        Enfermera enfermera = new Enfermera();
        
        validar2 = "SELECT id_empleado FROM empleados WHERE id_empleado = '" + cedulaConsulta + "';";
        validar = "SELECT id_empleado FROM enfermeras WHERE id_empleado = '" + cedulaConsulta + "';";
        sqlEnfermeras = "SELECT id_empleado, anos_experiencia FROM enfermeras WHERE id_empleado = '" + cedulaConsulta + "';";
        sqlEmpleado = "SELECT id_jefe, id_area, nombre_empleado, direccion, telefono, salario,"
                + "email, cargo FROM empleados WHERE id_empleado = '" + cedulaConsulta + "';";
       
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
            
            if (!validar.equals(cedulaConsulta)) {
                
                return null;
            }
            else if (!validar2.equals(cedulaConsulta)) {
                return null;
            }
            else {
                ResultSet consulta3 = sentencia.executeQuery(sqlEnfermeras);
                
                while (consulta3.next()) {
                    
                    enfermera.setId_empleado(consulta3.getString(1));
                    enfermera.setAnos_experiencia(consulta3.getInt(2));
                }
                ResultSet consulta4 = sentencia.executeQuery(sqlEmpleado);
                
                while (consulta4.next()) {
                    
                    enfermera.setId_jefe(consulta4.getString(1));
                    enfermera.setId_area(consulta4.getString(2));
                    enfermera.setNombre_empleado(consulta4.getString(3));
                    enfermera.setDireccion(consulta4.getString(4));
                    enfermera.setTelefono(consulta4.getString(5));
                    enfermera.setSalario(consulta4.getInt(6));
                    enfermera.setEmail(consulta4.getString(7));
                    enfermera.setCargo(consulta4.getString(8));
                }
                
                return enfermera;
            }
            
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            
            System.out.println("Error" + e);
        }
        
        return null;
    }

    public int actualizarEnfermera(String id_empleado, String id_jefe, String id_area, String nombre_empleado, 
            String direccion, String telefono, String sal, String email, String car, String an) {
        
        String sql_guardar, sql_guardar2, validar;
        validar = "SELECT id_empleado FROM empleados WHERE id_empleado = '" + id_jefe + "';";
        sql_guardar = "UPDATE empleados SET id_jefe = '" + id_jefe + "', id_area = '" + id_area + "', nombre_empleado = '"
            + nombre_empleado + "', direccion = '" + direccion + "', telefono = '" + telefono + 
            "', salario = " + sal + ", email = '" + email + "', cargo = '" + car
            + "' WHERE id_empleado = '" + id_empleado + "';";
        
        sql_guardar2 = "UPDATE enfermeras SET anos_experiencia = " + an + "WHERE id_empleado = '" + id_empleado + "';";

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
            e.printStackTrace();
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return -1;
    }
    
    
}
