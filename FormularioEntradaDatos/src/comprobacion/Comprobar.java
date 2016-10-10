/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comprobacion;

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
    
    
}

