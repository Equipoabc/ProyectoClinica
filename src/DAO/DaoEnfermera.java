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
    
}
