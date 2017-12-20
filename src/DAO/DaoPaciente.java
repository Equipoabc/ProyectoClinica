package DAO;
import Conexion.Conexiones;
import Logica.*;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DaoPaciente {

    Conexiones conexion;
    
    public DaoPaciente(){
        
        conexion = Main.conexion;
    }    
    
    public int crearPaciente(String nombre, String cedula, String fechaNacimiento, String telefono, String direc, String numero_seguro, String act_economica) {
        
        String sql_guardar, validar;
        int resultado;
        
        validar = "SELECT id_paciente FROM Pacientes WHERE id_paciente = '" + cedula + "';";
        sql_guardar = "INSERT INTO Pacientes (nombre_paciente, id_paciente, direccion, telefono, numero_seguro, actividad_economica, fecha_nacimiento) "
                + "VALUES ('" + nombre + "', '" + cedula + "', '" +
                direc + "', '" + telefono +  "', '" +
                numero_seguro +  "', '" + act_economica + "', '" + fechaNacimiento +  "')";
        
        try {            
            Connection conn= conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while(consulta.next()){
                
                validar = consulta.getString(1);
            }
             
            if(validar.equals(cedula)){
                
                return 2;
            }            
            else {
                
                resultado = sentencia.executeUpdate(sql_guardar);
                return resultado;
            }            
        } catch(SQLException e){            
            System.out.println("SQL error: " + e);
        } catch(Exception e){            
            System.out.println("Error" + e);
        }
        
        return -1;
    }   

    public Paciente consultarDatosPaciente(String cedula) {
       
        String sql, validar;
        Paciente paciente = new Paciente();
        
        validar = "SELECT id_paciente FROM Pacientes WHERE id_paciente = '" + cedula + "';";
        sql = "SELECT nombre_paciente, actividad_economica, direccion, telefono,"
                + " numero_seguro FROM Pacientes WHERE id_paciente = '" + cedula + "';";
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while (consulta.next()){
                
                validar = consulta.getString(1);
            }
            
            if (!validar.equals(cedula)){
                
                return null;
            }
            else {
                
                ResultSet consulta2 = sentencia.executeQuery(sql);
                
                while (consulta2.next()) {
                    
                    paciente.setNombre_paciente(consulta2.getString(1));
                    paciente.setActividad_economica(consulta2.getString(2));
                    paciente.setDireccion(consulta2.getString(3));
                    paciente.setTelefono(consulta2.getString(4));
                    paciente.setNumero_seguro(consulta2.getString(5));                    
                }
               
                paciente.setId_paciente(validar);
                
                return paciente;
            }
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {            
            System.out.println("Error" + e);
        }
        
        return null;
    }

    public int comprobar(String cedula) {
        
        String sql;
        sql = "SELECT id_paciente FROM Pacientes WHERE id_paciente = '" + cedula + "';";

        try {

            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);

            while (consulta.next()) {

                sql = consulta.getString(1);
            }

            if (sql.equals(cedula)) {

                return 1;
            }
            
            return 0;

        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return 0;
    }

    public int actualizarPaciente(String cedula, String nombre, String telefono, String act, String direccion, 
            String numero) {
        
        String sql_guardar, validar;
        validar = "SELECT id_paciente FROM Pacientes WHERE id_paciente = '" + cedula + "';";
        sql_guardar = "UPDATE Pacientes SET nombre_paciente = '"
            + nombre + "', direccion = '" + direccion + "', telefono = '"
            + telefono + "', numero_seguro = '" + numero + "', actividad_economica = '"
            + act + "' WHERE id_paciente = '" + cedula + "';";

        try {

            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);

            while (consulta.next()) {

                validar = consulta.getString(1);
            }
                
            if(!validar.equals(cedula)){
                    
                return 2;
            }
            else {
                    
                int resultado = sentencia.executeUpdate(sql_guardar);
                return resultado;
            }               
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return -1;
    }

    public void consultarGastosPacientesMensual(String datoM, String datoA, DefaultTableModel modelo, JTable tabla) {
        
        String sql, fechaI, fechaF, sql2;
        
        fechaI = datoA + "-" + datoM + "-01";
        if(datoM.equals("01") || datoM.equals("03") || datoM.equals("05") || datoM.equals("07") || datoM.equals("08")
                || datoM.equals("10") || datoM.equals("12")){
            
            fechaF = datoA + "-" + datoM + "-31";
        }
        else if(datoM.equals("02")){
            
            fechaF = datoA + "-" + datoM + "-28";
        }
        else {
            
           fechaF = datoA + "-" + datoM + "-30"; 
        }
        
        sql = "SELECT pacientes.id_paciente, pacientes.nombre_paciente, AVG(citas.precio) " 
                + "FROM citas NATURAL JOIN pacientes " 
                + "WHERE citas.fecha BETWEEN '" +  fechaI + "' AND '" + fechaF + "' GROUP BY pacientes.id_paciente, pacientes.nombre_paciente;";
                
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            Object fila[] = new Object[4];
            
            while(consulta.next()){
                
                for (int i = 0; i < 3; i++){
                    
                    fila[i] = consulta.getObject(i + 1);
                }
                
                sql2 = "SELECT AVG(costo) " +
                    "FROM pacientes NATURAL JOIN historias_clinicas NATURAL JOIN registros NATURAL JOIN formulas_medicas NATURAL JOIN formulas_medicas_medicamentos NATURAL JOIN Medicamentos " +
                    "WHERE registros.fecha_consulta BETWEEN '" + fechaI + "' AND '" + fechaF + "' AND id_paciente = '" + fila[0] + 
                    "' GROUP BY nombre_paciente;";
                
                Statement sentencia2 = con.createStatement();
                ResultSet consulta2 = sentencia2.executeQuery(sql2);
                
                while(consulta2.next()){
                
                    fila[3] = consulta2.getObject(1);
                }
                
                modelo.addRow(fila);
            }
            
            tabla.updateUI();
            
        } catch(SQLException e){            
            System.out.println("SQL error: " + e);
        } catch(Exception e){            
            System.out.println("Error: " + e);
        }
    }

    public void consultarGastosPacientesAnual(String datoA, DefaultTableModel modelo, JTable tabla) {
        
        String sql, fechaI, fechaF, sql2;
        
        fechaI = datoA + "-01-01";
        fechaF = datoA + "-12-31";
        
        sql = "SELECT pacientes.id_paciente, pacientes.nombre_paciente, AVG(citas.precio) " 
                + "FROM citas NATURAL JOIN pacientes " 
                + "WHERE citas.fecha BETWEEN '" +  fechaI + "' AND '" + fechaF + "' GROUP BY pacientes.id_paciente, pacientes.nombre_paciente;";
                
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            Object fila[] = new Object[4];
            
            while(consulta.next()){
                
                for (int i = 0; i < 3; i++){
                    
                    fila[i] = consulta.getObject(i + 1);
                }
                
                sql2 = "SELECT AVG(costo) " +
                    "FROM pacientes NATURAL JOIN historias_clinicas NATURAL JOIN registros NATURAL JOIN formulas_medicas NATURAL JOIN formulas_medicas_medicamentos NATURAL JOIN Medicamentos " +
                    "WHERE registros.fecha_consulta BETWEEN '" + fechaI + "' AND '" + fechaF + "' AND id_paciente = '" + fila[0] + 
                    "' GROUP BY nombre_paciente;";
                
                Statement sentencia2 = con.createStatement();
                ResultSet consulta2 = sentencia2.executeQuery(sql2);
                
                while(consulta2.next()){
                
                    fila[3] = consulta2.getObject(1);
                }
                
                modelo.addRow(fila);
            }
            
            tabla.updateUI();
            
        } catch(SQLException e){            
            System.out.println("SQL error: " + e);
        } catch(Exception e){            
            System.out.println("Error: " + e);
        }
    }

    public void consultarGastosPacienteMensual(String cedula, String datoM, String datoA, DefaultTableModel modelo, JTable tabla) {
        
        String sql, fechaI, fechaF, sql2;
        
        fechaI = datoA + "-" + datoM + "-01";
        if(datoM.equals("01") || datoM.equals("03") || datoM.equals("05") || datoM.equals("07") || datoM.equals("08")
                || datoM.equals("10") || datoM.equals("12")){
            
            fechaF = datoA + "-" + datoM + "-31";
        }
        else if(datoM.equals("02")){
            
            fechaF = datoA + "-" + datoM + "-28";
        }
        else {
            
           fechaF = datoA + "-" + datoM + "-30"; 
        }
        
        sql = "SELECT pacientes.id_paciente, pacientes.nombre_paciente, AVG(citas.precio) " 
                + "FROM citas NATURAL JOIN pacientes " 
                + "WHERE citas.fecha BETWEEN '" +  fechaI + "' AND '" + fechaF + "' AND id_paciente = '" + cedula +
                "' GROUP BY pacientes.id_paciente, pacientes.nombre_paciente;";
                
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            Object fila[] = new Object[4];
            
            while(consulta.next()){
                
                for (int i = 0; i < 3; i++){
                    
                    fila[i] = consulta.getObject(i + 1);
                }
                
                sql2 = "SELECT AVG(costo) " +
                    "FROM pacientes NATURAL JOIN historias_clinicas NATURAL JOIN registros NATURAL JOIN formulas_medicas NATURAL JOIN formulas_medicas_medicamentos NATURAL JOIN Medicamentos " +
                    "WHERE registros.fecha_consulta BETWEEN '" + fechaI + "' AND '" + fechaF + "' AND id_paciente = '" + fila[0] + 
                    "' GROUP BY nombre_paciente;";
                
                Statement sentencia2 = con.createStatement();
                ResultSet consulta2 = sentencia2.executeQuery(sql2);
                
                while(consulta2.next()){
                
                    fila[3] = consulta2.getObject(1);
                }
                
                modelo.addRow(fila);
            }
            
            tabla.updateUI();
            
        } catch(SQLException e){            
            System.out.println("SQL error: " + e);
        } catch(Exception e){            
            System.out.println("Error: " + e);
        }
    }

    public void consultarGastosPacienteAnual(String cedula, String datoA, DefaultTableModel modelo, JTable tabla) {
        
        String sql, fechaI, fechaF, sql2;
        
        fechaI = datoA + "-01-01";
        fechaF = datoA + "-12-31";
        
        sql = "SELECT pacientes.id_paciente, pacientes.nombre_paciente, AVG(citas.precio) " 
            + "FROM citas NATURAL JOIN pacientes " 
            + "WHERE citas.fecha BETWEEN '" +  fechaI + "' AND '" + fechaF + "' AND id_paciente = '" + cedula +
            "' GROUP BY pacientes.id_paciente, pacientes.nombre_paciente;";      
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            Object fila[] = new Object[4];
            
            while(consulta.next()){
                
                for (int i = 0; i < 3; i++){
                    
                    fila[i] = consulta.getObject(i + 1);
                }
                
                sql2 = "SELECT AVG(costo) " +
                    "FROM pacientes NATURAL JOIN historias_clinicas NATURAL JOIN registros NATURAL JOIN formulas_medicas NATURAL JOIN formulas_medicas_medicamentos NATURAL JOIN Medicamentos " +
                    "WHERE registros.fecha_consulta BETWEEN '" + fechaI + "' AND '" + fechaF + "' AND id_paciente = '" + fila[0] + 
                    "' GROUP BY nombre_paciente;";
                
                Statement sentencia2 = con.createStatement();
                ResultSet consulta2 = sentencia2.executeQuery(sql2);
                
                while(consulta2.next()){
                
                    fila[3] = consulta2.getObject(1);
                }
                
                modelo.addRow(fila);
            }
            
            tabla.updateUI();
            
        } catch(SQLException e){            
            System.out.println("SQL error: " + e);
        } catch(Exception e){            
            System.out.println("Error: " + e);
        }    
    }
}
