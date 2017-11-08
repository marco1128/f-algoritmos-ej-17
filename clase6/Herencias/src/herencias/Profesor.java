/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author BVB09
 */
public class Profesor extends Persona {
    private double sueldo ;
    
    public Profesor (double s){
        super("Rene", "Elizalde", 34);
        setSueldo(s);
    }

    public Profesor(String n, String ap, int ed, double s) {
        super(n, ap, ed);
        setSueldo (s);
    }

    Profesor() {
      super("Rene", "Elizalde", 34);
                
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
