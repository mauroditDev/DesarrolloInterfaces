/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventaDeOrdenadores;

/**
 *
 * @author alumno
 */
public class Venta {
    private String nombre;
    private int[] opciones;
    private boolean[] checks;
    private int localidad;
    
    public Venta(){
        nombre = "";
        opciones = new int[4];
        checks = new boolean[4];
        localidad = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getOpciones() {
        return opciones;
    }

    public int getOpciones(int i) {
        return opciones[i];
    }
    
    public void setOpciones(int[] opciones) {
        this.opciones = opciones;
    }

    public boolean[] getChecks() {
        return checks;
    }
    
    public boolean getChecks(int i) {
        return checks[i];
    }

    public void setChecks(boolean[] checks) {
        this.checks = checks;
    }
    
    public void setLocalidad(int localidad){
        this.localidad = localidad;
    }
    
    public int getLocalidad(){
        return this.localidad;
    }
    
    
}
