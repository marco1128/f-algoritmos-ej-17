/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2;


/**
 *
 * @author BVB09
 */
public class Asignatura {
    private String nombre;
    private int creditos;
    private Carrera carrera;
    
    public Asignatura(Carrera carrera){
        this.nombre = "Informatica";
        this.creditos= 5;
        this.carrera = carrera;
        
    }
    public String obtener_nombre(){
        return nombre;
    }
    public void agregar_creditos(int n){
        creditos= n;
    }
    public int obtener_creditos (){
        return creditos;
    }
    public void agregar_carrera (Carrera carrera){
        this.carrera= carrera;
    }
    public Carrera obtener_carrera(){
        return carrera;
    }
    @Override
    public String toString (){
        return String.format("Asignatura\n"
                + "Nombre: %s\n"
                + "Creditos: %d\n"
                + "Carrera: %s\n"
                + "Modalidad: %s",obtener_nombre(), obtener_creditos(),obtener_carrera().obtener_modalidad(), obtener_carrera().obtener_nombre());
    }
}
