/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comprobacion;
import clientesdb.GestorDB;
import java.util.ArrayList;
/**
 *
 * @author alumno
 */
public class Comprobar {
    
    public static boolean comprobarCampo(String nombreCampo, String dato){
        
        switch(nombreCampo){
            case "NIF":
                return dato.matches("[0-9]{8}");
            case "Nombre":
                if(dato.length()<=15)
                    return dato.matches("[a-zA-ZáÁéÉíÍóÓúÚüÜñÑ.\\s]*");
            case "Apellidos":
                if(dato.length()<=35)
                    return dato.matches("[a-zA-ZáÁéÉíÍóÓúÚüÜñÑ.\\s-]*");
            case "Domicilio":
                if(dato.length()<=40)
                    return dato.matches("[0-9a-zA-ZáÁéÉíÍóÓúÚüÜñÑ.\\sºª/,-]*");
            case "CP":
                return dato.matches("[0-9]{5}");
            case "Localidad":
                if(dato.length()<=20)
                    return dato.matches("[a-zA-ZáÁéÉíÍóÓúÚüÜñÑ.\\s-]*");
            case "Tel":
                return dato.matches("[0-9]{9}");
            case "Email":
                if(dato.length()<=20)
                    return dato.matches("[0-9a-zA-Z.-]*@[0-9a-zA-Z.-]*");
        }
        return false;
        
    }
    
    public static boolean comprobarCod(String codigo, int estado){
        
        GestorDB db = new GestorDB();
        ArrayList<String> consulta = new ArrayList();
        boolean res = false;
        
        switch(estado){
            case 0:
                consulta = db.getCodigos();
                res = true;
                for(int i = 0; i < consulta.size(); i++){
                    if(codigo.equals(consulta.get(i)))
                        res = false;
                }
                return res;
            case 1:
                return res;
            case 2:
                return res;
            case 3:
                return res;
            
        }
        return res;
        
    }
    
    
}
