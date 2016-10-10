/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author alumno
 */
public class Operaciones {
    
    public Operaciones(){
        this.operando1 = 0;
        this.operando2 = 0;
    }
    
    public double multiply(){
        return this.operando1 * this.operando2;
    }
    
    public double divide(){
        return this.operando1 / this.operando2;
    }
    
    public double sum(){
        return this.operando1 + this.operando2;
    }
    
    public double minus(){
        return this.operando1 - this.operando2;
    }
    
    private double operando1;
    private double operando2;

    public double getOperando1() {
        return operando1;
    }

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public double getOperando2() {
        return operando2;
    }

    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }
    
    
    
}
