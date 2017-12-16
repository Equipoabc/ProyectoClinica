
package Logica;

public class Validaciones {
    
     public Validaciones(){
        
    }
    
    public boolean validarLetrasYNumeros(String str){
       
        if (str.matches("[A-Za-z0-9]*"))
            return true;
        else
            return false;
    }
    
     public boolean validarLetras(String str){
       
        if (str.matches("[A-Za-z]*"))
            return true;
        else
            return false;
    }
    
    public boolean validarNumero(String str){
       
        if (str.matches("[0-9]*"))
            return true;
        else
            return false;
    }
    
    public boolean validarLetrasEspacios(String str){
       
        if (str.matches("[A-Za-z ]*"))
            return true;
        else
            return false;
    }
    
    public boolean validarLetrasYNumerosEspacios(String str){
       
        if (str.matches("[A-Za-z0-9 ]*"))
            return true;
        else
            return false;
    }
    
     public boolean validarLetrasYNumerosEspaciosSimbolos(String str){
       
        if (str.matches("[A-Za-z0-9 .-]*"))
            return true;
        else
            return false;
    }
    
}
