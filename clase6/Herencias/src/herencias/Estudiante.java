/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import EjemploUml.Asignatura_Presencial;

/**
 *
 * @author reroes
 */
public class Estudiante extends Persona{
    private Asignatura_Presencial asiganturas[];
    private double costo;
    
    public Estudiante(String n, String a, int e, Asignatura_Presencial asiganturas []){
        super(n, a, e);
        setAsiganturas (asiganturas);
       setCosto ();
    }

    public Asignatura_Presencial[] getAsiganturas() {
        return asiganturas;
    }

    public void setAsiganturas(Asignatura_Presencial[] asiganturas) {
        this.asiganturas = asiganturas;
    }

    public double getCosto() {
        return costo;
    }

    public double setCosto() {
        for (Asignatura_Presencial asigantura : asiganturas) {
        costo += asigantura.getCosto();
        }
        return costo;
    }
    
    
   
    @Override
    public void setEdad (int e){
        if (e < 18) {
            edad = 18;
        }else{
              edad= e;      
                    }
            
        }
    
    @Override
    public String toString(){
        String cadena ="";
        
        for (Asignatura_Presencial asigantura: this.asiganturas) {
            cadena += asigantura.toString();
        }
    
        return String.format("%s\n"
                + "Costo matricula: %.2f\n\n"
                + "Listado de Asignaturas\n"
                + "%s", super.toString(), getCosto(), cadena);
    
    }
    
    
    // @Override
    // public String toString(){
    
    //    return String.format("%s - %f", getApellido(), getMatricula());
    // }
}
