package Controladores;
import DAO.DaoMedicamento;
import Logica.Medicamento;
import java.util.ArrayList;

public class ControladorMedicamento {
    
    DaoMedicamento daoMedicamento ;
    
    public ControladorMedicamento(){
        daoMedicamento = new DaoMedicamento();
    }

    public int insertarMedicamento(String cod, String nom, String des, String pCosto) {
        
        Medicamento medicamento = new Medicamento();
        
        medicamento.setCodigo_medicamento(cod);
        medicamento.setNombre_medicamento(nom);
        medicamento.setCosto(Integer.parseInt(pCosto));
        medicamento.setDescripcion(des);
        
        return daoMedicamento.guardarMedicamento(medicamento);
    }

    public int comprobar(String codigoConsulta) {
        
        return daoMedicamento.comprobar(codigoConsulta);
 
    }

    public int actualizarMedicamento(String codigoConsulta, String nom, String cod, String des, String cos) {
       return daoMedicamento.actualizarMedicamento(codigoConsulta, nom, cod, des, cos);
    }

    public Medicamento consultarDatosMedicamento(String cod_med) {
        return daoMedicamento.consultarDatosMedicamento(cod_med);
    }

    public int eliminarMedicamento(String cod_med) {
        return daoMedicamento.eliminarMedicamento(cod_med);
    } 
    
    public int  insertarMedicamento(String codigo, String nombre, String descripcion, int costo){

        Medicamento medicamento = new Medicamento();
        medicamento.setCodigo_medicamento(codigo);
        medicamento.setNombre_medicamento(nombre);
        medicamento.setDescripcion(descripcion);
        medicamento.setCosto(costo);      
        
        int result = daoMedicamento.guardarMedicamento(medicamento);
        return result;
    }
    
    public ArrayList<String> llenarMedicamentos() {
        return daoMedicamento.llenarMedicamentos();
    }
    
}
